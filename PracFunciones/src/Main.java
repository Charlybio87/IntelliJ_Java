import jdk.dynalink.beans.StaticClass;

import java.sql.ResultSet;

/**---Comentario de Documentacion---
 * @Programa: "Practica Con Funciones"
 * @author: Ribas Carlos
 * @version 1.0.1
 * @see:
 */

/* ---Comentario de bloque---
 * Las funciones, como su propio nombre indica, se encargarán de
 * hacer una "función" concreta de nuestro programa.
 * Para saber los atajos de intellij Ctrl+j
 */

public class Main {
    //FUNCION QUE RECIBEN DATOS Y NO DEVUELVEN NADA

/*    static void Muestraholamundo(){
        System.out.println("Hola mundo");
    }

    public static void main(String[] args) {
        Muestraholamundo();
    }

*/
    //FUNCION QUE NO RECIBEN DATOS Y NO DEVUELVEN NADA

/*      static void Muestranumero (int numero){
        System.out.println("Numero mostrado: "+ numero);
    }

    public static void main(String[] args) {
        int num;
        num = 3;
        Muestranumero(num);

    }
*/
    //FUNCION QUE RECIBEN DATOS Y DEVUELVEN DATOS

    static int Suma(int n1, int n2) {
        int resultado;
        resultado = n1 + n2;
        return resultado;
    }

    public static void main(String[] args) {
        int num1,num2;
        num1=3;
        num2=7;
        System.out.println("El resultado de la suma es: "+ Suma(num1,num2));
    }
}