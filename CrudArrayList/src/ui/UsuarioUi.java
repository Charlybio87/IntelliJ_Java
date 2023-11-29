package ui;

import models.Usuario;
import service.UsuarioService;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioUi {

    //Crear una Instancia de la Clase UsuarioService, la asigna a la variable usuarioService
    UsuarioService usuarioService = new UsuarioService();
    //Declaracion y creacion arrayList misUsuarios que contiene objetos de la clase Usuario
    private ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();

    public UsuarioUi(){
        int opcion;
        int i = 0;
    //Bucle de menu interactivo para Gestión de Usuarios
        while(true) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Gestión Usuario: " + "\n" +
                            "1. Carga Usuario" + "\n" +
                            "2. Modificar Usuario" + "\n" +
                            "3. Eliminar Usuario" + "\n" +
                            "4. Mostrar Lista de Usuario" + "\n" +
                            "5. Buscar Usuario" + "\n" +
                            "6. Salir" + "\n"
            ));

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
        //inicializacion de cariables
        boolean validar = false;
        int iD = id;
        String nombre = null;
        Date fechaAlt = new Date();
        Date fechaMod = new Date();
        String fechaNacimiento = null;
        String contrasena =null ;
    // Ciclos de Validacion
        while(!validar) {
            nombre = JOptionPane.showInputDialog("Ingrese Usuario",
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

        validar = false;
        while(!validar) {
            contrasena = JOptionPane.showInputDialog("Ingrese Contraseña",
                    "Ingrese");
            validar = usuarioService.validarPassword(contrasena);
        }

        JOptionPane.showMessageDialog(null,
                "El Usuario fue creado exitosamente.");

        Usuario usua = new Usuario(iD+1000,nombre,fechaAlt,
                fechaMod,fechaNacimiento,contrasena);
        misUsuarios.add(usua);


    }//Charly

    public void mostrarListaUsuario(){
        String lista = "Lista de Usuarios: ";

        for (Usuario usuario : misUsuarios) {
            lista = lista + usuario.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null,lista);
    }//Lujan

    public void eliminarUsuario(){

        int usuarioElim = Integer.parseInt(JOptionPane.showInputDialog("Posicion de usuario a eliminar"));
        misUsuarios.get(usuarioElim);
        //usuarioElim = usuarioElim - 1; //correccion de posicion de arreglo
        JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar?");
        misUsuarios.remove(usuarioElim);

    }//Albert

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

    public void buscarUsuario(){
        String usuariobuscado;
        int cont = 0;
        usuariobuscado = JOptionPane.showInputDialog(null,"Ingrese Usuario: ");
        /*usuarioService.validarBuscar(cont,usuariobuscado);*/
        for (Usuario buscarUsuario : misUsuarios) {
            if (buscarUsuario.getNombre().equalsIgnoreCase(usuariobuscado)) {
                JOptionPane.showMessageDialog(null, buscarUsuario);
                JOptionPane.showMessageDialog(null,
                        "El Usuario fue encontrado exitosamente.");
            } else {
            cont= cont + 1;
            }
        }
        if (cont == misUsuarios.size()){
            JOptionPane.showMessageDialog(null,
                    usuariobuscado+" no se encuentra en la lista.");
        }
    }

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
