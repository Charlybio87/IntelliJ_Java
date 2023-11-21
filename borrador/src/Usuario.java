import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

class Usuario {
    private int id;
    private String nombre;
    private Date fechaAlta;
    private Date fechaModificacion;
    private String contraseña;
    private Date fechaNacimiento;

    // Constructor y métodos getter/setter aquí

    // Ejemplo de constructor
    public Usuario() {
        this.id = id;
        this.nombre = nombre;
        this.fechaAlta = new Date();
        this.fechaModificacion = new Date();
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
    }
}

class CRUDUsuarios extends JFrame {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private JTextArea resultadoTextArea;

    public CRUDUsuarios() {
        // Configuración de la interfaz gráfica
        setTitle("CRUD de Usuarios");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Componentes
        resultadoTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(resultadoTextArea);
        JButton btnCrear = new JButton("Crear Usuario");
        JButton btnBuscar = new JButton("Buscar Usuario");
        JButton btnListar = new JButton("Listar Usuarios");

        // Layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrear)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListar)
                        )
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(scrollPane)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCrear)
                                .addComponent(btnBuscar)
                                .addComponent(btnListar)
                        )
        );

        // Acciones de los botones
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear un nuevo usuario
                // Puedes agregar una nueva ventana de diálogo para ingresar los datos del usuario
                // y luego agregar el usuario a la lista
                Usuario nuevoUsuario;
                nuevoUsuario = new Usuario(
                        // Obtener datos del usuario (ID, nombre, contraseña, fecha de nacimiento, etc.)
                );
                listaUsuarios.add(nuevoUsuario);
                mostrarMensaje("Usuario creado exitosamente.");
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para buscar un usuario por ID
                // Puedes agregar una nueva ventana de diálogo para ingresar el ID del usuario a buscar
                // y luego buscar el usuario en la lista
                int idUsuarioBuscado = obtenerIdUsuarioDesdeDialogo();
                Usuario usuarioEncontrado = buscarUsuarioPorId(idUsuarioBuscado);
                if (usuarioEncontrado != null) {
                    mostrarMensaje("Usuario encontrado: " + usuarioEncontrado.toString());
                } else {
                    mostrarMensaje("Usuario no encontrado.");
                }
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para listar todos los usuarios
                mostrarUsuarios();
            }
        });
    }

    // Métodos auxiliares
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private void mostrarUsuarios() {
        resultadoTextArea.setText("");
        for (Usuario usuario : listaUsuarios) {
            resultadoTextArea.append(usuario.toString() + "\n");
        }
    }

    private int obtenerIdUsuarioDesdeDialogo() {
        // Puedes agregar aquí la lógica para obtener el ID del usuario desde una ventana de diálogo
        return 0;  // Reemplazar con la lógica real
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CRUDUsuarios().setVisible(true);
            }
        });
    }
}
