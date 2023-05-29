package ejemplos.swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class EjemploJTextField extends JFrame {

    public EjemploJTextField() {

        setTitle("DATOS");
        setSize(300, 200);

        JLabel lblNombre = new JLabel("Nombre");

        JTextField txtNombre = new JTextField(18);

        JLabel lblEdad = new JLabel("Edad");

        JTextField txtEdad = new JTextField(10);

        JLabel lblDireccion = new JLabel("Direccion");

        JTextField txtDireccion = new JTextField(18);

        Container contentpane = getContentPane();

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        //Añadir los controles al panel
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblEdad);
        panel.add(txtEdad);
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(new JButton("Enviar"));


        contentpane.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new EjemploJTextField();
            }
        });
    }
}
