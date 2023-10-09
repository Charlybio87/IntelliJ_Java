import java.util.Scanner;

/**---Comentario de Documentacion---
 * @Programa: "Desafio 2 codo a codo"
 * @author: Ribas Carlos
 * @version 1.0.1
 * @see:
 */

/* ---Comentario de bloque---
 * Para mostrar la calificación de un alumno, es necesario evaluar
 * las condiciones que se indican en la siguiente tabla.
 *
 * Para saber los atajos de intellij Ctrl+j
 */
public class Desafiov1_4 {
    public static void main(String[] args) {
        int nota;

        //Declaracion de Objetos
        Scanner Teclado;
        //Instanciacion del Objeto (Inicializacion)
        Teclado = new Scanner(System.in);
        System.out.print("Ingrese su nota: ");
        nota = Teclado.nextInt();
        if (nota<=10 && nota>=0){
            switch (nota) {
                case 10:
                    System.out.println("Tu calificacion: Notable.");
                    break;
                case 9:
                    System.out.println("Tu calificacion: Sobresaliente.");
                    break;
                case 8:
                    System.out.println("Tu calificacion: Notable.");
                    break;
                case 7:
                    System.out.println("Tu calificacion: Notable.");
                    break;
                case 6:
                    System.out.println("Tu calificacion: Bien.");
                    break;
                case 5:
                    System.out.println("Tu calificacion: Aprobado.");
                    break;
                default:
                    System.out.println("Tu calificacion: Suspenso.");
            }
        }else {
            System.out.println("Su nota no corresponde. Vuelva a intentar. Gracias!");
        }
    }
}