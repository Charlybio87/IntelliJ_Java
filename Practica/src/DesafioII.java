import java.util.Scanner;

/**---Comentario de Documentacion---
 * @Programa: "Desafio 2 codo a codo"
 * @author: Ribas Carlos
 * @version 1.0.0
 * @see:
 */

/* ---Comentario de bloque---
 * Para mostrar la calificación de un alumno, es necesario evaluar
 * las condiciones que se indican en la siguiente tabla.
 *
 * Para saber los atajos de intellij Ctrl+j
 */

public class DesafioII {
    public static void main(String[] args) {
        int nota;

        //Declaracion de Objetos
        Scanner Teclado;
        //Instanciacion del Objeto (Inicializacion)
        Teclado = new Scanner(System.in);
        System.out.println("Escribe tu calificacion: ");
        nota = Teclado.nextInt();

        if (nota >=0 || nota <=10){
            if (nota == 10) {
                System.out.println("Tu calificacion: Notable.");
            } else if (nota == 9) {
                System.out.println("Tu calificacion: Sobresaliente.");
            } else if (nota == 7 || nota == 8) {
                System.out.println("Tu calificacion: Notable.");
            } else if (nota == 6) {
                System.out.println("Tu calificacion: Bien.");
            } else if (nota == 5) {
                System.out.println("Tu calificacion: Aprobado.");
            } else {
                System.out.println("Tu calificacion: Suspenso.");
            }
        }
    }
}
