package RetoFinal_POO;

public class Sistema_vehiculos {
    private String marca;
    private String modelo;
    private double precio;

    public Sistema_vehiculos(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
}

class Carro extends Sistema_vehiculos {
    private int numero_De_Puertas;

    public Carro(String marca, String modelo, double precio, int numero_De_Puertas) {
        super(marca,modelo,precio);
        this.numero_De_Puertas = numero_De_Puertas;
    }

    //Getter del atributo adicional de Carro
    public int getNumero_De_Puertas() {
        return numero_De_Puertas;
    }

    //Setter del atributo adicional de Carro
    public void setNumero_De_Puertas(int numero_De_Puertas) {
        this.numero_De_Puertas = numero_De_Puertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de puertas: " + numero_De_Puertas);
    }
}

class Moto extends Sistema_vehiculos {
    private double cilindraje;

    public Moto(String marca, String modelo, double precio, double cilindraje) {
        super(marca,modelo,precio);
        this.cilindraje = cilindraje;
    }

    //Getter del atributo adicional de Moto
    public double getCilindraje() {
        return cilindraje;
    }

    //Setter del atributo adicional de Moto
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindraje: " + cilindraje);
    }
}