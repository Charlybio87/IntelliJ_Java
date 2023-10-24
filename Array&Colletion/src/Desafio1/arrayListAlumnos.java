package Desafio1;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crear un arrayList de 10 alumnos, que tengan los atributos:
 * nombre, apellido y dni.
 * y quiero que recorran y muestren a los alumnos,
 * y modifiquen 2 nombres de alumnos
 */
public class arrayListAlumnos {
    public static void main(String[] args) {
        /*Declaracion, instanciacion e inicializacion*/
        Scanner teclado = new Scanner(System.in);
        boolean band = false;
        ArrayList<Aula> alumnos = new ArrayList<Aula>();
      //ArrayList<tipo_Clase> nombreDelArray= new ArrayList<tipo_Clase>();
        do{
            // MENU del App
            /* El menu se encuentra dentro de una estructura repetitiva do-while
             * para mantener al programa en un ciclo continuo
             */
            System.out.println("""
                    ****** SISTEMA ******
                    1. Ingresar Alumnos
                    2. Modificar
                    3. Eliminar
                    4. Mostrar
                    5. Ingresar Notas
                    6. Salir
                    5. Salir
                    """);

             /* Se selecciona una opcion por teclado, y se emplea una condicion
              * multiple switch para ir saltando y ocupando los diverso metoso de los
              * arrayList
              */
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1://
                    System.out.println("Cuantos alumnos va ingresar: ");
                    int cantalum = teclado.nextInt();
                    for (int i = 1; i <(cantalum+1) ; i++) {
                        // por c/bucle for se ingresa un objeto
                        // (alumno) a la clase Aula.
                        System.out.print("""                            
                             Ingrese:
                             Nombre:
                             Apellido:
                             DNI:
                             """+i+". ");
                            String nomb1 = teclado.next();
                            String apel1 = teclado.next();
                            int dni1 = teclado.nextInt();
                        alumnos.add(new Aula(nomb1,apel1,dni1,0));
                        // se añaden elementos al ArrayList de
                        // la clase Aula
                    }
                    break;
                case 2:
                    System.out.println("Ingresar la posicion que desea modificar: ");
                    int posicion = teclado.nextInt();
                    posicion = posicion - 1;        //para visulizar mejor la posicion
                    System.out.println(alumnos.get(posicion));//visulizamos el objeto indicado
                    Aula modalum = new Aula(" ","",' ',' ');
                    //se crea una nuevo objeto en la clase aula
                    modalum.setNombre(teclado.next());
                    modalum.setApellido(teclado.next());
                    modalum.setDni(teclado.nextInt());
                    // a traves del metodo set del Arraylist se puede reemplazar
                    // por un nuevo objeto estableciendo la posicion a sustituir.
                    alumnos.set(posicion,modalum);
                    break;
                case 3:
                    System.out.println("¿Que alumno desea eliminar del 1 al " +
                            " "+alumnos.size()+"?" );
                    //muestra la longitud del arraylist
                    int elim = teclado.nextInt();
                    elim = elim - 1;
                    alumnos.remove(elim);
                    //elimina una objeto de la posicion seleccionada
                    break;
                case 4:
                    for (Aula miAlumnos:alumnos){
                        //for eahc
                 //tipo_Clase Elementos:nombreDelArray
                        System.out.println(miAlumnos.toString());
                        // Imprime todas los objetos alumnos
                        // Uso de bucle for each
                    }
                    break;
                case 5:
                    System.out.println("Seleccione alumno para colocar la nota:");
                    /*BUSCAR ALUMNO POR METODO FOR-EACH*/
                    String nombreABuscar = teclado.next();
                    Aula elementoBuscado = null;
                    for (Aula objeto : alumnos) {
                        if (objeto.getNombre().equals(nombreABuscar)) {
                            elementoBuscado = objeto;
                            break; // Si ya encontraste el elemento, puedes salir del bucle.
                        }
                    }
                    if (elementoBuscado != null) {
                        // Hacer algo con el elemento encontrado
                        System.out.println("Elemento encontrado: " + elementoBuscado.getNombre());
                        System.out.print("Ingrese nota: ");
                        elementoBuscado.setNota(teclado.nextInt());
                        //se llama a un metodo calificacion dentro de la clase Aulo.
                        elementoBuscado.calificacion();
                    } else {
                        System.out.println("Elemento no encontrado");
                    }
                    break;
                case 6:
                    band = true;
                    break;
                default:
                    System.out.println("El valor no corresponde: " + opcion);
            }
        }while(band !=true);
    }
}