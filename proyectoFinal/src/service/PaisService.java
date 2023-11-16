package service;

import models.Pais;

import java.util.ArrayList;
import java.util.Objects;

public class PaisService {

    private ArrayList<Pais> misPaises = new ArrayList<Pais>();
    public boolean validarNombrePais(String name){
        boolean ban = true;
        if(Objects.equals(name, "new")){
            ban = false;
        }
            return ban;
    }
    public boolean validarCantidadHabitantesPais(int numHab){
        boolean ban = true;
        if(Objects.equals(numHab, 0)){
            ban = false;
        }
        return ban;
    }
    public void guardar(){

    }
}
