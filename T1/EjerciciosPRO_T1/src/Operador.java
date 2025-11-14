import java.util.Scanner;

public class Operador {

    Scanner lectorLibros;
    Scanner lectorNumeros;
    Scanner lectorBase;
    Scanner lectorArticulo;
    Scanner lectorTemperatura;

    public void ejercicio4(){

        lectorLibros = new Scanner(System.in);

        System.out.println("Como se llama el libro que quieres");
        lectorLibros.nextLine();
        System.out.println("Como se llama el autor del libro");
        lectorLibros.nextLine();
        System.out.println("En que año fue publicado");
        lectorLibros.nextInt();
        System.out.println("Cuantas paginas tiene");
        lectorLibros.nextInt();
        System.out.println("Esta disponible en la biblioteca");
        lectorLibros.nextBoolean();


    }

    public void ejercicio6(){

        lectorNumeros = new Scanner(System.in);

        System.out.println("Declara un numero");
        int numero1 = lectorNumeros.nextInt();
        System.out.println("Declara otro numero");
        int numero2 = lectorNumeros.nextInt();

        int suma = numero1+numero2;
        int restar = numero1-numero2;
        int multi = numero1*numero2;
        int dividir = numero1/numero2;

        System.out.println("El resultado de sumar es "+suma);
        System.out.println("El resultado de restar es "+restar);
        System.out.println("El resultado de multiplicar es "+multi);
        System.out.println("El resultado de dividir es "+dividir);

    }


    public void ejercicio8(){

        lectorBase = new Scanner(System.in);

        System.out.println("Introduce la base del rectangulo");
        int base = lectorBase.nextInt();
        System.out.println("Introduce la altura del rectangulo");
        int altura = lectorBase.nextInt();

        int multiplicacion = base*altura;

        System.out.println("El area del rectangulo es "+multiplicacion);


    }

    public void ejercicio9(){

        lectorArticulo = new Scanner(System.in);

        System.out.println("Introduce el nombre del articulo");
        String nombreArticulo = lectorArticulo.nextLine();
        System.out.println("Introduce el precio del articulo");
        double precio = lectorArticulo.nextDouble();
        lectorArticulo.nextLine();
        System.out.println("Introduce el codigo del articulo");
        String codigoArticulo = lectorArticulo.nextLine();
        System.out.println("El articulo esta disponible");
        boolean disponible = lectorArticulo.nextBoolean();

        lectorArticulo.close();

    }

    public void ejercicio10(){

        lectorTemperatura = new Scanner(System.in);

        System.out.println("Introduce la temperatura en Celsius");
        int celsius = lectorTemperatura.nextInt();

        int formula = celsius*9/5 +32;

        System.out.println("La temperatura en Fahrenheit es: "+formula);

        lectorTemperatura.close();

    }

}
