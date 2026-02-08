package model;

public abstract class ElementoMultimedia {

    private String id, titulo, autor, formato;
    private int tamano;

    public ElementoMultimedia() {
    }

    public ElementoMultimedia(String id, String titulo, String autor, String formato, int tamano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.tamano = tamano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "ElementoMultimedia{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato='" + formato + '\'' +
                ", tamano=" + tamano +
                '}';
    }
}
