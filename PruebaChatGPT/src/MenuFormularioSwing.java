import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFormularioSwing {

    public static void main(String[] args) {
        // Crear un nuevo objeto de la clase Formulario
        FormularioConMenu formulario = new FormularioConMenu();
        formulario.mostrarFormulario();
    }
}

// Clase que representa el formulario con menú
class FormularioConMenu extends JFrame {

    // Componentes del formulario
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoID;

    // Constructor
    public FormularioConMenu() {
        // Configuración de la ventana
        setTitle("Formulario con Menú en Java");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar componentes
        campoNombre = new JTextField(20);
        campoApellido = new JTextField(20);
        campoEdad = new JTextField(20);
        campoID = new JTextField(20);

        // Configurar el menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");

        JMenuItem itemGuardar = new JMenuItem("Guardar");
        JMenuItem itemSalir = new JMenuItem("Salir");

        // Configurar acciones para los elementos del menú
        itemGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });

        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Agregar elementos al menú
        menu.add(itemGuardar);
        menu.add(itemSalir);
        menuBar.add(menu);

        // Configurar el diseño del formulario
        setLayout(new GridLayout(5, 2));
        add(new JLabel("Nombre:"));
        add(campoNombre);
        add(new JLabel("Apellido:"));
        add(campoApellido);
        add(new JLabel("Edad:"));
        add(campoEdad);
        add(new JLabel("ID:"));
        add(campoID);

        // Configurar el menú en la ventana
        setJMenuBar(menuBar);
    }

    // Método para mostrar el formulario
    public void mostrarFormulario() {
        setVisible(true);
    }

    // Método para guardar los datos (puedes personalizar según tus necesidades)
    private void guardarDatos() {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String edad = campoEdad.getText();
        String id = campoID.getText();

        // Puedes realizar alguna acción con los datos, como imprimirlos en la consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("ID: " + id);
    }
}
