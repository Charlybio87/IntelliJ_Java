package Arrays;

public class MiArray {
    public static void main(String[] args) {

        //Declaracion de un Array
        int[] numeros;
        //Instanciacion
        numeros = new int[10];
        //Inicializacion
        numeros[0] = 1; //indice 0 con el elemento 1.
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        System.out.println("1° metodo de impresion:");
        //Instrucion de salida
        System.out.println("el numero del indece 3 es: "+numeros[3]);
        System.out.println("el numero del indece 9 es: "+numeros[9]);
        System.out.println("el numero del indece 5 es: "+numeros[5]);

        System.out.println("2° metodo de impresion:");

        //Otro metodo
        int[] miTabla;
        miTabla = new int[5];
        miTabla = new int[]{10, -10, 25, 51, -45};

        for(int i = 0; i < 5; i++){
            System.out.println("El numero del indice "+i+" es: "+miTabla[i]);
        }
        System.out.println("Mostrar nombre:");

        String[] nombres = {"Carlos","Santino","Pilar"};
        System.out.println("El elemento 2 de indice 1 es "+nombres[1]);

    }
}
