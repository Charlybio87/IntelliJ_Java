public class Main {
    public static void main(String[] args) {

        Pais miPais = new Pais("Argentina");
        miPais.setNombre("Uruguay"); //modificar el nombre del pais
        String nombrePais;
        nombrePais = miPais.getNombre(); //muestra el nombre
        System.out.println(miPais);

        Operaciones misOperaciones= new Operaciones(2,5);

        int resultado;
        resultado = sumar (2,5);
        misOperaciones.sumar2(20,40);

        String saludo = saludar();
        restar(20,30);
        int resultado2 = restar2(80,20);

    }
    public static void restar(int num1,int num2){
        System.out.println("la resta es:" + (num1 - num2));
    }
    public static int restar2(int num1,int num2){
        return (num1 - num2);
    }
    public static String saludar(){ // static por ser static el main
        return "Hola buenos dias...";
    }
    public static int sumar (int num1, int num2){
        return (num1 + num2);
    }
}