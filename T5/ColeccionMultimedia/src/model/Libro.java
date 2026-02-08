package model;

public class Libro extends ElementoMultimedia {

    private String isbn;
    private int nPaginas;

    public Libro() {
    }

    public Libro(String id, String titulo, String autor, String formato, int tamano, String isbn, int nPaginas) {
        super(id, titulo, autor, formato, tamano);
        this.isbn = isbn;
        this.nPaginas = nPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "isbn='" + isbn + '\'' +
                ", nPaginas=" + nPaginas +
                '}';
    }
}
