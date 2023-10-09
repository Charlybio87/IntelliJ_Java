/** ---Comentario de Documentacion---
 * @Programa: "Ejercicio POO propuesto"
 * @author: Ribas Carlos
 * @version 1.0.1
 * @Fecha: 05/10/2023
 * @see:
 * @nota:
 */

/* ---Comentario de bloque---
       Crear un proyecto que se llame: ejercitacion
       Crear un Clase que se llame: Aula , solo tiene dos propiedades nombre y direccion
        --- las propiedades o atributos: nombre y direccion
        --- crear el metodo constructor
        --- crear los metodos set y get
        --- crear el metodo toString

        Crear un Objeto que se llame: miAula
        Modificar el nombre del aula :
        Modificar la direccion
        mostrar el nombre del aula
 */
public class Main {
    public static void main(String[] args) {
        //Se crear una clase
        Aula miAula1;
        //Se crea un objeto
        /* se crea una objeto vacio y un objeto con datos */
        Aula miAula2 = new Aula ("","");
        miAula1 = new Aula("java","pepe 145");
        // 2 alternativas de traer y mostrar datos
        System.out.println("El nombre del aula1: "+ miAula1.getNombre());
        String direccion = miAula1.getDireccion();
        System.out.println("La direccion del aula1 es: "+ direccion);

        System.out.println("******************************************");
        // uso de metodo de set colocar y modificar
        miAula2.setNombre("python");
        miAula2.setDireccion("Ceballo 678");
        System.out.println("El nombre del aula2: "+ miAula2.getNombre());
        System.out.println("La direccion del aula2 es: "+ miAula2.getDireccion());

        System.out.println("******************************************");
        miAula1.setNombre("JavaScript"); //Sobreescribe el nombre
        System.out.println("Set nombre del aula1: "+ miAula1.getNombre());

        System.out.println("******************************************");
        System.out.println(miAula1);
        System.out.println(miAula2);
    }
}