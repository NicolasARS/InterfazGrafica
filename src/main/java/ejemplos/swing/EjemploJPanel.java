package ejemplos.swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class EjemploJPanel extends JFrame {
    public EjemploJPanel() {
        //Recordad que todos los métodos hacen referencia a this (es decir al JFrame)
        setTitle("Hola!!!");
        setResizable(false); //¿Se puede cambiar el tamaño?
        setSize(300, 500);

        // Le pido al JFrame su objeto contenedor
        Container contentpane = getContentPane();

        // Creo un objeto de tipo JPanel
        JPanel panel = new JPanel();

        // Añado el panel en el objeto contenedor del frame
        contentpane.add(panel);

        // Pongo el color de fondo del panel de color rojo
        panel.setBackground(Color.RED);

        //Y le añado un botón anónimo
        panel.add(new JButton("Click aquí"));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new EjemploJPanel();
            }
        });
    }
}