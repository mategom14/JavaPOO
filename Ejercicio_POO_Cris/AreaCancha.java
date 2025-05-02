package Ejercicio_POO_Cris;

public class AreaCancha {
    public static void main (String[] args) {
        double ladoA_1, ladoB_1, ladoA_2, ladoB_2, ladoA_3, ladoB_3;
        String mensaje = "Ingrese la longitud: ";

        Cancha cancha_1 = new Cancha();
        ladoA_1 = cancha_1.ingresarDatos(mensaje);
        ladoB_1 = cancha_1.ingresarDatos(mensaje);
        
        System.out.println("El area de la cancha es: " + cancha_1.calcularArea(ladoA_1, ladoB_1));

        Cancha cancha_2 = new Cancha();
        ladoA_2 = cancha_2.ingresarDatos(mensaje);
        ladoB_2 = cancha_2.ingresarDatos(mensaje);
        
        System.out.println("El area de la cancha es: " + cancha_2.calcularArea(ladoA_2, ladoB_2));

        Cancha cancha_3 = new Cancha();
        ladoA_3 = cancha_3.ingresarDatos(mensaje);
        ladoB_3 = cancha_3.ingresarDatos(mensaje);
        
        System.out.println("El area de la cancha es: " + cancha_3.calcularArea(ladoA_3, ladoB_3)); 
    }
}
