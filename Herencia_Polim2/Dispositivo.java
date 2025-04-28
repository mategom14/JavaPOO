public class Dispositivo {
    protected String marca;
    protected double precio;

    public Dispositivo(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
    }
}

class CelularN1 extends Dispositivo {
    protected String modelo;

    public CelularN1(String marca, double precio, String modelo) {
        super(marca, precio);
        this.modelo = modelo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Modelo: " + modelo);
    }
}

class Tablet extends Dispositivo {
    private int pulgadasPantalla;

    public Tablet(String marca, double precio, int pulgadasPantalla) {
        super(marca, precio);
        this.pulgadasPantalla = pulgadasPantalla;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Pulgadas de pantalla: " + pulgadasPantalla);
    }
}
