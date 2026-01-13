package ejercicio6;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre){

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {

        System.out.println("Asignando nota: "+nota);
        if (nota <0 || nota>10){
            System.out.println("Error, la nota debe estar entre 0 y 10");
        } else {
            this.nota = nota;
            System.out.println("Correcto");
        }
    }
}
