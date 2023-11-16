package Ui;

import Models.Profesor;

import javax.swing.*;
import java.util.ArrayList;

public class ProfesorUi {
    private ArrayList<Profesor> misProfesores = new ArrayList<>();

    public void menu(){
        int menu;

        while(true) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar un profesor" + "\n" +
                            "2. Modificar profesor" + "\n" +
                            "3. Eliminar profesor" + "\n" +
                            "4. Mostrar Lista de profesores" + "\n" +
                            "5. Salir" + "\n","Menu de Profesores",JOptionPane.PLAIN_MESSAGE));
            // Integer.parseInt: Convierte (parsea) un argumento de tipo cadena
            // y devuelve un entero de la base especificada.
            // JOptionPane.showMessageDialog(Componente padre, mensaje, título, tipo de mensaje, icono);
            // JOptionPane: es una clase que nos permite mostrar un diálogo gráfico con el que
            // podemos interactuar para introducir o mostrar la información que queramos.
            // El método showInputDialog retorna la entrada del usuario (es decir, lo que escribe
            // el usuario) o null si el usuario presionó el botón de cancelar.
            switch (menu) {
                case 1:
                    this.cargar();
                    break;
                case 2 :
                    this.modificar();
                    break;
                case 3 :
                    this.eliminar();
                    break;
                case 4 :
                    this.mostrar();
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog( null,"Opcion invalida",
                        "Error",JOptionPane.ERROR_MESSAGE,null);
                    break;
            }
        }
    }

    public void cargar(){
        String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dni"));
        Profesor miProfesor = new Profesor(nombre,apellido,dni);
        misProfesores.add(miProfesor);
    }

   public void modificar(){
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion que desea modificar:"));
        posicion = posicion - 1;        //para visulizar mejor la posicion
        System.out.println(misProfesores.get(posicion));//visulizamos el objeto indicado
        Profesor profesorModificado = new Profesor("","",' ');
        profesorModificado.setNombre(JOptionPane.showInputDialog("Ingrese new nombre"));
        profesorModificado.setApellido(JOptionPane.showInputDialog("Ingrese new apellido"));
        profesorModificado.setDni(Integer.parseInt(JOptionPane.showInputDialog("Ingrese new dni")));
        misProfesores.set(posicion,profesorModificado);
    }

   public void eliminar(){
        //muestra la longitud del arraylist
        int elim = Integer.parseInt(JOptionPane.showInputDialog("Posicion que desea eliminar del 1 al "
                + misProfesores.size())) ;
        elim = elim - 1;
        misProfesores.remove(elim);
        //elimina una objeto de la posicion seleccionada
    }

    public void mostrar(){
        for (Profesor profesor:misProfesores){
            System.out.println(profesor.toString());
        }
    }
}
