import java.util.Scanner; //paquete para poder usar scanner

public class SueldoOperario {

    public static void main(String[] ar) { //función:main, Modificador:Void (estática y publica para ser llamada de la mquina virtual de java)
        Scanner teclado=new Scanner(System.in); //objeto
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
        horasTrabajadas=teclado.nextInt(); //objeto:teclado y se llama por el metodo nextInt
        System.out.print("Ingrese el valor de la hora:");
        costoHora=teclado.nextFloat();
        sueldo=horasTrabajadas * costoHora;
        System.out.print("El empleado debe cobrar:");
        System.out.print(sueldo);
    }
}