import Models.Profesor;
import Ui.ProfesorUi;

import javax.swing.*;
import java.util.ArrayList;

public class Main{


    public static void main(String[] args) {

        //ArrayList<Profesor> misProfesores = new ArrayList<>();
        ProfesorUi profesorUi = new ProfesorUi();
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
                    profesorUi.cargar();
                    break;
                case 2 :
                    profesorUi.modificar();
                    break;
                case 3 :
                    profesorUi.eliminar();
                    break;
                case 4 :
                   profesorUi.mostrar();
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
}
/* OTRO FORMA DE ARMAR MENU

import Models.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   // private static ArrayList<Profesor> profesoresJava = new ArrayList<>();

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcion;

        while(true){
            System.out.println("""
                    ****** SISTEMA ******
                    1. Ingresar Alumnos
                    2. Mostrar
                    3. Salir
                    """);
            switch (opcion){
                case 1:
                    System.out.println("Ingresa los datos del profesor: ");
                    //crearprofesor(); break;
                case 2:
                    System.out.println("Mostrar los datos del profesor: ");
                    //mostrarprofesor(); break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Se ingreso un valor invalido.");
            }

        }

    }
    public static void crearprofesor(){
//        1. Pedir datos
//        2. Crear un objeto profesor
//        3. Agregar a la lista de profesores
//        4. Guardar profesor, se almacena en un archivo o una base de datos
        Scanner sc = new Scanner(System.in);
        Profesor prof= new Profesor("Jorge","Pacheco","123123","26");
        profesoresJava.add(prof);
    }
    public static void mostrarprofesor(){

    }
}
*/
