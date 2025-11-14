import java.util.Scanner;

public class EjerciciosFor {
    
    
    public void ejercicio6(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d x %d = %d\n",numero,i,numero*i);
        }
    }

    public void ejercicio7(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        int suma = 0;

        System.out.println("Sumando: ");

        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de numeros del 1 al "+numero+" es: "+suma);

        scanner.close();
    }

    public void ejercicio8(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        int numeroPar = 0;
        int numeroImpar = 0;

        if (numero<1){
            System.out.println("Introduce numero valido, mayor o igual que 1");
            return;
        }

        System.out.println("Recorriendo numeros del 1 al "+numero+" ...");


        for (int i = 1; i <=numero ; i++) {
            if (i % 2 == 0){
                numeroPar++;
            } else {
                numeroImpar++;
            }
        }

        System.out.println("Numeros pares: "+numeroPar);
        System.out.println("Numeros impares: "+numeroImpar);

        scanner.close();


        }

    public void ejercicio9(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero porfa");
        int numero = scanner.nextInt();
        int factorial = 1;

        if (numero<0){
            System.out.println("Numero no valido, debe ser positivo");
            return;
        }

        System.out.println("Calculando "+numero+"!");


        for (int i = 1; i <=numero; i++) {
            System.out.print(i);

            if (i < numero){
                System.out.print(" x ");
            }

            factorial = factorial*i;
        }

        System.out.println();

        System.out.println("El factorial de "+numero+" es "+factorial);

        scanner.close();

    }

    public void ejercicio10(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("--- EJERCICIOS ---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");

        System.out.println("Elige un ejercicio");
        int ejercicio = scanner.nextInt();

        if (ejercicio < 1 || ejercicio > 3){
            System.out.println("Numero de ejercicio no valido");
            return;
        }

        System.out.println("Elige cuantas repeticiones");
        int repeticiones = scanner.nextInt();
        String nombreEjercicio = "";

        switch (ejercicio){
            case 1 -> nombreEjercicio = "Flexiones";
            case 2 -> nombreEjercicio = "Abdominales";
            case 3 -> nombreEjercicio = "Sentadillas";
        }

        System.out.println("Has elegido "+nombreEjercicio);

        for (int i = 1; i <= repeticiones; i++) {
            System.out.println("Repeticion "+i+ " completada");
        }

        System.out.println("Ejercicio completado! Has hecho "+repeticiones+" "+nombreEjercicio+".");

        scanner.close();


    }



    }



