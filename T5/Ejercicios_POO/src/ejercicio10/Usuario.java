package ejercicio10;

public class Usuario {

    private String nombre;
    private int numSocio;

    public Usuario() {
    }

    public Usuario(String nombre, int numSocio) {
        this.nombre = nombre;
        this.numSocio = numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
}
