package Herencia_Polim;

public class Main {
    public static void main (String[] args) {
       Vehiculo vehiculo1 = new Carro("Nissan", "March Active", 4);
       Vehiculo vehiculo2 = new Moto("Yamaha", "R6", 6);

       vehiculo1.mostrarInfo();
       System.out.println();
       vehiculo2.mostrarInfo();
       System.out.println();
    }
}