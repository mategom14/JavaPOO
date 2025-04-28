package Abstraction;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract void calcularArea();

    public void mostrarColor() {
        System.out.println("Color: " + color);
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área: " + Math.PI * radio*radio); 
    }
}

class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(String color,double base,double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
         System.out.println("Area: " + base*altura);
    }
}
