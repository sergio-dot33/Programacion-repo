import EjsCondicionales.EjerciciosCondicionales;
import EjsPOO.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //EjsVariables.EjerciciosVariables ejerciciosVariables = new EjsVariables.EjerciciosVariables();
        //ejerciciosVariables.ejercicios();

        //EjsOperadores.EjerciciosOperadores ejerciciosOperadores = new EjsOperadores.EjerciciosOperadores();
        //ejerciciosOperadores.ejercicios();

        //EjsStrings.EjerciciosStrings ejerciciosStrings = new EjsStrings.EjerciciosStrings();
        //ejerciciosStrings.ejercicios();

        //EjerciciosCondicionales ejerciciosCondicionales = new EjerciciosCondicionales();
        //ejerciciosCondicionales.ejercicios();

        /*Book book = new Book("Caperucita roja","Franco");

        book.mostrarDatos();*/

        /*Dog dog = new Dog("Pluto","Teckel");

        dog.bark();*/

        /*Car car = new Car("bmw","serie5");

        car.showData();*/

        /*Student student = new Student(94);

        if (student.siAprobado()) {
            System.out.println("Has aprobado!");
        } else {
            System.out.println("Has suspendido");
        }*/

        /*BankAccount bankAccount = new BankAccount(31552.33);

        bankAccount.deposit(3500.62);

        System.out.printf("%.2f",bankAccount.verSaldo());*/

        /*Rectangle rectangle = new Rectangle(12.5,45.3);

        System.out.println(rectangle.calcularArea());
        System.out.println(rectangle.calcularPerimetro());*/

        /*Worker worker = new Worker("Paco",60000);

        System.out.println("El salario es de "+worker.verSalario());*/

        /*Person person = new Person("Franco", 33);
        Person person1 = new Person("Anacleto",57);
        Person person2 = new Person("Goku",92);

        ArrayList<Person> personas = new ArrayList<>();

        personas.add(person);
        personas.add(person1);
        personas.add(person2);

        for (Person item : personas){
            System.out.println(item);
        }*/

        Product product = new Product("Juego PC",69);

        System.out.println("El descuento aplicado es de "+product.calcularDescuento()+" y el precio final de "+product.verPrecioFinal());

    }
}
