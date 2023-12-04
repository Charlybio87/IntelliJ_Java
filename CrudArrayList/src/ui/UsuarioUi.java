package ui;

import models.Usuario;
import service.UsuarioService;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioUi {

    //Crear una Instancia de la Clase UsuarioService,
    // la asigna a la variable usuarioService
    UsuarioService usuarioService = new UsuarioService();
    //Declaracion y creacion arrayList misUsuarios que contiene
    // objetos de la clase Usuario
    private ArrayList<Usuario> misUsuarios = new ArrayList<>();

    public UsuarioUi(){
        int opcion;
        int i = 0;
    //Bucle de menu interactivo para Gestión de Usuarios
        while(true) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    """
                            1. Carga Usuario
                            2. Modificar Usuario
                            3. Eliminar Usuario
                            4. Mostrar Lista de Usuario
                            5. Buscar Usuario
                            6. Salir
                            """,
                    "Gestión de Usuarios",1));

            switch (opcion) {
                case 1:
                    int id = i++;
                    cargarUsuario(id);
                    break;
                case 2:
                    modificarUsuario();
                    break;
                case 3:
                    eliminarUsuario();
                    break;
                case 4:
                    mostrarListaUsuario();
                    break;
                case 5:
                    buscarUsuario();
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 7:
                    cargaPrevia();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                        "Opcion invalida",
                        "Error",JOptionPane.ERROR_MESSAGE,null);
            }
        }
    }//Belen

                                    /*"1. Carga Usuario"*/
    public void cargarUsuario(int id){
        //inicializacion de variables
        boolean validar = false;
        String nombre = null;
        Date fechaAlt = new Date();
        Date fechaMod = new Date();
        String fechaNacimiento = null;
        String contrasena = null ;
        // Ciclos de Validacion
        while(!validar) {
            nombre = JOptionPane.showInputDialog(
                "Ingrese Usuario",
                "Ingrese");
            validar = usuarioService.validarNombre(nombre);
        }

        validar = false;
        while(!validar) {
            fechaNacimiento = JOptionPane.showInputDialog(
                "Ingrese la fecha de nacimiento (dd/MM/yyyy):",
                "Ingrese");
            validar = usuarioService.validarFecNac(fechaNacimiento);
        }

        /*validar = false;
        while (!validar) {
            JPasswordField passwordField = new JPasswordField();
            int result = JOptionPane.showConfirmDialog(
                    null, passwordField,
                    "Ingrese Contraseña", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                contrasena = passwordField.getPassword();
                validar = usuarioService.validarPassword(new String(contrasena));
            } else {
                // El usuario canceló la operación, puedes manejarlo según tus necesidades.
                return;
            }
        }*/
        validar = false;
        while(!validar) {
            contrasena = JOptionPane.showInputDialog(
                "Ingrese Contraseña",
                "Ingrese");
            validar = usuarioService.validarPassword(contrasena);
        }

        JOptionPane.showMessageDialog(
            null,
            "El Usuario fue creado exitosamente.");

        Usuario usua = new Usuario(id +1000,nombre,fechaAlt,
            fechaMod,fechaNacimiento,contrasena);
        misUsuarios.add(usua);
    }//Charly

                                    /*"2. Modificar Usuario"*/
    public void modificarUsuario(){
        Date fechaMod = new Date();
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición que desea modificar:"));
        //posicion = posicion - 1;
        System.out.println(misUsuarios.get(posicion));
        Usuario usuarioModificar = misUsuarios.get(posicion);
        usuarioModificar.setNombre(JOptionPane.showInputDialog("Ingrese nuevo nombre: "));
        usuarioModificar.setFechaNacimiento(JOptionPane.showInputDialog("Ingrese nuevo fecha de nacimiento: "));
        usuarioModificar.setContrasena(JOptionPane.showInputDialog("Ingrese nuevo contraseña: "));
        usuarioModificar.setFechaModificacion(fechaMod);
        JOptionPane.showMessageDialog(null,misUsuarios.get(posicion));
    }//Sole

                                    /*"3. Eliminar Usuario"*/
    public void eliminarUsuario(){
        int cont = 0;
        String usuarioElim = (JOptionPane.showInputDialog(
                null,
                "Ingrese nombre de usuario a Eliminar: "));
        for (Usuario eliminarUsuario : misUsuarios) {
            if (eliminarUsuario.getNombre().equalsIgnoreCase(usuarioElim)) {
                JOptionPane.showMessageDialog(
                        null, eliminarUsuario);
                JOptionPane.showConfirmDialog(null,
                        "Esta seguro que desea eliminarlo?");
                misUsuarios.remove(cont);
                JOptionPane.showMessageDialog(
                        null,
                        usuarioElim+" fue eliminado exitosamente.");
                break;
            } else {
                cont = cont + 1;
            }
        }
        if (cont == misUsuarios.size()){
            JOptionPane.showMessageDialog(
                    null,"El usuario " +
                    usuarioElim+" no se encuentra en la lista.");
        }
    }//Albert

                                    /*"4. Mostrar Lista de Usuario"*/
    public void mostrarListaUsuario(){
        String lista = "Lista de Usuarios: ";
        for (Usuario usuario : misUsuarios) {
            lista = lista + usuario.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null,lista);
    }//Lujan

                                    /*"5. Buscar Usuario"*/
    public void buscarUsuario(){
        String usuariobuscado;
        int cont = 0;
        usuariobuscado = JOptionPane.showInputDialog(
            null,
            "Ingrese Usuario: ");
        /*usuarioService.validarBuscar(cont,usuariobuscado);*/
        for (Usuario buscarUsuario : misUsuarios) {
            if (buscarUsuario.getNombre().equalsIgnoreCase(usuariobuscado)) {
                JOptionPane.showMessageDialog(
                    null, buscarUsuario);
                JOptionPane.showMessageDialog(
                    null,
                    "El Usuario fue encontrado exitosamente.");
            } else {
                cont = cont + 1;
            }
        }
        if (cont == misUsuarios.size()){
            JOptionPane.showMessageDialog(
                null,
                usuariobuscado+" no se encuentra en la lista.");
        }
    }//Yamil

                                    /*"7. Carga Previa"*/
    public void cargaPrevia(){
        Usuario u;
        int i;
        String fNacimiento = "01/01/2023";
        Date fAlta = new Date();
        Date fModificado = new Date();
        for (i=0; i<10; i++){
            u = new Usuario(990+i,"Usuario"+i,
            fAlta,fModificado,fNacimiento,"password "+i);
            misUsuarios.add(u);
        }
    }
}
