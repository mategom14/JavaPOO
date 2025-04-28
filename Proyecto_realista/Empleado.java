package Proyecto_realista;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    abstract void trabajar();

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}

class Desarrollador extends Empleado implements Beneficios {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, double salario, String lenguajeProgramacion) {
        super(nombre, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Lenguaje de programación: " + lenguajeProgramacion);
    }

    @Override
    void trabajar() {
        System.out.println("El desarrollador está codificando en Java");        
    }

    @Override
    public void recibirVacaciones() {
        System.out.println("El desarrollador recibe 15 días de vacaciones");
    }

    @Override
    public void recibirBonificacion() {
        System.out.println("El desarrollador recibe una bonificación de 10% de su salario");        
    }
}

class Gerente extends Empleado implements Beneficios {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre,salario);
        this.departamento = departamento;
    }

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }

    @Override
    void trabajar() {
        System.out.println("El gerente está supervisando el departamento de TI");        
    }

    @Override
    public void recibirVacaciones() {
        System.out.println("El gerente recibe 30 días de vacaciones");        
    }

    @Override
    public void recibirBonificacion() {
        System.out.println("El gerente recibe una bonificación de 20% de su salario");
    }
}