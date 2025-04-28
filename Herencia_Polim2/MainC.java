import java.util.ArrayList;

public class MainC {
    public static void main (String[] args) {
        ArrayList<Dispositivo> devices = new ArrayList<>();
        Dispositivo celular_1 = new CelularN1("Xiaomi", 3000000, "14T ultra");
        devices.add(celular_1);
        Dispositivo tablet_1 = new Tablet("Samsung",1500000,10);
        devices.add(tablet_1);
        Dispositivo celular_2 = new CelularN1("Xiaomi", 3000000, "17T ultra");
        devices.add(celular_2);
        Dispositivo tablet_2 = new Tablet("Samsung", 1500000, 8);
        devices.add(tablet_2);

        for (Dispositivo dispositivo : devices) {
            if (dispositivo instanceof Tablet) {
                System.out.println("Este dispositivo es una tablet: \n");
                dispositivo.mostrarInfo();
                System.out.println();
            } else if (dispositivo instanceof CelularN1) {
                System.out.println("Este dispositivo es un celular: \n");
                dispositivo.mostrarInfo();
                System.out.println();
            }
        }
    }
}
