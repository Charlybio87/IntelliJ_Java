import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/*TERMINAR DE ARMAR EL MENU DE PROFESOR */

/*
*   1.	Crear un proyecto
    2.	Crear una clase Profesor
    3.	Crear 3 profesores
    4.	Modificar el nombre de los tres profesores
    5.	Listar o mostrar a los profesores
    6.  Crear un menú de opciones :
        -	Crear los tres profesores
        -	Modificar el nombre de los tres profesores
        -	listar a los tres profesores
* */
public class Main {
    public static void main(String[] args) {
        int i, opcion = 0;
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);

        // Se crean clase con objetos vacios
        Profesor profesor1 = null;
        Profesor profesor2 = null;
        Profesor profesor3 = null;

        for (i = 1; i < 3; i++) {
            System.out.println("Ingrese los datos del profesor:");
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            System.out.print("Apellido: ");
            String apellido = teclado.next();
            System.out.print("DNI: ");
            int dni = teclado.nextInt();

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
                    System.out.println("1." + profesor1);
                    System.out.println("2." + profesor2);
                    System.out.println("3." + profesor3);
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
                    System.out.println("Profesor: ");
                    System.out.println("1. profesor 1");
                    System.out.println("2. profesor 2");
                    System.out.println("3. profesor 3");
                    System.out.print(">> ");
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
            System.out.println("Desea realizar algo más!? true/false ");
            bandera = teclado.nextBoolean();
        }while (bandera);


        System.out.println(profesor1);
        System.out.println(profesor2);
        System.out.println(profesor3);
    }


//        for (i = 1; i < 3; i++) {
//            System.out.println("Ingrese los datos del profesor, nombre apellido y dni");
//            nombre = sc.next();
//            switch (i) {
//                case 1:
//                    System.out.println(profesor1);break;
//                case 2:
//                    System.out.println(profesor2);break;
//                case 3:
//                    System.out.println(profesor3);break;
//                default:
//                    System.out.println("Opcion invalida");
//            }
//
//
//        }
}
