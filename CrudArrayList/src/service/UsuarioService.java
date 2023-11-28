package service;

import models.Usuario;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class UsuarioService {

    private ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();
    public boolean validarNombre(String name){
        boolean ban = true;
        if(Objects.equals(name, "new")){
            ban = false;
            JOptionPane.showMessageDialog(null,
                    "Ingrese un dato valido.",
                    "Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return ban;
    }
    public Boolean validarFecNac(String nacFec){
        boolean ban = true;
        Date fechaNacimiento = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fechaNacimiento = dateFormat.parse(nacFec);

            ban = true;
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,
                    "Formato incorrecto.",
                    "Error",JOptionPane.ERROR_MESSAGE,null);
            ban = false;
        }
        return ban;
    }
    public boolean validarPassword(String password){
        boolean ban = true;
        if(Objects.equals(password, "new")){
            ban = false;
            JOptionPane.showMessageDialog(null,"Ingrese un dato valido.");
        }
        return ban;
    }
    /*public void validarBuscar(int contador, String usubuscado){
        for (Usuario buscarUsuario : misUsuarios) {
            if (buscarUsuario.getNombre().equalsIgnoreCase(usubuscado)) {
                JOptionPane.showMessageDialog(null, buscarUsuario);
                JOptionPane.showMessageDialog(null,
                        "El Usuario fue encontrado exitosamente.");
            } else {
                contador= contador + 1;
            }
        }
        if (contador == misUsuarios.size()){
            JOptionPane.showMessageDialog(null,
                    usubuscado+" no se encuentra en la lista.");
        }
    }*/
    public void validarBuscar(int contador, String usubuscado){
        /*boolean usuarioEncontrado = false;

        for (Usuario buscarUsuario : misUsuarios) {
            if (buscarUsuario.getNombre().equalsIgnoreCase(usubuscado)) {
                JOptionPane.showMessageDialog(null, buscarUsuario);
                JOptionPane.showMessageDialog(null, "El Usuario fue encontrado exitosamente.");
                usuarioEncontrado = true;
                break; // Salir del bucle cuando se encuentra el usuario
            } else {
                contador = contador + 1;
            }
        }

        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, usubuscado + " no se encuentra en la lista.");
        }*/
    }
}
