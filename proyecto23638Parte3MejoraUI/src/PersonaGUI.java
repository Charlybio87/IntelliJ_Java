import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PersonaGUI extends JFrame {
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private JTable table;
    private PersonaTableModel tableModel;

    public PersonaGUI() {
        setTitle("CRUD de Personas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        // Crear tabla y modelo
        tableModel = new PersonaTableModel(listaPersonas);
        table = new JTable(tableModel);

        // Crear paneles
        JPanel panelBotones = new JPanel();
        JPanel panelTabla = new JPanel();

        // Crear botones
        JButton btnCrear = new JButton("Crear");
        JButton btnLeer = new JButton("Leer");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");

        // Agregar botones al panel de botones
        panelBotones.add(btnCrear);
        panelBotones.add(btnLeer);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);

        // Agregar tabla al panel de la tabla
        panelTabla.add(new JScrollPane(table));

        // Agregar paneles al JFrame
        add(panelBotones, BorderLayout.NORTH);
        add(panelTabla, BorderLayout.CENTER);

        // Manejar eventos de los botones
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearPersona();
            }
        });

        btnLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Actualizar el modelo de la tabla
                tableModel.fireTableDataChanged();
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarPersona();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPersona();
            }
        });
    }

    private void crearPersona() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección:");
        String fechaNacimientoStr = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (en formato dd/MM/yyyy):");

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaNacimiento = dateFormat.parse(fechaNacimientoStr);

            Persona nuevaPersona = new Persona(nombre, direccion, fechaNacimiento);
            listaPersonas.add(nuevaPersona);

            // Actualizar el modelo de la tabla
            tableModel.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "Persona creada exitosamente.");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Error al procesar la fecha de nacimiento. Asegúrese de ingresar el formato correcto (dd/MM/yyyy).");
        }
    }

    private void actualizarPersona() {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) {
            Persona personaActualizar = listaPersonas.get(filaSeleccionada);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:", personaActualizar.getNombre());
            String nuevaDireccion = JOptionPane.showInputDialog("Ingrese la nueva dirección:", personaActualizar.getDireccion());
            String nuevaFechaNacimientoStr = JOptionPane.showInputDialog("Ingrese la nueva fecha de nacimiento (en formato dd/MM/yyyy):", dateFormat.format(personaActualizar.getFechaNacimiento()));

            if (nuevoNombre != null) {
                personaActualizar.setNombre(nuevoNombre);
            }

            if (nuevaDireccion != null) {
                personaActualizar.setDireccion(nuevaDireccion);
            }

            if (nuevaFechaNacimientoStr != null) {
                try {

                    Date nuevaFechaNacimiento = dateFormat.parse(nuevaFechaNacimientoStr);
                    personaActualizar.setFechaNacimiento(nuevaFechaNacimiento);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Error al procesar la fecha de nacimiento. La fecha no se ha actualizado.");
                }
            }

            // Actualizar el modelo de la tabla
            tableModel.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "Persona actualizada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una persona para actualizar.");
        }
    }

    private void eliminarPersona() {
        int filaSeleccionada = table.getSelectedRow();

        if (filaSeleccionada != -1) {
            listaPersonas.remove(filaSeleccionada);

            // Actualizar el modelo de la tabla
            tableModel.fireTableDataChanged();

            JOptionPane.showMessageDialog(this, "Persona eliminada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una persona para eliminar.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonaGUI().setVisible(true);
            }
        });
    }
}
