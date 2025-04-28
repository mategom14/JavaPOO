package ZooVirtual;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal animal1 = new Leon("Leoncio", 5, 10);
        Animal animal2 = new Loro("Roberto", 3, "Hola, Hola!");

        animales.add(animal1);
        animales.add(animal2);

        animal1.mostrarInfo();
        System.out.println();
        animal2.mostrarInfo();

        System.out.println();

        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
            System.out.println();
        }
    }
}