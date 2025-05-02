package Biblioteca;

import java.util.ArrayList;

public class Miembro {
    private String nombre;
    private String idMiembro;
    private ArrayList<Libro> librosPrestados = new ArrayList<>();

    public Miembro(String nombre, String idMiembro) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
    }

    public void mostrarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre)
                .append("\nID de miembro: ").append(idMiembro)
                .append("\nLibros prestados:\n");

        if (librosPrestados.isEmpty()) {
            info.append("No tiene libros prestados actualmente.");
        } else {
            for (Libro libro : librosPrestados) {
                info.append("- ").append(libro.getTitulo()).append(" de ").append(libro.getAutor()).append("\n");
            }
        }

        javax.swing.JOptionPane.showMessageDialog(null, info.toString());
    }

    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    // Getter del id del miembro
    public String getIdMiembro() {
        return idMiembro;
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + idMiembro + ")";
    }

    public String getInformacion() {
        StringBuilder info = new StringBuilder(
                "Nombre: " + nombre + "\nID de miembro: " + idMiembro + "\nLibros prestados:\n");
        for (Libro libro : librosPrestados) {
            info.append("- ").append(libro.getDetalles()).append("\n");
        }
        return info.toString();
    }

    public Libro buscarLibroPrestadoPorTitulo(String titulo) {
        for (Libro libro : librosPrestados) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

}
