package model;

public class Audio extends ElementoMultimedia {

    private String soporte;
    private int duracion;

    public Audio() {
    }

    public Audio(String id, String titulo, String autor, String formato, int tamano, String soporte, int duracion) {
        super(id, titulo, autor, formato, tamano);
        this.soporte = soporte;
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "soporte='" + soporte + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}





