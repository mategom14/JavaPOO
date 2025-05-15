package Ej_productos_toStringOverride;

public class MainProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Papa", 9000, 8);
        Producto producto2 = new Producto("Piña", 12000, 10);
        Producto producto3 = new Producto("Mora", 8000, 12);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
    }
    
}
