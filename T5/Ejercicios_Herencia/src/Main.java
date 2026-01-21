import ejercicio1.Animal;
import ejercicio1.Gato;
import ejercicio1.Perro;
import ejercicio2.Coche;
import ejercicio2.Vehiculo;
import ejercicio3.Estudiante;
import ejercicio3.Persona;
import ejercicio4.Circulo;
import ejercicio4.Cuadrado;
import ejercicio4.Figura;
import ejercicio5.Desarrollador;
import ejercicio5.Empleado;
import ejercicio5.Gerente;

public class Main {

    public static void main(String[] args) {

        /*Animal rex = new Perro();
        rex.setNombre("Rex");
        rex.setEdad(5);
        System.out.println(rex);
        rex.hacerSonido();

        System.out.println();

        Animal mishi = new Gato();
        mishi.setNombre("Mishi");
        mishi.setEdad(3);
        System.out.println(mishi);
        mishi.hacerSonido();

        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        System.out.println(vehiculo);
        Vehiculo focus = new Coche("Ford", "Focus", 5);
        System.out.println(focus);
        Vehiculo ibiza = new Coche("Seat", "Ibiza", 3);
        System.out.println(ibiza);

        Estudiante laura = new Estudiante("Laura", 20, 2);
        laura.presentarse();
        laura.estudiar();


        System.out.println();

        Estudiante carlos = new Estudiante("Carlos", 19, 1);
        carlos.presentarse();
        carlos.estudiar();

        Figura circulo = new Circulo(5.0);
        System.out.println(circulo);
        System.out.printf("Area: %.2f",circulo.calcularArea());

        System.out.println();

        Figura cuadrado = new Cuadrado(4.0);
        System.out.println(cuadrado);
        System.out.printf("Area: %.2f",cuadrado.calcularArea());*/

        Gerente ana = new Gerente("Ana Garcia", 40000, 10000);
        System.out.println("Empleado: "+ana.getNombre());
        System.out.println("Puesto: Gerente");
        System.out.println("Salario base: "+ana.getSalarioBase()+"€");
        System.out.println("Bonus: "+ana.getBonus()+"€");
        System.out.println("Salario total: "+ana.calcularSalarioTotal()+"€");

        System.out.println();

        Desarrollador luis = new Desarrollador("Luis Martinez", 35000, "Java");
        System.out.println("Empleado: "+luis.getNombre());
        System.out.println("Puesto: Desarrollador");
        System.out.println("Salario base: "+luis.getSalarioBase()+"€");
        System.out.println("Lenguaje principal "+luis.getLenguajeMain());

    }
}
