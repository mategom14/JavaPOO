package ZooVirtual;

//Clase padre
public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// Clase hija leon
class Leon extends Animal {
    private int fuerzaRugido;

    public Leon(String nombre, int edad, int fuerzaRugido) {
        super(nombre, edad);
        this.fuerzaRugido = fuerzaRugido;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El león ruge con una fuerza de: " + fuerzaRugido);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fuerza de rugido: " + fuerzaRugido);
    }

    // Getter del nuevo atributo para Leon
    public int getFuerzaRugido() {
        return fuerzaRugido;
    }

    // Setter del nuevo atributo para Leon
    public void setFuerzaRugido(int fuerzaRugido) {
        this.fuerzaRugido = fuerzaRugido;
    }
}

// Clase hija Loro
class Loro extends Animal {
    private String vocabulario;

    public Loro(String nombre, int edad, String vocabulario) {
        super(nombre, edad);
        this.vocabulario = vocabulario;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El loro repite: " + vocabulario);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("El loro dice: " + vocabulario);
    }

    // Getter del nuevo atributo de Loro
    public String getVocabulario() {
        return vocabulario;
    }

    // Setter del nuevo atributo de Loro
    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
}