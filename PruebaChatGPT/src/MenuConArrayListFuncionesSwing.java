import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuConArrayListFuncionesSwing {

    public static void main(String[] args) {
        // Crear un nuevo objeto de la clase Formulario
        FormularioConArrayListFunciones formulario = new FormularioConArrayListFunciones();
        formulario.mostrarFormulario();
    }
}

// Clase que representa el formulario con menú y botones
class FormularioConArrayListFunciones extends JFrame {

    // Componentes del formulario
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoID;

    // Lista para almacenar los datos
    private ArrayList<String> datosGuardados;

    // Constructor
    public FormularioConArrayListFunciones() {
        // Configuración de la ventana
        setTitle("Formulario con Menú y ArrayList en Java");
        setSize(400, 250);
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
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuOpciones = new JMenu("Opciones");

        JMenuItem itemSalir = new JMenuItem("Salir");
        JMenuItem itemMostrarLista = new JMenuItem("Mostrar Lista");
        JMenuItem itemEliminar = new JMenuItem("Eliminar");
        JMenuItem itemCargar = new JMenuItem("Cargar");

        // Configurar acciones para los elementos del menú
        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        itemMostrarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarLista();
            }
        });

        itemEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarDatos();
            }
        });

        itemCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarDatos();
            }
        });

        // Agregar elementos al menú
        menuArchivo.add(itemSalir);
        menuOpciones.add(itemMostrarLista);
        menuOpciones.add(itemEliminar);
        menuOpciones.add(itemCargar);

        // Agregar menús a la barra de menú
        menuBar.add(menuArchivo);
        menuBar.add(menuOpciones);

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

        // Mostrar un mensaje de éxito (puedes personalizar esto según tus necesidades)
        JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
    }

    // Método para mostrar la lista de datos guardados
    private void mostrarLista() {
        // Crear una cadena con los datos para mostrar
        StringBuilder lista = new StringBuilder("Lista de Datos:\n");
        for (String dato : datosGuardados) {
            lista.append(dato).append("\n");
        }

        // Mostrar la lista en un cuadro de diálogo
        JOptionPane.showMessageDialog(this, lista.toString());
    }

    // Método para eliminar datos de la lista
    private void eliminarDatos() {
        // Mostrar un cuadro de diálogo para ingresar el índice a eliminar
        String indiceEliminar = JOptionPane.showInputDialog(this, "Ingrese el índice a eliminar:");

        try {
            // Convertir la entrada a un número entero
            int indice = Integer.parseInt(indiceEliminar);

            // Verificar si el índice está en el rango válido
            if (indice >= 0 && indice < datosGuardados.size()) {
                // Eliminar el elemento en el índice especificado
                datosGuardados.remove(indice);
                JOptionPane.showMessageDialog(this, "Elemento eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Índice no válido");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el índice");
        }
    }

    // Método para cargar datos previos desde el ArrayList
    private void cargarDatos() {
        // Verificar si hay datos guardados en la lista
        if (!datosGuardados.isEmpty()) {
            // Mostrar un cuadro de diálogo para confirmar la carga de datos
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "¿Desea cargar datos previos?\nEsto sobrescribirá los datos actuales.",
                    "Cargar Datos",
                    JOptionPane.YES_NO_OPTION
            );

            // Si el usuario elige "Sí", cargar los datos
            if (respuesta == JOptionPane.YES_OPTION) {
                // Limpiar la lista actual
                datosGuardados.clear();

                // Agregar datos de ejemplo (puedes cargar desde un archivo o base de datos en la práctica)
                datosGuardados.add("Nombre: Juan, Apellido: Pérez, Edad: 25, ID: 001");
                datosGuardados.add("Nombre: María, Apellido: López, Edad: 30, ID: 002");

                JOptionPane.showMessageDialog(this, "Datos cargados correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay datos guardados para cargar");
        }
    }
}
