import java.util.Scanner;

public class EjerciciosSwitch {

    public void ejercicio1(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 7");
        int numero = scanner.nextInt();

        switch (numero){
            case 1 :
                System.out.println("El dia 1 es Lunes");
                break;
            case 2 :
                System.out.println("El dia 2 es Martes");
                break;
            case 3 :
                System.out.println("El dia 3 es Miercoles");
                break;
            case 4 :
                System.out.println("El dia 4 es Jueves");
                break;
            case 5 :
                System.out.println("El dia 5 es Viernes");
                break;
            case 6 :
                System.out.println("El dia 6 es Sabado");
                break;
            case 7 :
                System.out.println("El dia 7 es Domingo");
                break;
            default:
                System.out.println("El numero introducido no es valido");
        }


    }

    public void ejercicio2(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una letra de calificacion:");
        char letra = scanner.next().toUpperCase().charAt(0);

        switch (letra){
            case 'A' :
                System.out.println("Calificacion A: Excelente");
                break;
            case 'B' :
                System.out.println("Calificacion B: Muy bien");
                break;
            case 'C' :
                System.out.println("Calificacion C: Bien");
                break;
            case 'D' :
                System.out.println("Calificacion D: Suficiente");
                break;
            case 'F' :
                System.out.println("Calificacion F: Insuficiente");
                break;
            default:
                System.out.println("Calificacion no contemplada");
        }

        scanner.close();

    }

    public void ejercicio3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = scanner.nextInt();

        double resultado = 0.0;
        boolean operacionValida = true;
        System.out.println("Introduce la operacion a realizar:");
        char simboloOperacion = scanner.next().charAt(0);

        switch (simboloOperacion){
            case '+' :
                System.out.println("Vas a realizar una suma");
                resultado = num1 + num2;
                break;

            case '-' :
                System.out.println("Vas a realizar una resta");
                resultado = num1 - num2;
                break;

            case '*' :
                System.out.println("Vas a realizar una multiplicacion");
                resultado = num1 * num2;
                break;

            case '/' :
                System.out.println("Vas a realizar una division");
                if (num2 != 0){
                    resultado = (double) num1 / (double) num2;
                } else {
                    System.out.println("Error");
                    operacionValida = false;
                }
                break;

            default:
                System.out.println("Operacion no valida");

        }

        if (operacionValida){
            System.out.println("El resultado obtenido es "+resultado);
        }

        scanner.close();

    }

    public void ejercicio4(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("---MENU---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");

        System.out.println("Introduce una opcion");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1 -> {
                System.out.println("1. Ver perfil");
            }
            case 2 -> {
                System.out.println("2. Configuracion");
            }
            case 3 -> {
                System.out.println("3. Ayuda");
            }
            case 4 -> {
                System.out.println("Salir");
            }
            default -> System.out.println("Opcion no valida");

        }

        scanner.close();

    }

    public void ejercicio5(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero del mes: ");
        int numeroMes = scanner.nextInt();

        switch (numeroMes){
            case 1,2,12 -> System.out.println("El mes "+numeroMes+ " corresponde a Invierno");
            case 3,4,5 -> System.out.println("El mes "+numeroMes+ " corresponde a Primavera");
            case 6,7,8 -> System.out.println("El mes "+numeroMes+ " corresponde a Verano");
            case 9,10,11 -> System.out.println("El mes "+numeroMes+ " corresponde a Otonio");
            default -> System.out.println("Valor introducido no corresponde a ningun mes");
        }

        scanner.close();
    }
}
