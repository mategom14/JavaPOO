package Abstraction;

public interface Operaciones {

    void encender();
    void apagar();
} 

class Televisor implements Operaciones {

    @Override
    public void encender() {
        System.out.println("El televisor está encendido.");        
    }

    @Override
    public void apagar() {
        System.out.println("El televisor está apagado.");        
    }
}

class Radio implements Operaciones {

    @Override
    public void encender() {
        System.out.println("La radio está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La radio está apagada.");        
    }
}
