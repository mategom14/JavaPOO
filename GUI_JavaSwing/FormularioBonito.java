package GUI_JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FormularioBonito {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Personas");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<Persona_GUI> listaPersonas = new ArrayList<>();   

        // Usamos GridBagLayout para tener mejor control
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 5, 10); // margen alrededor de cada componente

        JLabel labelNombre = new JLabel("Nombre:");
        JTextField campoNombre = new JTextField(15);

        JLabel labelCorreo = new JLabel("Correo:");
        JTextField campoCorreo = new JTextField(15);

        JLabel labelEdad = new JLabel("Edad:");
        JTextField campoEdad = new JTextField(5);

        // Fila 1 - Nombre
        gbc.gridx = 0; gbc.gridy = 0; gbc.anchor = GridBagConstraints.WEST;
        panel.add(labelNombre, gbc);

        gbc.gridx = 1;
        panel.add(campoNombre, gbc);

        // Fila 2 - Correo
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(labelCorreo, gbc);

        gbc.gridx = 1;
        panel.add(campoCorreo, gbc);

        // Fila 3 - Edad
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(labelEdad, gbc);

        gbc.gridx = 1;
        panel.add(campoEdad, gbc);

        // Fila 4 - Botón
        JButton botonRegistrar = new JButton("Registrar");
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(botonRegistrar, gbc);

        // Acción del botón
        botonRegistrar.addActionListener(_ -> {
            String nombre = campoNombre.getText().trim();
            String correo = campoCorreo.getText().trim();
            String edadTexto = campoEdad.getText().trim();

            if (nombre.isEmpty() || correo.isEmpty() || edadTexto.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Todos los campos son obligatorios.");
                return;
            }

            try {
                int edad = Integer.parseInt(edadTexto);
                Persona_GUI persona = new Persona_GUI(nombre, correo, edad);
                listaPersonas.add(persona);

                JOptionPane.showMessageDialog(frame, "Registro exitoso:\n" + persona);

                campoNombre.setText("");
                campoCorreo.setText("");
                campoEdad.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Edad debe ser un número válido.");
            }
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null); // Centra la ventana
        frame.setVisible(true);
    }
}
