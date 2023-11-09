import javax.swing.*;

public class menu {
    public static void main(String[] args) {
        int opcion;
        while (true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:"+"\n"+
                    "1. Cargar Productos."+"\n"+
                    "2. Modificar Producto."+"\n"+
                    "3. Eliminar Producto."+"\n"+
                    "4. Listar Productos."+"\n"+
                    "5. Salir"
                    ));
            switch (opcion){
                case 1:
                    JOptionPane.showInputDialog("Ingrese nuevo Producto: ");

                    break;
                case 2:
                    JOptionPane.showInputDialog("Ingrese Producto a Modificar: ");
                    break;
                case 3:
                    JOptionPane.showInputDialog("Ingrese el Producto a Eliminar: ");
                    break;
                case 4:
                    JOptionPane.showInputDialog("Listar los Productos: ");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showInputDialog(null,"Opcion Invalida.");
            }


        }
    }
}
