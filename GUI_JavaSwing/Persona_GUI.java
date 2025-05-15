package GUI_JavaSwing;

public class Persona_GUI {
    private String nombre;
    private String correo;
    private int edad;

    public Persona_GUI(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correo + ", Edad: " + edad;
    }
}
