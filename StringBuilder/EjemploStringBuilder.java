package StringBuilder;

import javax.swing.JOptionPane;

public class EjemploStringBuilder {
    public static void main(String[] args) {
        String nombre = "Pepe";
        String id = "001";
        String[] libros = { "Cien años de soledad", "El Quijote de la Mancha", "1984" };
        /*
         * for(int i = 0;i<libros.length;i++) {
         * libros[i]=null;
         * }
         */

        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombre).append("\n");
        info.append("ID de miembro: ").append(id).append("\n");
        info.append("Libros prestados:\n");

        if (libros.length == 0) {
            info.append("No tiene libros prestados actualmente.");
        } else {
            for (String libro : libros) {
                info.append("- ").append(libro).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, info.toString());
    }
}
