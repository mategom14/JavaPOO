package Abstraction;

import java.util.ArrayList;

public class Main_Figura {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        Figura circulo_1 = new Circulo("Rojo", 3.5);
        figuras.add(circulo_1);

        Figura rectangulo_1 = new Rectangulo("Azul", 4, 5);
        figuras.add(rectangulo_1);

        for (Figura figura : figuras) {
            if (figura instanceof Circulo) {
                System.out.println("Circulo:");
                figura.mostrarColor();
                figura.calcularArea();
                System.out.println();
            } else if (figura instanceof Rectangulo) {
                System.out.println("Rectángulo: ");
                figura.mostrarColor();
                figura.calcularArea();
                System.out.println();
            }
        }
    }
}
