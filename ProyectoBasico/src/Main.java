import Ui.ProfesorUi;
public class Main{


    public static void main(String[] args) {

        ProfesorUi profesorUi = new ProfesorUi();
        profesorUi.menu();
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
