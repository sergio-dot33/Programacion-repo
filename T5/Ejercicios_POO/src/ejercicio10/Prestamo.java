package ejercicio10;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;

    public Prestamo() {
    }

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void prestarLibro(){

        System.out.println(usuario.getNombre()+" (Socio "+usuario.getNumSocio()+") intenta tomar prestado "+libro.getTitulo());

        if (libro.isDisponible()){
            libro.setDisponible(false);
            System.out.println("Prestamo realizado el "+fechaPrestamo);
        } else {
            System.out.println("El libro no esta disponible");
        }
    }

    public void devolverLibro(){

        System.out.println("Usuario "+usuario.getNombre()+" devuelve "+libro.getTitulo());

        if (!libro.isDisponible()){
            libro.setDisponible(true);
            System.out.println("Libro devuelto");
        } else {
            System.out.println("No es posible gestionar la devolucion");
        }
    }


}
