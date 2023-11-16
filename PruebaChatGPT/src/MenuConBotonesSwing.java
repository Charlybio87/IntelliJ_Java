import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuConBotonesSwing {

    public static void main(String[] args) {
        // Crear un nuevo objeto de la clase Formulario
        FormularioConBotones formulario = new FormularioConBotones();
        formulario.mostrarFormulario();
    }
}

// Clase que representa el formulario con menú y botones
class FormularioConBotones extends JFrame {

    // Componentes del formulario
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoID;

    // Constructor
    public FormularioConBotones() {
        // Configuración de la ventana
        setTitle("Formulario con Menú y Botones en Java");
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

        JMenuItem itemSalir = new JMenuItem("Salir");

        // Configurar acción para el elemento del menú "Salir"
        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Agregar elemento al menú
        menu.add(itemSalir);
        menuBar.add(menu);

        // Configurar el panel para los campos de entrada y los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(campoNombre);
        panel.add(new JLabel("Apellido:"));
        panel.add(campoApellido);
        panel.add(new JLabel("Edad:"));
        panel.add(campoEdad);
        panel.add(new JLabel("ID:"));
        panel.add(campoID);

        // Botones
        JButton botonGuardar = new JButton("Guardar");
        JButton botonSalir = new JButton("Salir");

        // Configurar acciones para los botones
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Agregar botones al panel
        panel.add(botonGuardar);
        panel.add(botonSalir);

        // Configurar el diseño del formulario
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

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

