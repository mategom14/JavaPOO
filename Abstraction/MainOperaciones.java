package Abstraction;

public class MainOperaciones {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
        tv.encender();
        System.out.println();
        tv.apagar();
        System.out.println();

        Radio radio = new Radio();
        radio.encender();
        System.out.println();
        radio.apagar();
    
    }
}
