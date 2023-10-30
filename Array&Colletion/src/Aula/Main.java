package Aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        var salir=false;
        while (!salir) {
            menuprincipal();
            salir = datosalumnos();
        }
    }

    public static void menuprincipal(){
        System.out.println("""
                    ****** SISTEMA ******
                    1. Ingresar Alumnos
                    2. Modificar
                    3. Eliminar
                    4. Mostrar
                    5. Ingresar Notas
                    6. Salir
                    """);
    }

    public static boolean datosalumnos(){ // como voy a devolver una bandera
                                          // coloco boolean

        ArrayList<Alumnos> misAlumnos = new ArrayList<Alumnos>();
        Scanner teclado=new Scanner(System.in);
        int opcion = teclado.nextInt();
        var salir=false;

        switch (opcion) {
            case 1:
                System.out.println("Cuantos alumnos va ingresar: ");
                int cantidadAlum = teclado.nextInt();
                for (int i = 1; i < (cantidadAlum + 1); i++) {
                    // por c/bucle for se ingresa un objeto
                    // (alumno) a la clase Aula.
                    System.out.print("""                            
                            =====*Ingrese*=====
                                                             
                            Nombre:
                            Apellido:
                            DNI:
                            """ + i + ". ");
                    String nombre = teclado.next();
                    String apellido = teclado.next();
                    int dni = teclado.nextInt();
                    misAlumnos.add(new Alumnos(nombre, apellido, dni));
                    // se añaden elementos al ArrayList de
                    // la clase Aula
                }
                break;
            case 2:
                System.out.println("Ingresar la posicion que desea modificar: ");
                int posicion = teclado.nextInt();
                posicion = posicion - 1;        //para visulizar mejor la posicion
                System.out.println(misAlumnos.get(posicion));//visulizamos el objeto indicado
                Alumnos modalum = new Alumnos(" ", "", ' ');
                //se crea una nuevo objeto en la clase aula
                modalum.setNombre(teclado.next());
                modalum.setApellido(teclado.next());
                modalum.setDni(teclado.nextInt());
                // a traves del metodo set del Arraylist se puede reemplazar
                // por un nuevo objeto estableciendo la posicion a sustituir.
                misAlumnos.set(posicion, modalum);
                break;
            case 3:
                System.out.println("¿Que alumno desea eliminar del 1 al " +
                        " " + misAlumnos.size() + "?");
                //muestra la longitud del arraylist
                int elim = teclado.nextInt();
                elim = elim - 1;
                misAlumnos.remove(elim);
                //elimina una objeto de la posicion seleccionada

                break;
            case 6:
                salir = true;
                break;
            default:
                System.out.println("El valor" + opcion + "no corresponde.");
        }
        return salir;
    }
}