package Desafio1;

import array.pais.Pais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Crear un arrayList de 10 alumnos, que tengan los atributos:
 * nombre, apellido y dni.
 * y quiero que recorran y muestren a los alumnos,
 * y modifiquen 2 nombres de alumnos
 */
public class arrayListAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean band = false;
        ArrayList<Aula> alumnos = new ArrayList<Aula>();

        do{
            System.out.println("""
                    ****** SISTEMA ******
                    1. Ingresar Alumnos
                    2. Modificar
                    3. Eliminar
                    4. Motrar
                    5. Salir
                    """);
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuantos alumnos va ingresar: ");
                    int cantalum = teclado.nextInt();
                    for (int i = 1; i <(cantalum+1) ; i++) {
                        System.out.print("""
                             Ingrese:
                             Nombre 
                             Apellido 
                             DNI:
                             """+i+". ");
                            String nomb1 = teclado.next();
                            String apel1 = teclado.next();
                            int dni1 = teclado.nextInt();
                        alumnos.add(new Aula(nomb1,apel1,dni1));
                    }
                    break;
                case 2:
                    System.out.println("Ingresar la posicion que desea modificar: ");
                    int posicion = teclado.nextInt();
                    posicion = posicion - 1;
                    System.out.println(alumnos.get(posicion));
                    //System.out.println(alumnos.set(posicion));
                    Aula modalum = new Aula(" ","",' ');
                    modalum.setNombre(teclado.next());
                    modalum.setApellido(teclado.next());
                    modalum.setDni(teclado.nextInt());
                    alumnos.set(posicion,modalum);
                    break;
                case 3:
                    System.out.println("Que alumno desea eliminar del 1 al "+alumnos.size()+"?" );
                    int elim = teclado.nextInt();
                    elim = elim - 1;
                    alumnos.remove(elim);
                    break;
                case 4:
                    for (Aula miAlumnos:alumnos){
                        System.out.println(miAlumnos.toString());
                    }
                    break;
                case 5:
                    band = true;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcion);
            }

        }while(band !=true);

    }
}