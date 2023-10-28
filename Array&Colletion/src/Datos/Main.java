package Datos;

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        ArrayList<Profesores> profesores = new ArrayList<>();
        alumnos = datosalumnos();
        for(Alumnos lista : alumnos){
            System.out.println(lista);//muestra la lista
        }
    }

    public static ArrayList<Profesores> datosprofesor(){
        ArrayList<Profesores> misProfesores = new ArrayList<Profesores>();

        return misProfesores;
    }
    public static ArrayList<Alumnos> datosalumnos(){

        Scanner teclado=new Scanner(System.in);
        String  nombre;
        String  apellido;
        int     dni;
        boolean seguir = true;

        // Arraylist es la estructura
        // Alumnos es la clase
        // misAlumnos es el nombre del arrayList
        // new... es el contructor
        ArrayList<Alumnos> misAlumnos = new ArrayList<Alumnos>();

        while (seguir == true){
            System.out.println("""
            Ingresa tu nombre
            Ingresa tu apellido
            Ingresa tu dni
            """);
            nombre = teclado.next();
            apellido = teclado.next();
            dni = teclado.nextInt();

            misAlumnos.add(new Alumnos(nombre,apellido,dni));

            System.out.println("Desea seguir ingresando alumons?? " +
                    "true/flase");
            seguir = teclado.nextBoolean();
        }
        return misAlumnos;
    }
}
