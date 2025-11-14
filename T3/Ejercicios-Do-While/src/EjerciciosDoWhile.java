import java.util.Scanner;

public class EjerciciosDoWhile {

    public void ejercicio2(){

        Scanner scanner = new Scanner(System.in);

        String passCorrecta = "1234";
        String passIngresada;

        do {
            System.out.println("Introduce la contrasena");
            passIngresada = scanner.nextLine();

            if (!passIngresada.equals(passCorrecta)){
                System.out.println("Contrasena incorrecta. Intenta de nuevo");
            }
        } while (!passIngresada.equals(passCorrecta));

        System.out.println("Correcto, acceso permitido");

        scanner.close();


    }


    public void ejercicio4(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("!Adivina el numero entre 1 y 10!");
        int numeroSecreto = 7;
        int intentosContador= 0;
        int intento;

        do {
            System.out.println("Introduce tu intento");
            intento = scanner.nextInt();
            intentosContador++;

            if (intento > numeroSecreto){
                System.out.println("El numero es menor. Intentalo de nuevo");
            } else if (intento < numeroSecreto) {
                System.out.println("El numero es mayor. Intentalo de nuevo");
            }

        } while (intento !=numeroSecreto);

        System.out.println("Correcto!!! Has adivinado el numero en "+intentosContador+ " intentos");







    }

    public void ejercicio8(){

        Scanner scanner = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Introduce tu edad");
            edad = scanner.nextInt();

            if (edad<0 || edad>120){
                System.out.println("Edad no validad. Debe estar entre 0 y 120");
            }

        } while (edad<0 || edad>120);

        System.out.println("Edad valida! Gracias");

        scanner.close();


    }

    public void ejercicio9(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos estudiantes hay?");
        int numeroEstudiantes = scanner.nextInt();
        int contador = 1;
        double nota;

        while (contador <= numeroEstudiantes){
            System.out.println("Introduce la nota del estudiante:");
            nota = scanner.nextDouble();
            contador++;
        }
        for (int i = contador; i < numeroEstudiantes; i++) {
            System.out.println("Estudiante  nota:");

        }

        System.out.println("sfsdfsdfw");




    }

    public void ejercicio10(){



        Scanner scanner = new Scanner(System.in);

        int saldo = 1000;
        int opcion;

        System.out.println("---CAJERO AUTOMATICO---");
        System.out.println("Saldo inicial "+saldo);

        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.println("Tu saldo actual es "+saldo);
                }
                case 2 -> {
                    System.out.println("Cuanto deseas retirar?");
                    int cantidadRetirar = scanner.nextInt();

                    while (cantidadRetirar > saldo) {
                        System.out.println("Fondos insudicientes. tu saldo es " + saldo);
                        System.out.println("Introduce una cantidad valida");
                        cantidadRetirar = scanner.nextInt();
                    }

                    saldo = saldo - cantidadRetirar;
                    System.out.println("Retiro exitoso. Has retirado " + cantidadRetirar);
                    System.out.println("Nuevo saldo " + saldo);

                }

                case 3 -> {
                    System.out.println("Cuanto deseas depositar?");
                    int cantidadDepositar = scanner.nextInt();
                    if (cantidadDepositar <=5){
                        System.out.println("Cantidad no valida. Por favor ingrese un billete mayor de 5");
                    }
                    saldo = saldo + cantidadDepositar;
                    System.out.println("Deposito exitoso, has depositado "+cantidadDepositar);
                    System.out.println("Nuevo saldo "+saldo);

                }

                case 4 -> {
                    System.out.println("Gracias por usar el cajero. Hasta pronto");
                }

                default -> {
                    System.out.println("Opcion no valida, intentalo de nuevo");
                }

            }

        } while (opcion!=4);
    }
}
