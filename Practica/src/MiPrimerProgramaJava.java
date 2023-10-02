import java.sql.SQLOutput;
import java.util.function.Predicate;

/** ---Comentario de Documentacion---
 * @Programa: "Desafio 1 codo a codo"
 * @author: Ribas Carlos
 * @version 1.0.0
 * @see:
 */

/* ---Comentario de bloque---
 * -Inicializar un programa java con nombre de clase MiPrimerProgramaJava.
 * -Declarar cada tipo de variable aprendida.
 * -Imprimir su valor por consola
 *
 * Para saber los atajos de intellij Ctrl+j
 */
 public class MiPrimerProgramaJava {
    public static void main(String[] args){
        // Definimos el TIPO de Variables
        byte miByte,miByte2;    // nombre de variables
        short miShort,miShort2; //  <tipo><identificador> -> <short><num3>
        int miInt,miInt2;
        long milong,milong2;
        float miReal2,miReal,TOTAL_PERSONAS;
        double PI;  // nombre de constante en mayuscula
        char michar,michar2,letra;
        boolean evaluacion;
        String cadena; // String es una Clase
        // Designamos el Valor máximo y mínimo
        PI = 3.14F;
        miByte = -128; // valor extremo inferior hasta aca llegamos con byte
        miByte2 = 127; // valor extremo superior hasta aca llegamos con byte
        miShort = -32768;
        miShort2 = 32767;
        miInt = -2147483648;
        miInt2 = 2147483647; //evaluaremos que ocurre
        //long milong = -922117036854775808;
        //long milong2 = 922117036854775807;
        miReal = 2.56E00f;
        miReal2 = 2.56f;
        //michar = \u0000 ;
        //michar2 = \uFFFF;
        letra = 'C';
        evaluacion= true;
        TOTAL_PERSONAS = 70;
        // Muestro por pantalla
        System.out.println("LOS TIPOS DE VARIABLES Y SUS RANGOS");
        System.out.println("Numeros Enteros:");
        System.out.println(miByte+"<byte<"+miByte2);
        System.out.println(miShort+"<short<"+miShort2);
        System.out.println(miInt+"<int<"+miInt2);
       // System.out.println(milong+"<long<"+milong2);
        System.out.println("Numeros Decimales:");
        System.out.println(miReal+"<float<"+miReal2);
        System.out.println("Caracter:");
        System.out.println("char: "+letra);
        System.out.println("Booleanas:");
        System.out.println("Boolean:"+ evaluacion +" "+ !(evaluacion));
    }
 }
