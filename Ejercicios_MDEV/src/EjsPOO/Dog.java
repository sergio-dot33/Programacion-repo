package EjsPOO;

public class Dog {

    //2- Crea una clase Dog con un metodo bark()que imprima su sonido

    //Atributos

    private String nombre, raza;

    public Dog(String nombre, String raza){

        this.nombre = nombre;
        this.raza = raza;
    }

    public void bark(){

        System.out.println("Guau guau grrr");
    }
}
