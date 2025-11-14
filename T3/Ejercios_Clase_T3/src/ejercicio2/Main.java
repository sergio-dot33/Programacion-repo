package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        2. Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
    las siguientes acciones:
    a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
    b. El programa debe seleccionar aleatoriamente una palabra del array y
    almacenarla como la palabra secreta.
    c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
    d. En cada intento, el usuario introduce una palabra por teclado.
    e. Tras cada intento, el programa debe indicar al usuario:
    i. Aciertos: cuántas letras tiene en la misma posición que la palabra
    secreta.
    ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
    posición diferente.
    iii. Fallos: cuántas letras no están presentes en la palabra secreta.
    El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
         */

        Scanner scanner = new Scanner(System.in);
        String [] palabras = {"datos", "cosas", "lucia", "manta"};
        String palabraSecreta = palabras [(int) (Math.random()*4)];
        System.out.println("La palabra a adivinar es "+palabraSecreta);
        String palabraUsusario;
        int intentos = 5;
        //cosas
        //datas
        //aciertos : 2
        //aprox
        //fallos: 2

        do {
            do {
            System.out.println("Introduce la palabra");
            palabraUsusario = scanner.next();
            if (palabras.length !=5){
                System.out.println("Palabra invalida");
            }

            } while (palabraUsusario.length() != 5);




            System.out.println("Intento gastado");
            intentos--;

            for (int i = 0; i <palabraSecreta.length() ; i++) {
                //i=0 1,2,3,4
                if (palabraUsusario.charAt(i) == palabraSecreta.charAt(i)){

                }
            }

        } while (intentos>0);



    }
}
