package Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Biblioteca {
    private ArrayList<Libro> librosDisponibles;
    private HashMap<String, Miembro> miembros;

    public Biblioteca() {
        librosDisponibles = new ArrayList<>();
        miembros = new HashMap<>();
    }

    public void registrarMiembro(Miembro miembro) {
        miembros.put(miembro.getIdMiembro(), miembro);
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void prestarLibro(String idMiembro, Libro libro) {
        Miembro miembro = miembros.get(idMiembro);
        if (miembro != null && librosDisponibles.contains(libro)) {
            miembro.prestarLibro(libro);
            librosDisponibles.remove(libro);
            JOptionPane.showMessageDialog(
                    null, "Libro prestado a: " + miembro.getNombre() + " (ID: " + idMiembro + ")",
                    "Préstamo exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(String idMiembro, Libro libro) {
        Miembro miembro = miembros.get(idMiembro);
        if (miembro != null) {
            miembro.devolverLibro(libro);
            librosDisponibles.add(libro);
            JOptionPane.showMessageDialog(
                    null, "Libro devuelto por: " + miembro.getNombre() + " (ID: " + idMiembro + ")",
                    "Devolución exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de libros: \n");
        for (Libro libro : librosDisponibles) {
            libro.mostrarDetalles();
            System.out.println();
        }
    }

    public void mostrarMiembros() {
        System.out.println("Listado de miembros: \n");
        for (Miembro miembro : miembros.values()) {
            miembro.mostrarInformacion();
            System.out.println();
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public ArrayList<Miembro> getMiembros() {
        return new ArrayList<>(miembros.values());
    }

    public Miembro buscarMiembroPorId(String idMiembro) {
        return miembros.get(idMiembro);
    }

}
