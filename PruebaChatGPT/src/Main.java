import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] args) {
        // Crear el formulario en el hilo de eventos de la interfaz gráfica
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    private static void crearYMostrarGUI() {
        // Crear el frame (ventana principal)
        JFrame frame = new JFrame("Formulario Básico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear y agregar el panel al frame
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        // Llamar al método para agregar componentes al panel
        agregarComponentes(panel);

        // Ajustar el tamaño del frame y hacerlo visible
        frame.pack();
        frame.setVisible(true);
    }

    private static void agregarComponentes(JPanel panel) {
        // Layout null para posicionar manualmente los componentes
        panel.setLayout(null);

        // Crear etiqueta
        JLabel etiqueta = new JLabel("Ingrese texto:");
        etiqueta.setBounds(10, 20, 80, 25);
        panel.add(etiqueta);

        // Crear campo de texto
        JTextField campoTexto = new JTextField(20);
        campoTexto.setBounds(100, 20, 165, 25);
        panel.add(campoTexto);

        // Crear botón
        JButton boton = new JButton("Mostrar Mensaje");
        boton.setBounds(10, 50, 150, 25);

        // Agregar un ActionListener al botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el texto del campo de texto
                String texto = campoTexto.getText();

                // Mostrar el mensaje en la consola
                System.out.println("Texto ingresado: " + texto);
            }
        });

        panel.add(boton);
    }
}

