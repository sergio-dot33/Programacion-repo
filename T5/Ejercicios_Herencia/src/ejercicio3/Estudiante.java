package ejercicio3;

public class Estudiante extends Persona {

    private int curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public void estudiar(){

        System.out.println("Estoy estudiando "+getCurso()+"º de DAM");

    }

    @Override
    public void presentarse() {

        System.out.println("Hola, soy "+getNombre()+" y tengo "+getEdad()+" anos");


    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }



}
