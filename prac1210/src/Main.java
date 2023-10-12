import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/**---Comentario de Documentacion---
 * @Programa: "PRACTICA codo a codo"
 * @author: Ribas Carlos
 * @version 1.0.3
 * @see:
 */

/* ---Comentario de bloque---
 * Para mostrar la calificación de un alumno, es necesario evaluar
 * las condiciones que se indican en la siguiente tabla.
 *
 * Para saber los atajos de intellij Ctrl+j
 *
 * PRACTICA:
 *   1.	Crear un proyecto
 *   2.	Crear una clase Profesor
 *   3.	Crear 3 profesores
 *   4.	Modificar el nombre de los tres profesores
 *   5.	Listar o mostrar a los profesores
 *   6.  Crear un menú de opciones :
 *       -	Crear los tres profesores
 *       -	Modificar el nombre de los tres profesores
 *       -	listar a los tres profesores
 */

public class Main {
    public static void main(String[] args) {
                                                                    // DECLARACION VARIABLES Y ASIGNACION
        int i, opcion = 0;
        String band;
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
                                                                    // SE CREA CLASE CON OBJETIVOS VACIOS
        Profesor profesor1 = null;
        Profesor profesor2 = null;
        Profesor profesor3 = null;
                                                                    // INICIALIZAR TECLADO Y LLENADO DATO
                                                                    // USO DE IF & SWITCH PARA CARGAR 3 PROFESORES
        for (i = 1; i < 3; i++) {
            System.out.println("Ingrese los datos del profesor:");
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Apellido: ");
            String apellido = teclado.next();
            System.out.print("DNI: ");
            int dni = teclado.nextInt();
                                                                    // CARGAR CADA PROFESOR SELECCIONADO POR i
            switch (i) {
                case 1:
                    profesor1 = new Profesor(nombre, apellido, dni);
                    break;
                case 2:
                    profesor2 = new Profesor(nombre, apellido, dni);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
                                                                    // USO DE REPETIR-MIENTRAS & SWITCH PARA
                                                                    // CREAR UN MENU PARA CARGAR/MODIFICAR/VER
        do {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1.new profesor:");
            System.out.println("2.modificar profesor:");
            System.out.println("3.ver profesor:");
            System.out.print(">> ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = teclado.next();
                    System.out.print("Apellido: ");
                    String apellido = teclado.next();
                    System.out.print("DNI: ");
                    int dni = teclado.nextInt();
                    profesor3 = new Profesor(nombre, apellido, dni);
                    break;
                case 2:
                    System.out.println("Indique el Profesor: ");
                    System.out.println("1." + profesor1.getNombre());
                    System.out.println("2." + profesor2.getNombre());
                    System.out.println("3." + profesor3.getNombre());
                    System.out.print(">> ");
                    int opcion2 = teclado.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.print("Nombre: ");
                            String nomb1 = teclado.next();
                            profesor1.setNombre(nomb1);
                            System.out.print("Apellido: ");
                            String apell1 = teclado.next();
                            profesor1.setApellido(apell1);
                            System.out.print("DNI: ");
                            int doc1 = teclado.nextInt();
                            profesor1.setDni(doc1);
                            break;
                        case 2:
                            System.out.print("Nombre: ");
                            String nomb2 = teclado.next();
                            profesor2.setNombre(nomb2);
                            System.out.print("Apellido: ");
                            String apell2 = teclado.next();
                            profesor2.setApellido(apell2);
                            System.out.print("DNI: ");
                            int doc2 = teclado.nextInt();
                            profesor2.setDni(doc2);
                            break;
                        case 3:
                            System.out.print("Nombre: ");
                            String nomb3 = teclado.next();
                            profesor3.setNombre(nomb3);
                            System.out.print("Apellido: ");
                            String apell3 = teclado.next();
                            profesor3.setApellido(apell3);
                            System.out.print("DNI: ");
                            int doc3 = teclado.nextInt();
                            profesor3.setDni(doc3);
                            break;
                        default:
                            System.out.println("datos invalidos");
                    }
                    break;
                case 3:
                    System.out.println("Indique el Profesor: ");
                    System.out.println("1." + profesor1.getNombre());
                    System.out.println("2." + profesor2.getNombre());
                    if (profesor3 != null) {
                        System.out.println("3." + profesor3.getNombre());
                    } else {
                        System.out.print(">> ");
                        }
                    int opcion3 = teclado.nextInt();
                    switch (opcion3) {
                        case 1:
                            System.out.println("Profesor 1:");
                            System.out.println("Nombre: " + profesor1.getNombre());
                            System.out.println("Apellido: " + profesor1.getApellido());
                            System.out.println("DNI: " + profesor1.getDni());
                            break;
                        case 2:
                            System.out.println("Profesor 2:");
                            System.out.println("Nombre: " + profesor2.getNombre());
                            System.out.println("Apellido: " + profesor2.getApellido());
                            System.out.println("DNI: " + profesor2.getDni());
                            break;
                        case 3:

                            System.out.println("Profesor 3:");
                            System.out.println("Nombre: " + profesor3.getNombre());
                            System.out.println("Apellido: " + profesor3.getApellido());
                            System.out.println("DNI: " + profesor3.getDni());

                            break;
                        default:
                            System.out.println("datos invalidos");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Desea realizar algo más!? S/N ");
            band = teclado.next();
     // } while (bandera);
        } while ((band=="s")||(band=="S"));

        System.out.println(profesor1);
        System.out.println(profesor2);
        System.out.println(profesor3);
    }
}