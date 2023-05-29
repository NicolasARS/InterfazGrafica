package ConversorMillasKm;

import java.awt.Container;
import javax.swing.*;

@SuppressWarnings("serial")
public class Converter extends JFrame {
    final private Container container = getContentPane();

    final private JTextField textFieldMiles =  new JTextField();
    final private JTextField textFieldKilometers =  new JTextField();

    final private JPanel panel1 = new JPanel();
    final private JPanel panel2 = new JPanel();
    final private JButton btnConvertToKilometers = new JButton("-> Kms");
    final private JButton btnConvertToMiles = new JButton("-> Millas");

    final private JDialog resultado = new JDialog(this, true);


    /**
     * Create the frame.
     */
    public Converter() {
        createGUI();
        attachEvents();

    }
    private void createGUI() {
        //Código para crear el UI
        ;
        setTitle("Conversor Millas <-> Kilometros");
        setSize(500, 250);
        setResizable(true); //¿Se puede cambiar el tamaño?
        setLocationRelativeTo(null); //¿La posición es relativa a?
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        panel1.setBorder(BorderFactory.createTitledBorder("Millas a Kilometros."));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

        JLabel lblMiles = new JLabel("Millas:");
        panel1.add(lblMiles);

        panel1.add(textFieldMiles);
        textFieldMiles.setColumns(10);

        JLabel lblKilometers = new JLabel("Kilometros:");
        panel2.add(lblKilometers);

        panel2.add(textFieldKilometers);
        textFieldKilometers.setColumns(10);

        panel1.add(btnConvertToKilometers);

        panel2.add(btnConvertToMiles);

        panel2.setBorder(BorderFactory.createTitledBorder("Kilometros a Millas "));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        container.add(panel1);
        container.add(panel2);

        resultado.setSize(100, 100);
        resultado.setVisible(true);

    }
    private void attachEvents() {
        //Código para manejar los eventos
        ;
        btnConvertToKilometers.addActionListener((e) -> {
            double kms = 0;
            kms = Float.valueOf(textFieldMiles.getText()) * 1.609;
            JOptionPane.showMessageDialog(this, );
        });

        btnConvertToMiles.addActionListener((e) -> {
            textFieldMiles.setText("" + Float.valueOf(textFieldKilometers.getText()) / 1.609);
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Converter().setVisible(true));

    }
}
