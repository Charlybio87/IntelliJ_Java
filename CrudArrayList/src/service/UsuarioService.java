package service;

import models.Usuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class UsuarioService {

    private ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();
    public boolean validarNombre(String name){
        boolean ban = true;
        if(Objects.equals(name, "new")){
            ban = false;
            JOptionPane.showMessageDialog(null,"Ingrese un dato valido.");
        }
        return ban;
    }
    public boolean validarFecNac(String fecNac){
        boolean ban = true;
        if(Objects.equals(fecNac, "new")){
            ban = false;
            JOptionPane.showMessageDialog(null,"Ingrese un dato valido.");
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

}
