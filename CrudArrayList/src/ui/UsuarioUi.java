package ui;

import models.Usuario;
import service.UsuarioService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioUi {
    UsuarioService usuarioService = new UsuarioService();
    private ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();

    public UsuarioUi(){
        int opcion;
        int i = 0;

        while(true) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Gestion Usuario: " + "\n" +
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
                    //modificarUsuario();
                    break;
                case 3:
                    //eliminarUsuario();
                    break;
                case 4:
                    mostrarListaUsuario();
                    break;
                case 5:
                    //buscarUsuario();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida",
                            "Error",JOptionPane.ERROR_MESSAGE,null);
            }
        }
    }
    public void cargarUsuario(int id){
//        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
        boolean validar = false;
        int iD = id;
        String nombre = null;
        Date fechaAlt = new Date();
        Date fechaMod = new Date();
        String fechaNacimiento = null;
        String contrasena =null ;

        while(!validar) {
            nombre = JOptionPane.showInputDialog("Ingrese Usuario","new");
            validar = usuarioService.validarNombre(nombre);
        }
        validar = false;
        while(!validar) {
            fechaNacimiento = JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento");
            validar = usuarioService.validarFecNac(fechaNacimiento);
        }
        validar = false;
        while(!validar) {
            contrasena = JOptionPane.showInputDialog("Ingrese Contraseña");
            validar = usuarioService.validarPassword(contrasena);
        }
        Usuario usua = new Usuario(iD+1000,nombre,fechaAlt,
                fechaMod,fechaNacimiento,contrasena);
        misUsuarios.add(usua);
    }
    public void mostrarListaUsuario(){
        for (Usuario usuario : misUsuarios) {
            System.out.println(usuario.toString());
        }
    }
}
