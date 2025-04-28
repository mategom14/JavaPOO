package GUI_Java;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {

    JPanel miPanel;
    JLabel miTitulo, label1, label2, label3, label4;
    JButton miBoton;
    JTextField campo_1, campo_2, campo_3, campo_4;

    public VentanaPrincipal() {

        iniciarComponentes();
        setTitle("Promedio de Notas");
        setSize(390, 250);
        setLocationRelativeTo(null);

    }

    private void iniciarComponentes() {

        miPanel = new JPanel();
        miPanel.setLayout(null);
        miPanel.setBackground(Color.lightGray);

        miTitulo = new JLabel();
        miTitulo.setText("Calcula el promedio de tus notas");
        miTitulo.setBounds(100, 12, 200, 30);

        campo_1 = new JTextField();
        campo_1.setBounds(40, 80, 60, 30);

        campo_2 = new JTextField();
        campo_2.setBounds(160, 80, 60, 30);

        campo_3 = new JTextField();
        campo_3.setBounds(280, 80, 60, 30);

        label1 = new JLabel("Nota 1:");
        label1.setBounds(40, 60, 60, 20);

        label2 = new JLabel("Nota 2:");
        label2.setBounds(160, 60, 60, 20);

        label3 = new JLabel("Nota 3:");
        label3.setBounds(280, 60, 60, 20);

        miBoton = new JButton();
        miBoton.setText("Calcular");
        miBoton.setBounds(110, 150, 150, 30);
        miBoton.addActionListener(this);

        miPanel.add(miTitulo);

        miPanel.add(campo_1);
        miPanel.add(campo_2);
        miPanel.add(campo_3);

        miPanel.add(label1);
        miPanel.add(label2);
        miPanel.add(label3);

        miPanel.add(miBoton);

        add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double suma = Double.parseDouble(campo_1.getText()) +
                Double.parseDouble(campo_2.getText()) +
                Double.parseDouble(campo_3.getText());
        if (e.getSource() == miBoton) {
            JOptionPane.showMessageDialog(
                    null, "El promedio es: " + suma / 3);
        }
    }
}