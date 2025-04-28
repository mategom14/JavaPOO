package Encapsulamiento;

public class Main {
    public static void main (String[] args) {
        Celular celular1 = new Celular("Samsung", "A50", 0);

        celular1.mostrarInfo();
        System.out.println();

        celular1.setMarca("Motorola");
        celular1.setModelo("Edge 50 pro");
        celular1.setPrecio(1000000);

        celular1.mostrarInfo();
    }       
}