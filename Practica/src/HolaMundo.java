import javax.sound.midi.Soundbank;
import java.awt.print.Printable;
import java.security.Principal;

/** ---Comentario de Documentacion---
 * CaC Inicial
 * Programa: "Hola mundo" y "Definicion de variables"
 * @author: Ribas Carlos
 * @version 1.0
 * @see: https://www.aulafacil.com/cursos/programacion/java-basico-t871
 */

/* ---Comentario de bloque--- (este coment. no se visualiza en documentacion)
* En este espacio de trabajo se realizo prueba de imprresion de hola mundo
* como tambien de definicion de algunas variables y su impresion.
*  Para saber los atajos de intellij Ctrl+j
*/

// ---Comentario de Linea---
// INICIO DE ALGORITMO: desde public class
public class HolaMundo {    //Definicion de la CLASE
    public static void main(String[] args) {    //Definicion del METODO main
        //Declaracion de variables.
        int num1, num2, resultado;
        boolean logico;
        //Inicializacion de las variables
        num1 = 5;
        logico = true;

        //Resultado por instruccion de salida
        System.out.println("El numero cargado es: " + num1); //forma de concatenar
        System.out.println("El logico cargado es: " + logico);
        // Se muestra Hola Mundo
        if (args.length == 0) {
            System.out.println("Hola mundo");//ln salto de linea
            System.out.println("Hola mundo");//f no hay salto linea
            System.out.printf("Hola mundito");
        } else {
            System.out.printf("Hola mundo, " + args[0]);
            System.out.println(); //atajo escribir sout+tab

        }
        // Asignacion de variables
        int num = 3;
        double num_decimal = 10.65;
        boolean bool = false;
        char caracter = 'c';
        System.out.println("Esto contiene la variable entera: " + num);
        System.out.println("Esto contiene la variable decimal: " + num_decimal);
        System.out.println("Esto contiene la variable booleana: " + bool);
        System.out.println("Esto contiene la variable char: " + caracter);

        // Resolucion con variables

        num1 = 3;
        num2 = 10;
        resultado = num1 + num2;

        System.out.println("Eln resultado de sumar num1 y num2 es: " + resultado);

    }
} // FIN DEL ALGORITMO
