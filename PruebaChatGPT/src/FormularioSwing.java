import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioSwing extends JFrame {
    private JLabel etiqueta;
    private JTextField campoTexto;
    private JButton boton;

    public FormularioSwing() {
        // Configurar el JFrame
        setTitle("Ejemplo de Formulario");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        etiqueta = new JLabel("Introduce tu nombre:");
        campoTexto = new JTextField(0);
        boton = new JButton("Saludar");

        // Configurar el diseño del JFrame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Agregar componentes al JFrame
        //setLayout(new GridLayout(2, 0));
        add(etiqueta);
        add(campoTexto);
        add(boton);

        // Configurar el ActionListener para el botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                JOptionPane.showMessageDialog(FormularioSwing.this, "¡Hola, " + nombre +
                        " te estamos observando!");
            }
        });
    }

    public static void main(String[] args) {
        // Crear y mostrar el formulario
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularioSwing().setVisible(true);
            }
        });
    }
}
