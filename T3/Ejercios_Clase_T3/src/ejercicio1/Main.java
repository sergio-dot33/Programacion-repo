package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1. Crea un programa de adivinación de números El programa genera de manera
        //aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
        //máximo de 7 intentos. Después de cada intento, indica si el número es mayor
        //o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
        //de intentos utilizado; si no, mostrar un aviso de que debe introducir
        //nuevamente un número.

        /*
        0 pedir cosas scanner
        1generar numero random entre 1 y 50
        2 hacer 7 intentos si no se acierta
        3indicar si numero mayor o menos del elegido
        4 aviso con numero intentos
         */

        Scanner scanner = new Scanner(System.in);

        int numeroSistema = (int) (Math.random()*50) +1; //aqui estamos generando un numero aleatorio entre 0 y 50
        System.out.println("El numero de sistema es "+numeroSistema);
        int intentos = 7; //se puede inciar en 7 o 0
        int numeroUsuario; //se inicia abajo por eso no se iguala a ningun valor
        boolean acierto = false;

        do { //vamos a pedir minimo una vez por eso usamos do while
            System.out.println("Indica el numero");
            numeroUsuario = scanner.nextInt();
            intentos--;
            if (numeroSistema==numeroUsuario){
                System.out.println("Has acertado el numero");
                acierto = true;
                break;
            } else {

                if (numeroSistema < numeroUsuario){
                    System.out.println("Numero demasiado grande");
                } else {
                    System.out.println("Numero demasiado pequenio");
                }
            }

            System.out.println("Has consumido "+(7-intentos)+" intentos");

        } while (intentos>0);

        //has perdido
        if (!acierto){
            System.out.println("Has perdido");
        }


    }
}
