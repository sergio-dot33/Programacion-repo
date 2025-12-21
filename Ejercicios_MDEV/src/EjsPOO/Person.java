package EjsPOO;

public class Person {

    private String nombre;
    private int edad;

    public Person(String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;

    }

    public String toString(){

        return "Nombre de la persona: "+nombre+" y edad "+edad;
    }


}
