package Ejercicio_POO_Cris;

import javax.swing.JOptionPane;

public class Cancha {
    

    public double ingresarDatos(String mensaje) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return lado;
    }

    public double calcularArea(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }
}
