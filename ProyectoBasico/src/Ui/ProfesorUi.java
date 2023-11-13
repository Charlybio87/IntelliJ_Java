package Ui;

import Models.Profesor;

import javax.swing.*;
import java.util.ArrayList;

public class ProfesorUi {
    static ArrayList<Profesor> misProfesores = new ArrayList<>();
    //Profesorservice misProfesoresDao;

    public static void cargar(){
        String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dni"));
        Profesor miProfesor = new Profesor(nombre,apellido,dni);
        misProfesores.add(miProfesor);
    }
   public static void mostrar(){
        for (Profesor profesor:misProfesores){
            System.out.println(profesor.toString());
        }
    }
   public static void modificar(){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion que desea modificar:"));
        posicion = posicion - 1;        //para visulizar mejor la posicion
        System.out.println(misProfesores.get(posicion));//visulizamos el objeto indicado
        Profesor profesorModificado = new Profesor("","",' ');
        profesorModificado.setNombre(JOptionPane.showInputDialog("Ingrese new nombre"));
        profesorModificado.setApellido(JOptionPane.showInputDialog("Ingrese new apellido"));
        profesorModificado.setDni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese new dni")));
        misProfesores.set(posicion,profesorModificado);
    }
   public static void eliminar(){
        //muestra la longitud del arraylist
        int elim = Integer.parseInt(JOptionPane.showInputDialog("Posicion que desea eliminar del 1 al "
                + misProfesores.size())) ;
        elim = elim - 1;
        misProfesores.remove(elim);
        //elimina una objeto de la posicion seleccionada
    }
}
