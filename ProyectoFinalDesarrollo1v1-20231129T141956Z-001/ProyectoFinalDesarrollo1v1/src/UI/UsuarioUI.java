package UI;
import Services.UsuarioService;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class UsuarioUI {

    UsuarioService usuarioService = new UsuarioService();

    public void menu(){
        int opcion;
        while (true) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Sistema de alta de Usuarios" + "\n" +
                    "1.- Agregar un Usuario" + "\n" +
                    "2.- Modificar un Usuario" + "\n" +
                    "3.- Buscar un Usuario" + "\n" +
                    "4.- Listar los Usuarios" + "\n" +
                    "5.- Eliminar un Usuario" + "\n" +
                    "6.- Salir"
            ));

            switch (opcion) {
                case 1:
                    this.grabar();
                    break;
                case 2:
                    this.modificar();
                    break;
                case 3:
                    this.buscar();
                    break;
                case 4:
                    this.listar();
                    break;
                case 5:
                    this.eliminar();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego! Gracias por usar el Sistema de Alta de Usuarios.", "Nos vemos!", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
            }
        }
    }
    public void grabar(){
        if (usuarioService != null) {
            usuarioService.crearNuevoUsuario();
        } else {
            // Manejo de la situación cuando usuarioService es null
            JOptionPane.showMessageDialog(null, "Error: UsuarioService no inicializado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    public void modificar(){

        usuarioService.modificarUsuario();

    }

    public void buscar(){
        usuarioService.buscarUsuario();

    }

    public void listar(){
        usuarioService.listarUsuarios();

    }

    public void eliminar(){
        usuarioService.eliminarUsuarios();

    }



}
