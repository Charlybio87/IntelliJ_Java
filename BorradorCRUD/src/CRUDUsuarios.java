import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class CRUDUsuarios extends JFrame {
    private ArrayList<Usuario> usuarios;
    private JTextField tfId, tfNombre, tfFechaAlta, tfFechaModificacion, tfPassword, tfFechaNacimiento;
    private JTextArea taUsuarios;

    public CRUDUsuarios() {
        usuarios = new ArrayList<>();

        // Configuración de la interfaz gráfica
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CRUD de Usuarios");

        JLabel lblId = new JLabel("ID:");
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblFechaAlta = new JLabel("Fecha de Alta:");
        JLabel lblFechaModificacion = new JLabel("Fecha de Modificación:");
        JLabel lblPassword = new JLabel("Contraseña:");
        JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");

        tfId = new JTextField(10);
        tfNombre = new JTextField(20);
        tfFechaAlta = new JTextField(20);
        tfFechaModificacion = new JTextField(20);
        tfPassword = new JTextField(20);
        tfFechaNacimiento = new JTextField(20);

        JButton btnCrear = new JButton("Crear");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnListar = new JButton("Listar");

        taUsuarios = new JTextArea(10, 50);
        taUsuarios.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taUsuarios);

        // Configuración del diseño de la interfaz
        setLayout(new FlowLayout());

        add(lblId);
        add(tfId);

        add(lblNombre);
        add(tfNombre);

        add(lblFechaAlta);
        add(tfFechaAlta);

        add(lblFechaModificacion);
        add(tfFechaModificacion);

        add(lblPassword);
        add(tfPassword);

        add(lblFechaNacimiento);
        add(tfFechaNacimiento);

        add(btnCrear);
        add(btnBuscar);
        add(btnActualizar);
        add(btnEliminar);
        add(btnListar);

        add(scrollPane);

        // Manejo de eventos
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearUsuario();
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarUsuario();
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarUsuario();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarUsuario();
            }
        });

        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarUsuarios();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Métodos para manipular la lista de usuarios
    private void crearUsuario() {
        int id = Integer.parseInt(tfId.getText());
        String nombre = tfNombre.getText();
        Date fechaAlta = new Date();
        Date fechaModificacion = new Date();
        String password = tfPassword.getText();
        String fechaNacimiento = tfFechaNacimiento.getText();

        Usuario usuario = new Usuario(id, nombre, fechaAlta, fechaModificacion, password, fechaNacimiento);
        usuarios.add(usuario);

        limpiarCampos();
        actualizarTextArea();
    }

    private void buscarUsuario() {
        int id = Integer.parseInt(tfId.getText());

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                tfNombre.setText(usuario.getNombre());
                tfFechaAlta.setText(usuario.getFechaAlta().toString());
                tfFechaModificacion.setText(usuario.getFechaModificacion().toString());
                tfPassword.setText(usuario.getPassword());
                tfFechaNacimiento.setText(usuario.getFechaNacimiento());
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        limpiarCampos();
    }

    private void actualizarUsuario() {
        int id = Integer.parseInt(tfId.getText());

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuario.setNombre(tfNombre.getText());
                usuario.setFechaModificacion(new Date());
                usuario.setPassword(tfPassword.getText());
                usuario.setFechaNacimiento(tfFechaNacimiento.getText());

                limpiarCampos();
                actualizarTextArea();
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        limpiarCampos();
    }

    private void eliminarUsuario() {
        int id = Integer.parseInt(tfId.getText());

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuarios.remove(usuario);

                limpiarCampos();
                actualizarTextArea();
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Usuario no encontrado");
        limpiarCampos();
    }

    private void listarUsuarios() {
        actualizarTextArea();
    }

    private void actualizarTextArea() {
        taUsuarios.setText("");

        for (Usuario usuario : usuarios) {
            taUsuarios.append(usuario.toString() + "\n");
        }
    }

    private void limpiarCampos() {
        tfId.setText("");
        tfNombre.setText("");
        tfFechaAlta.setText("");
        tfFechaModificacion.setText("");
        tfPassword.setText("");
        tfFechaNacimiento.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CRUDUsuarios();
            }
        });
    }
}