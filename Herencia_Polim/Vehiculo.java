package Herencia_Polim;

//Clase padre Vehiculo
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    } 
}

//Clase hija Carro
class Carro extends Vehiculo {
    private int numeroDePuertas;

    public Carro(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);//Llama al metodo de la clase padre
        this.numeroDePuertas = numeroDePuertas; //Añade el atributo especifico para Carro
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }

    //Getter del atributo nuevo para Carro
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    //Setter del atributo nuevo para Carro
    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
}

//Clase hija Moto
class Moto extends Vehiculo{
    private int numeroDeMarchas;

    public Moto(String marca, String modelo, int numeroDeMarchas) {
        super(marca, modelo); //Llama al metodo de la clase padre
        this.numeroDeMarchas = numeroDeMarchas;// Añade el atributo especifico para Moto
    }

    //Sobreescritura 
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de marchas: " + numeroDeMarchas);
    }

    //Getter del nuevo atributo para Moto
    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    //Setter del nuevo atributo para Moto
    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }
}