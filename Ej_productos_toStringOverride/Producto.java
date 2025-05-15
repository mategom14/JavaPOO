package Ej_productos_toStringOverride;

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * toString() es un metodo que devuelve una representación en forma de cadena del
     * objeto 'Producto'.
     * Este método se sobrescribe para proporcionar un formato personalizado
     * que muestra los detalles del Producto, incluyendo su nombre, precio y
     * cantidad.
     * 
     * en este caso lleva el formato: "Producto{nombre='valor', precio=valor,
     * cantidad=valor}".
     *
     * Se sobreescribe el método toString() para proporcionar una representación
     * legible y personalizada del objeto Producto. Esto es útil para depuración
     * y registro, ya que permite mostrar los valores de los atributos del objeto
     * en un formato claro. Además, el método toString() es invocado por defecto
     * cuando se utiliza System.out.println con un objeto, lo que facilita la
     * impresión directa de su contenido.
     */
    @Override
    public String toString() {
        return "Producto{nombre='" + nombre + "', precio=" + precio + ", cantidad=" + cantidad + "}";
    }

}