/** ---Comentario de Documentacion---
 * @Programa: "Desafio Integrador codo a codo"
 * @author: Ribas Carlos
 * @version 1.0.0
 */

/* ---Comentario de bloque---
 *
 * Para saber los atajos de intellij Ctrl+j
 */

//inicialiciacion de las Librerias
import java.util.Scanner;


public class SistemaControl {
    public static void main(String[] args) {
        //Declaracion de Objetos
        Scanner Teclado;

        //Instanciacion del Objeto (Inicializacion)
        Teclado = new Scanner(System.in);


        //Declaracion e Instanciacion de las Variables
        String nombre = "",respuesta = "";
        double ingresoMedio;
        char clas = 'D';
        boolean bandera = false, bandera2 = false;

        // Desarrollo de Proceso
        System.out.println("****************************************");
        System.out.println("*     Te damos las bienvenida          *");
        System.out.println("*     al simulador de créditos         *");
        System.out.println("****************************************");

        // Instruccion de Salida-Entrada
        System.out.print("Por favor, ingresa tu nombre: ");
        nombre = Teclado.nextLine(); //nextLine es el método que ayuda a captura loque se escribe

        do {
            bandera = false;
            System.out.print("Hola " + nombre + ". Por favor digita tu ingreso medio mensual: $");
            ingresoMedio = Teclado.nextDouble();

            // Depuracion del buffer de entrada
            Teclado.nextLine();

            // Estructura if-else-if
            if (ingresoMedio > 0 && ingresoMedio <= 50000) {
                clas = 'A';
            } else if (ingresoMedio > 50000 && ingresoMedio <= 100000) {
                clas = 'B';
            } else if (ingresoMedio > 100000) {
                clas = 'C';
            } else {
                System.out.println("Ocurrio un Error intentelo nuevamente.");
                bandera = true;
            }
        }while (bandera);//se activa cuando bandera sea true (vuelve a pedir cargar ingreso mensual)
    }
}
