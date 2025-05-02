package Biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int añoPublicacion;

    public Libro(String titulo, String autor, String ISBN, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo +
                "\nAutor: " + autor +
                "\nISBN: " + ISBN +
                "\nAño de publicación: " + añoPublicacion);
        System.out.println();
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDetalles() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nISBN: " + ISBN +
               "\nAño de publicación: " + añoPublicacion;
    }

    public Object getAutor() {
        return autor;
    }
}