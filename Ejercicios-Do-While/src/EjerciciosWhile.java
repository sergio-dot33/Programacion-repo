import java.util.Scanner;

public class EjerciciosWhile {

    public void ejercicio1(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        int contador = 1;

        System.out.println("Contando con while");

        while (contador <=numero){
            System.out.println(contador);
            contador++;
        } if (numero<0){
            System.out.println("Numero no valido");
        }

        System.out.println("Fin del conteo");





    }

    public void ejercicio3(){

        Scanner scanner = new Scanner(System.in);


        int numero = 1;
        int suma = 0;

        System.out.println("Introduce un numero");
        numero = scanner.nextInt();

        while (numero>0){

            suma = suma + numero;
            System.out.println("Suma actual "+suma);
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();
        }

        System.out.println("Programa terminado. Suma total: "+suma);

        scanner.close();




    }

    public void ejercicio5(){

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int tiempo;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ver ahora");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion:");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Hola que tal?");
                case 2 -> System.out.println("Venga hasta luego");
                case 3 -> System.out.println("3:33 am");


            }
        } while (opcion != 4);

        System.out.println("Saliendo");

        scanner.close();
    }

    public void ejercicio6(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero =scanner.nextInt();
        System.out.println("Cuenta atras");

        while (numero != 1){
            numero--;
            System.out.println(numero);
        }

        System.out.println("DESPEGUEEEE");



    }

    public void ejercicio7(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas calificaciones vas a meter");
        int numeroCalificaciones = scanner.nextInt();

        int contador = 1;
        double suma = 0.0;

        while (contador <= numeroCalificaciones){
            System.out.println("Introduce la califacion "+contador);
            double calificacion = scanner.nextDouble();
            suma = suma + calificacion;
            contador++;
        }

        double promedio = suma / numeroCalificaciones;

        System.out.println("Suma total "+suma);
        System.out.println("Promedio calificaciones: "+promedio);

        scanner.close();





    }







}






