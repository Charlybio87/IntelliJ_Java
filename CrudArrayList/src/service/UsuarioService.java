package service;

import models.Usuario;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class UsuarioService {
// La clase UsuarioService proporciona metodos de validacion utilizados
// para verificar la validez de campos relacionados con la clase Usuario
    private ArrayList<Usuario> misUsuarios = new ArrayList<>();
    public boolean validarNombre(String name){
        boolean ban = true;
        if(Objects.equals(name, "Ingrese")){
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
        // validacion de conversion de la cadena fechadenacimiento por medio
        // del SimpleDateFormat.
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
        if(Objects.equals(password,"Ingrese")){
            ban = false;
            JOptionPane.showMessageDialog(null,
                    "Ingrese un dato valido.",
                    "Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return ban;
    }
}
