package EjsPOO;

public class Rectangle {

    //7- Crea una clase Rectangle con metodos para calcular el area y el perimetro

    private double base,altura;

    public Rectangle(double base, double altura){

        this.base = base;
        this.altura = altura;

    }

    public double calcularArea(){

        return base * altura;


    }

    public double calcularPerimetro(){

        return 2*(base+altura);

    }

}
