package Biblioteca;

import javax.swing.JOptionPane;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros
        Libro libro1 = new Libro(
            "Cien años de soledad", "Gabriel García Márquez", "123456", 1967);
        biblioteca.agregarLibro(libro1);

        Libro libro2 = new Libro(
            "El Quijote de la Mancha", "Miguel de Cervantes", "789456", 1605);
        biblioteca.agregarLibro(libro2);

        // Crear miembros
        Miembro miembro1 = new Miembro("Pepe", "001");
        biblioteca.registrarMiembro(miembro1);

        Miembro miembro2 = new Miembro("Alejandro", "002");
        biblioteca.registrarMiembro(miembro2);

        // Menú
        int opcion = -1;

        do {
            String menu = """
                MENÚ PRINCIPAL
                
                1. Prestar un libro.
                2. Devolver un libro.
                3. Mostrar inventario de libros.
                4. Mostrar miembros registrados.
                5. Salir.
                """;

            String input = JOptionPane.showInputDialog(
                null, menu, 
                "Biblioteca", JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                // Usuario cerró la ventana
                break;
            }

            try {
                opcion = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null, "Entrada no válida. Por favor, ingrese un número.", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opcion) {
                case 1:
                    String idMiembroPresta = JOptionPane.showInputDialog(null,
                     "Ingrese el ID del miembro que prestará el libro:", 
                     "Prestar libro", JOptionPane.QUESTION_MESSAGE);
                    String tituloLibroPresta = JOptionPane.showInputDialog(
                        null, "Ingrese el título del libro a prestar:", 
                        "Prestar libro", JOptionPane.QUESTION_MESSAGE);

                    if (idMiembroPresta != null && tituloLibroPresta != null) {
                        Libro libroPrestar = biblioteca.buscarLibroPorTitulo(tituloLibroPresta.trim());
                        if (libroPrestar != null) {
                            biblioteca.prestarLibro(idMiembroPresta.trim(), libroPrestar);
                        } else {
                            JOptionPane.showMessageDialog(
                                null, "Libro no encontrado en el inventario.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case 2:
                    String idMiembroDevuelve = JOptionPane.showInputDialog(
                        null, "Ingrese el ID del miembro que devolverá el libro:", 
                        "Devolver libro", JOptionPane.QUESTION_MESSAGE);
                    String tituloLibroDevuelve = JOptionPane.showInputDialog(
                        null, "Ingrese el título del libro a devolver:",
                        "Devolver libro", JOptionPane.QUESTION_MESSAGE);

                        Miembro miembroDevuelve = biblioteca.buscarMiembroPorId(idMiembroDevuelve.trim());
                        if (miembroDevuelve != null) {
                            Libro libroDevolver = miembroDevuelve.buscarLibroPrestadoPorTitulo(tituloLibroDevuelve.trim());
                            if (libroDevolver != null) {
                                biblioteca.devolverLibro(idMiembroDevuelve.trim(), libroDevolver);
                            } else {
                                JOptionPane.showMessageDialog(
                                    null, "El miembro no tiene prestado ese libro.", 
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(
                                null, "Miembro no encontrado.", 
                                "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    break;
                case 3:
                    StringBuilder inventario = new StringBuilder("Inventario de libros:\n\n");
                    for (Libro libro : biblioteca.getLibrosDisponibles()) {
                        inventario.append(libro.getDetalles()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(
                        null, inventario.toString(), 
                        "Inventario", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    StringBuilder miembros = new StringBuilder("Listado de miembros:\n\n");
                    for (Miembro miembro : biblioteca.getMiembros()) {
                        miembros.append(miembro.getInformacion()).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(
                        null, miembros.toString(),
                         "Miembros", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(
                        null, "Saliendo...",
                         "Salida", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(
                        null, "Opción no válida. Intente nuevamente.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (opcion != 5);
    }
}


