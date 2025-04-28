package Proyecto_realista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Empleado empleado_1 = new Desarrollador("Juan", 5000000, "Python");
        listaEmpleados.add(empleado_1);

        Empleado empleado_2 = new Gerente("Mateo", 8000000, "TI");
        listaEmpleados.add(empleado_2);

        for (Empleado empleado : listaEmpleados) {
            empleado.mostrarInformacion();
            empleado.trabajar();

            if (empleado instanceof Beneficios) {
                ((Beneficios) empleado).recibirVacaciones();
                ((Beneficios) empleado).recibirBonificacion();
            }
            System.out.println();
        }
    }
}
