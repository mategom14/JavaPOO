package RetoFinal_POO;

import java.util.ArrayList;

public class Main_reto {
    public static void main(String[] args) {
        ArrayList<Sistema_vehiculos> vehiculos = new ArrayList<>();
        Sistema_vehiculos carro_1 = new 
        Carro("Nissan", "March", 64000000, 4);
        vehiculos.add(carro_1);

        Sistema_vehiculos carro_2 = new 
        Carro("Toyota", "Yaris Cross", 120000000, 4);
        vehiculos.add(carro_2);

        Sistema_vehiculos moto_1 = new
        Moto("Suzuki", "Gixxer", 18000000, 249.8);
        vehiculos.add(moto_1);
        
        Sistema_vehiculos moto_2 = new 
        Moto("Ducati", "Monster", 45000000, 899.6);
        vehiculos.add(moto_2);

        for (Sistema_vehiculos vehiculo : vehiculos) {
            if (vehiculo instanceof Carro) {
                System.out.println("Este vehiculo es un carro: \n");
                vehiculo.mostrarInfo();
                System.out.println();
            } else if (vehiculo instanceof Moto) {
                System.out.println("Este vehiculo es una moto: \n");
                vehiculo.mostrarInfo();
                System.out.println();
            }
        }
    }
}
