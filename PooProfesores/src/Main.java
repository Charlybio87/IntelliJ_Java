import java.net.PasswordAuthentication;
import java.sql.SQLOutput;
import java.util.Scanner;

/**---Comentario de Documentacion---
 * @Programa: "PRACTICA codo a codo"
 * @author: Ribas Carlos
 * @version: 1.0.4
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

        /* DECLARO TIPOS DE VARIABLES Y ASIGNACION*/
        Scanner teclado = new Scanner(System.in);
        int contraseña = 123;
        String usr = "Rene",usar1;
        boolean band = false, band0=false, band1 = false, band2 = false;

        /* CREO CLASES CON OBJETOS VACIOS (PROFESORES) Y LLENOS (ALUMNOS)*/
        Profesor profesorTitular = new Profesor(1,"Rene","Favaloro");
        Profesor profesorGabinete = null;
        Profesor profesorTp = null;

        Alumno alumno1 = new Alumno(10,"Lionel","Messi",' ');
        Alumno alumno2 = new Alumno(21,"Manu","Ginobili",' ');
        Alumno alumno3 = new Alumno(1,"Jaun Manuel","Fangio",' ');

        /*INICIAR*/
        System.out.print("Ingrese Usuario: ");
        usar1 = teclado.next();
        Boolean valname = usr.equals(usar1);
        //Boolean valname = (usr == usar1);
        System.out.print("Ingrese contraseña: ");
        int contraseña1 = teclado.nextInt();
        if ((valname == true) && (contraseña1 == contraseña)){
            System.out.println("Hola Profesor " + profesorTitular.getNombre() +" "
                    + profesorTitular.getApellido() + ".");
            band = true;
        }
                                                    /*MENU PRINCIPAL PROFESOR TITULAR*/
        if (band == true){
            do {
                System.out.println("MENU PRINCIPAL:");
                System.out.println("1. Profesor");
                System.out.println("2. Alumnos");
                System.out.println("3. Nota Final");
                System.out.println("4. Salir");
                int opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                                                    /*OPCION PROFESORES*/
                        do {
                            System.out.println("MENU - PROFESORES:");
                            System.out.println("1. Ingresar profesor gabinete");
                            System.out.println("2. Ingresar profesor trabajo practico");
                            System.out.println("3. Realizar alguna modificacion");
                            System.out.println("4. Mostrar catedra");
                            System.out.println("5. Salir");
                            int opcion1 = teclado.nextInt();
                            if (opcion1 == 1) {
                                System.out.print("id: ");
                                int id = teclado.nextInt();
                                System.out.print("Nombre: ");
                                String nombre = teclado.next();
                                System.out.print("Apellido: ");
                                String apellido = teclado.next();
                                profesorGabinete = new Profesor(id, nombre, apellido);
                            } else if (opcion1 == 2) {
                                System.out.print("id: ");
                                int id = teclado.nextInt();
                                System.out.print("Nombre: ");
                                String nombre = teclado.next();
                                System.out.print("Apellido: ");
                                String apellido = teclado.next();
                                profesorTp = new Profesor(id, nombre, apellido);
                            } else if (opcion1 == 3) {
                                System.out.println("Indique el Profesor: ");
                                System.out.println("1." + profesorGabinete.getNombre());
                                System.out.println("2." + profesorTp.getNombre());
                                int opcion2 = teclado.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        System.out.print("id: ");
                                        int id = teclado.nextInt();
                                        profesorGabinete.setId(id);
                                        System.out.print("Nombre: ");
                                        String nomb1 = teclado.next();
                                        profesorGabinete.setNombre(nomb1);
                                        System.out.print("Apellido: ");
                                        String apell1 = teclado.next();
                                        profesorGabinete.setApellido(apell1);
                                        break;
                                    case 2:
                                        System.out.print("id: ");
                                        int id1 = teclado.nextInt();
                                        profesorTp.setId(id1);
                                        System.out.print("Nombre: ");
                                        String nomb2 = teclado.next();
                                        profesorTp.setNombre(nomb2);
                                        System.out.print("Apellido: ");
                                        String apell2 = teclado.next();
                                        profesorTp.setApellido(apell2);
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta.");
                                }
                            } else if (opcion1 == 4) {
                                System.out.println("Profesores de la Catedra: ");
                                System.out.println("Profesor Titular: " + profesorTitular);
                                System.out.println("Profesor de Gabiente:" + profesorGabinete);
                                System.out.println("Profesores de Trabajo Practicos: " + profesorTp);
                            } else {
                                band1 = true;
                            }
                        } while (band1 != true);
                        break;
                                                    /*OPCION ALUMNOS*/
                    case 2:
                        do {
                            System.out.println("MENU - ALUMNOS:");
                            System.out.println("1. Mostrar Alumnos");
                            System.out.println("2. Realizar Modificacion");
                            System.out.println("3. Ingresar Nota Examen");
                            System.out.println("4. Salir");
                            int opcion1 = teclado.nextInt();
                            if (opcion1 == 1) {
                                System.out.println("Alumnos: ");
                                System.out.println("1." + alumno1.getApellido() + " " + alumno1.getNombre());
                                System.out.println("2." + alumno2.getApellido() + " " + alumno2.getNombre());
                                System.out.println("3." + alumno3.getApellido() + " " + alumno3.getNombre());
                            } else if (opcion1 == 2) {
                                System.out.println("Indique el Alumno: ");
                                System.out.println("1." + alumno1.getApellido() + " " +alumno1.getNombre());
                                System.out.println("2." + alumno2.getApellido() + " " +alumno2.getNombre());
                                System.out.println("3." + alumno3.getApellido() + " " +alumno3.getNombre());
                                int opcion2 = teclado.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        System.out.print("id: ");
                                        int id1 = teclado.nextInt();
                                        alumno1.setId(id1);
                                        System.out.print("Nombre: ");
                                        String nomb1 = teclado.next();
                                        alumno1.setNombre(nomb1);
                                        System.out.print("Apellido: ");
                                        String apell1 = teclado.next();
                                        alumno1.setApellido(apell1);
                                        break;
                                    case 2:
                                        System.out.print("id: ");
                                        int id2 = teclado.nextInt();
                                        alumno2.setId(id2);
                                        System.out.print("Nombre: ");
                                        String nomb2 = teclado.next();
                                        alumno2.setNombre(nomb2);
                                        System.out.print("Apellido: ");
                                        String apell2 = teclado.next();
                                        alumno2.setApellido(apell2);
                                        break;
                                    case 3:
                                        System.out.print("id: ");
                                        int id3 = teclado.nextInt();
                                        alumno3.setId(id3);
                                        System.out.print("Nombre: ");
                                        String nomb3 = teclado.next();
                                        alumno3.setNombre(nomb3);
                                        System.out.print("Apellido: ");
                                        String apell3 = teclado.next();
                                        alumno3.setApellido(apell3);
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta.");
                                }
                            } else if (opcion1 == 3) {
                                System.out.println("Indique el Alumno: ");
                                System.out.println("1." + alumno1.getApellido());
                                System.out.println("2." + alumno2.getApellido());
                                System.out.println("3." + alumno3.getApellido());
                                int opcion2 = teclado.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        System.out.println("Ingresar nota de Examen: ");
                                        int nota1 = teclado.nextInt();
                                        alumno1.setCalificacion(nota1);
                                        break;
                                    case 2:
                                        System.out.println("Ingresar nota de Examen: ");
                                        int nota2 = teclado.nextInt();
                                        alumno2.setCalificacion(nota2);
                                        break;
                                    case 3:
                                        System.out.println("Ingresar nota de Examen: ");
                                        int nota3 = teclado.nextInt();
                                        alumno3.setCalificacion(nota3);
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta.");
                                }
                            } else {
                                band2 = true;
                            }
                        } while (band2 != true);
                        break;
                                                    /*OPCION NOTA FINAL*/
                    case 3:
                        System.out.println("NOTAS FINALES:");
                        System.out.println(alumno1.getApellido()+" Nota final: ");
                        alumno1.notaExamen();
                        System.out.println(alumno2.getApellido()+" Nota final: ");
                        alumno2.notaExamen();
                        System.out.println(alumno3.getApellido()+" Nota final: ");
                        alumno3.notaExamen();
                        break;
                                                    /*SALIR DE MENU PRINCIPAL*/
                    case 4:
                        band0 = true;
                        break;
                    default:
                        System.out.println("Seleciones nuevamente.");
                }
            } while (band0 != true );
        } else {
            System.out.println("No tiene los permisos de adm.");
        }
    }
}