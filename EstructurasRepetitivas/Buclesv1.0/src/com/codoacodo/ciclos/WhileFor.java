package com.codoacodo.ciclos;

public class WhileFor {
    public static void main(String[] args) {
        /*Mostrar por pantalla numeros del 1 al 10*/

        System.out.println("Bucle While");
        //WHILE
        int contador = 1; //Declaración de Variable

        while (contador < 11){ //Condición de verdad
            System.out.print(contador+" ");
            contador++; //Incrementador
        }

        System.out.println();
        System.out.println("Bucle For");
        //For
        for (int cont=11 ; cont < 21 ; cont++){
            System.out.print(cont+" ");
        }

        System.out.println();
        System.out.println("Bucle DoWhile");
        //DoWhlie
        int cont1 = 21;
        do {
            cont1--;
            System.out.print(cont1 + " ");
        }while (cont1>=1);

        System.out.println();
        System.out.println("Bucle For con Break");
        for (int i = 1; i < 11; i++) {
            if ((i>=3) && (i<=6)){
                break;// Break: Lo saca del bucle For
            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Bucle For con Continue");
        for (int i = 1; i < 11; i++) {
            if ((i>=3) && (i<=6)){
                continue;// Break: Lo saca del bucle For
            }
            System.out.print(i + " ");
        }


    }
}
