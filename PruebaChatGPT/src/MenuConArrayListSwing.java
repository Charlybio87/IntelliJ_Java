import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuConArrayListSwing {

    public static void main(String[] args) {
        // Crear un nuevo objeto de la clase Formulario
        FormularioConArrayList formulario = new FormularioConArrayList();
        formulario.mostrarFormulario();
    }
}

// Clase que representa el formulario con menú y botones
class FormularioConArrayList extends JFrame {

    // Componentes del formulario
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoID;

    // Lista para almacenar los datos
    private ArrayList<String> datosGuardados;

    // Constructor
    public FormularioConArrayList() {
        // Configuración de la ventana
        setTitle("Formulario con Menú y ArrayList en Java");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializar componentes
        campoNombre = new JTextField(20);
        campoApellido = new JTextField(20);
        campoEdad = new JTextField(20);
        campoID = new JTextField(20);

        // Inicializar la lista
        datosGuardados = new ArrayList<>();

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
        JButton botonGuardar = new JButton("Guardar en ArrayList");
        JButton botonSalir = new JButton("Salir");

        // Configurar acciones para los botones
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatosEnArrayList();
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

    // Método para guardar los datos en el ArrayList
    private void guardarDatosEnArrayList() {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String edad = campoEdad.getText();
        String id = campoID.getText();

        // Crear una cadena con los datos
        String datos = "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", ID: " + id;

        // Agregar la cadena al ArrayList
        datosGuardados.add(datos);

        // Limpiar los campos de entrada
        campoNombre.setText("");
        campoApellido.setText("");
        campoEdad.setText("");
        campoID.setText("");

        // Imprimir los datos guardados en la consola (puedes personalizar esto según tus necesidades)
        System.out.println("Datos Guardados:");
        for (String dato : datosGuardados) {
            System.out.println(dato);
        }
    }
}
   /* Este ejemplo utiliza un ArrayList<String> llamado datosGuardados para almacenar las cadenas
   que representan los datos ingresados. El método guardarDatosEnArrayList() toma los datos de los
   campos de entrada, los concatena en una cadena y luego agrega esa cadena al ArrayList. También
   limpia los campos de entrada después de guardar los datos. Puedes personalizar este código
   según tus necesidades específicas.*/