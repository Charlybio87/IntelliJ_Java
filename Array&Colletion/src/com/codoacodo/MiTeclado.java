package com.codoacodo;

import java.util.Scanner;

public class MiTeclado {
    public static void main(String[] args) {
        //Declaracion del Objeto
        Scanner miteclado;
        //Inicializacion del objeto miteclado
        miteclado = new Scanner(System.in);

        //Declaracion de varuiables
        String nombre;
        int edad;

        //Instrucciones entrada
        System.out.println("Ingrese su nombre: ");
        nombre =  miteclado.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = miteclado.nextInt();

        //Instruccion de salida
        System.out.println("Hola "+nombre+" tu edad es "+edad+".");

    }
}
