import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int opcion;
        Scanner Teclado = new Scanner(System.in);
        int num1,num2;
        boolean bandera;
        bandera = true;

        do {
            System.out.println("Ingrese opcion:");
            System.out.println("1- Suma");
            System.out.println("2- Salir");

            opcion= Teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese los dos numeros:");
                    num1 = Teclado.nextInt();
                    num2 = Teclado.nextInt();
                    System.out.println("Suma:" +(num1+num2));
                break;
                case 2: bandera = false;

            }

            System.out.println("Ingrese dos numeros ");
        }while (bandera);
    }
}
