package prueba.funcion.metodos;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado;
        String name;

        resultado = sumar(2,5);
        System.out.println("La suma es " + resultado);

        name = persona("Ribas","Carlos");
        System.out.println(name);

    }
    public static int sumar (int num1, int num2){
        return (num1 + num2);
    }
    public static String persona(String apellido, String nombre){
        return ("Hola! " + nombre + " " + apellido+ ".");
    }
}