import java.net.SocketImpl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*INICIALIZACION DE VARIABLES Y DECLARACIONES*/
        Scanner teclado = new Scanner(System.in);
        boolean band0 = false, band1 = false, band2 = false
                , salir0 = false, salir1 = false;


        /*CREACION DE CLASES CON Y SIN OBJETOS*/
        Profesor profesorTitular = new Profesor('1', "Favaloro", "Rene", "Titular");
        Profesor profesorTp = new Profesor('2', "Argento", "Pepe", "Practica");;
        Profesor profesorGabinete = new Profesor('3',"Curie","Martha","Gabinete");

        Alumno alumno1 = new Alumno(10, "Lionel", "Messi",
                ' ', ' ', ' ');
        Alumno alumno2 = new Alumno(21, "Manu", "Ginobili",
                ' ', ' ', ' ');
        Alumno alumno3 = null;

        // Se armo un bucle do-while para mantener el programa run
        do {
            /*Loge*/
            // Se establece tres profesores
            System.out.println("""
                    ****** SISTEMA ******
                    1. Profesos Titular
                    2. Profesor Trabajo Practico
                    3. Profesor Gabinete
                    4. Motrar Profesores
                    5. Salir
                    """);
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hola, Profesor " + profesorTitular.apellido + " " + profesorTitular.nombre);
                    System.out.println(" ");
                    band0 = true;
                    break;
                case 2:
                    System.out.println("Hola, Profesor " + profesorTp.apellido + " " + profesorTp.nombre);
                    System.out.println(" ");
                    band1 = true;
                    break;
                case 3:
                    System.out.println("Hola, Profesor " + profesorGabinete.apellido + " " + profesorGabinete.nombre);
                    System.out.println(" ");
                    band2 = true;
                    break;
                case 4:
                    System.out.println("LISTA DE PROFESORES:");
                    System.out.println("1. " + profesorTitular);
                    System.out.println("2. " + profesorTp);
                    System.out.println("3. " + profesorGabinete);
                    System.out.println("4. Continuar");
                    System.out.println("""
                                          Desea editar?
                                          """);
                    int edit = teclado.nextInt();
                    if (edit == 1) {
                        System.out.print("id: ");
                        int id = teclado.nextInt();
                        System.out.print("Nombre: ");
                        String nombre = teclado.next();
                        System.out.print("Apellido: ");
                        String apellido = teclado.next();
                        String cargo = teclado.next();
                        profesorTitular = new Profesor(id, apellido, nombre,cargo);
                    } else if (edit == 2) {
                        System.out.print("id: ");
                        int id = teclado.nextInt();
                        System.out.print("Nombre: ");
                        String nombre = teclado.next();
                        System.out.print("Apellido: ");
                        String apellido = teclado.next();
                        System.out.println("Cargo: ");
                        String cargo = teclado.next();
                        profesorTp = new Profesor(id, apellido, nombre,cargo);
                    } else if (edit == 3) {
                        System.out.print("id: ");
                        int id = teclado.nextInt();
                        System.out.print("Nombre: ");
                        String nombre = teclado.next();
                        System.out.print("Apellido: ");
                        String apellido = teclado.next();
                        String cargo = teclado.next();
                        profesorGabinete = new Profesor(id, apellido, nombre,cargo);
                    } else{
                        System.out.println("Opcion incorrecta");
                    }
                    break;
                case 5:
                    salir0 = true;
                    band0 = false; band1 = false; band2 = false;
                    //inicializo bandera para continuar evita que ingrese al menu de alumnos
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

            if((band0 == true)||(band1 == true)||(band2 == true)) {
                do {

                    System.out.println("""
                    ****** SISTEMA ******
                    1. Lista Estudiantes
                    2. Agregar/Modificar Estudiante
                    3. Agregar Notas
                    4. Mostrar Notas
                    5. Salir
                    """);

                    int opcion1 = teclado.nextInt();


                    switch (opcion1) {
                        case 1:
                            System.out.println("LISTA DE ESTUDIANTES:");
                            System.out.println(alumno1);
                            System.out.println(alumno2);
                            System.out.println(alumno3);
                            break;
                        case 2:
                            if (band0 == true) {//solo la bandera del profesor titular puede realizar edit/modificar
                                System.out.println("AGREGAR/MODIFICAR ALUMNOS:");
                                System.out.println("1. " + alumno1);
                                System.out.println("2. " + alumno2);
                                System.out.println("3. " + alumno3);
                                System.out.println("4. Continuar");
                                System.out.println("""
                                          Desea editar?
                                          """);
                                int edit1 = teclado.nextInt();
                                if (edit1 == 1) {
                                    System.out.print("id: ");
                                    int id = teclado.nextInt();
                                    System.out.print("Nombre: ");
                                    String nombre = teclado.next();
                                    System.out.print("Apellido: ");
                                    String apellido = teclado.next();
                                    int notaexamen = 0, notapractica = 0, notagabinete = 0;
                                    alumno1 = new Alumno(id, apellido, nombre, notaexamen, notapractica, notagabinete);
                                } else if (edit1 == 2) {
                                    System.out.println("Alumno:");
                                    System.out.print("id: ");
                                    int id = teclado.nextInt();
                                    System.out.print("Nombre: ");
                                    String nombre = teclado.next();
                                    System.out.print("Apellido: ");
                                    String apellido = teclado.next();
                                    int notaexamen = 0, notapractica = 0, notagabinete = 0;
                                    alumno2 = new Alumno(id, apellido, nombre, notaexamen, notapractica, notagabinete);
                                } else if (edit1 == 3) {
                                    System.out.println("Alumno:");
                                    System.out.print("id: ");
                                    int id = teclado.nextInt();
                                    System.out.print("Nombre: ");
                                    String nombre = teclado.next();
                                    System.out.print("Apellido: ");
                                    String apellido = teclado.next();
                                    int notaexamen = 0, notapractica = 0, notagabinete = 0;
                                    alumno3 = new Alumno(id, apellido, nombre, notaexamen, notapractica, notagabinete);
                                } else{
                                System.out.println("Opcion incorrecta");
                                }
                                break;

                            } else{
                                System.out.println("No posee permiso de adm.");
                            }
                            break;
                        case 3:
                            System.out.println("AGREGAR NOTA:");// cada profesor tiene una bandera
                            if (band0 == true) {                // solo puede colocar una nota
                                band1 = false;
                                band2 = false;
                                System.out.println("Ingrese la nota del Examen final: ");
                                System.out.println("Alumno: " + alumno1.getApellido());
                                int notaexamen1 = teclado.nextInt();
                                alumno1.setNotaexamen(notaexamen1);
                                System.out.println("Alumno: " + alumno2.getApellido());
                                int notaexamen2 = teclado.nextInt();
                                alumno2.setNotaexamen(notaexamen2);
                                System.out.println("Alumno: " + alumno3.getApellido());
                                int notaexamen3 = teclado.nextInt();
                                alumno3.setNotaexamen(notaexamen3);
                            } else if (band1 == true) {
                                band0 = false;
                                band2 = false;
                                System.out.println("Ingrese la nota del Trabajo Practico: ");
                                System.out.println("Alumno: " + alumno1.getApellido());
                                int notapractica1 = teclado.nextInt();
                                alumno1.setNotapractica(notapractica1);
                                System.out.println("Alumno: " + alumno2.getApellido());
                                int notapractica2 = teclado.nextInt();
                                alumno2.setNotapractica(notapractica2);
                                System.out.println("Alumno: " + alumno3.getApellido());
                                int notapractica3 = teclado.nextInt();
                                alumno3.setNotapractica(notapractica3);

                            } else if (band2 == true) {
                                band0 = false;
                                band1 = false;
                                System.out.println("Ingrese la nota del Trabajo Practico: ");
                                System.out.println("Alumno: " + alumno1.getApellido());
                                int notagabinete1 = teclado.nextInt();
                                alumno1.setNotagabinete(notagabinete1);
                                System.out.println("Alumno: " + alumno2.getApellido());
                                int notagabinete2 = teclado.nextInt();
                                alumno2.setNotagabinete(notagabinete2);
                                System.out.println("Alumno: " + alumno3.getApellido());
                                int notagabinete3 = teclado.nextInt();
                                alumno3.setNotagabinete(notagabinete3);
                            }
                            break;
                        case 4:// se llama al funcion de la clase alumno para calcular nota final
                            System.out.println("NOTAS FINALES:");
                            System.out.println(alumno1.getApellido() + " Nota final: ");
                            alumno1.notaFinal();
                            System.out.println(alumno2.getApellido() + " Nota final: ");
                            alumno2.notaFinal();
                            System.out.println(alumno3.getApellido() + " Nota final: ");
                            alumno3.notaFinal();
                            break;
                        case 5:
                            salir1 = true;
                            break;
                        default:
                            System.out.println("Se a ingresado una opcion incorrecta.");
                    }
                } while(salir1 != true);
            }//inicializo las banderas para permitir acceso de los demas profesores
            band0 = false; band1 = false; band2 = false; salir1=false;
        } while(salir0 != true);
    }
}