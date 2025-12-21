package EjsPOO;

public class Car {

    //4- Crea una clase Car con atributos brand ty model y un metodo showData().

    private String brand, model;

    //constructor va aqui pero no pide ejercicio, lo creo en blanco

    public Car(String brand, String model){

        this.brand = brand;
        this.model = model;

    }

    public void showData(){

        System.out.println("La marca del coche es "+brand+" y su modelo el "+model);
    }
}
