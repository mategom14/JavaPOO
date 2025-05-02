public class Persona {

    String documento;
    String nombre;
    int edad;

    public Persona(String documento, String nombre, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Datos de la persona:\nDocumento: " + documento + "\nNombre: " + nombre + "\nEdad: " + edad;
    }

    public static void main(String[] args) {
        Persona pedro = new Persona("111", "Pedro", 23);
        System.out.println(pedro); // Imprime la información del objeto
    }
}

