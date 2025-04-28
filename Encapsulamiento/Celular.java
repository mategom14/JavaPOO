package Encapsulamiento;

public class Celular {
    /*
     * Ejercicio de Encapsulamiento
     * Modifica tu clase Celular:
     * Vuelve privados todos los atributos.
     * Crea getters y setters para cada uno.
     * En Main, crea un celular usando el constructor.
     * Luego usa los setters para cambiar su marca y modelo.
     * Finalmente, imprime los nuevos valores usando los getters y también llama a
     * mostrarInfo().
     * Cuando lo tengas, me lo envías y te digo cómo vas.
     */
    private String marca;
    private String modelo;
    private double precio;

    public Celular(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
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
    
}
