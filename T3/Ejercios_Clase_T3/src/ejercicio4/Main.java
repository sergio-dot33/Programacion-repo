package ejercicio4;

import java.util.Scanner;

public class Main {

    /*
    4. Crea un programa para jugar una partida virtual de dardos entre dos
    jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
    partiendo desde 301.

    Reglas:
    • Nada más empezar pide el nombre de cada jugador
    • Cada jugador comienza con 301 puntos.
    • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
    aleatorio entre 0 y 60 (simulando puntuación en dardos).
    • La puntuación del turno es la suma de los 3 dardos.
    • Resta la puntuación del turno al total de puntos del jugador.
    • Si la puntuación restante es menor que 0, se considera que el jugador "se
    pasa" y su total no cambia ese turno.
    • El primer jugador que llegue exactamente a 0 gana la partida.
    • Después de cada turno, muestra las puntuaciones actuales y quién va
    ganando (el que tiene menos puntos).
    • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.


    1-pedir nommbres jugadores
    2-puntuacion inicial 301
    3-tres dardos con numero aleatorio 0-60
    4- sumar los tres dardos nos da la puntuacion del turno
    5-la puntuacion del turno se resta a la puntuacion inicial
    6-puntuacion es menor que 0, la puntuacion no cambia de valor ese turno
    7-hay que llegar  a 0 exacto para ganar
    8-mostrar puntuaciones tras cada turno
    9-mostrar quien va ganando
    10-al acabar, mostrar ganador y el total de turnos de la partida



     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es el nombre del jugador?");
        String nombreJugador1 = scanner.next();
        System.out.println("Cual es el nombre del otro jugador?");
        String nombreJugador2 = scanner.next();

        int puntuacionInicial = 301;
        int puntuacion1 = puntuacionInicial;
        int puntuacion2 = puntuacionInicial;
        int totalTurnos = 0;

        int numeroAleatorio1 = (int) (Math.random()*60);
        int numeroAleatorio2 = (int) (Math.random()*60);
        int numeroAleatorio3 = (int) (Math.random()*60);

        int puntuacionTurno1 = numeroAleatorio1+numeroAleatorio2+numeroAleatorio3;

        int puntuacionActual1 = puntuacionInicial - puntuacionTurno1;

        int puntuacionTurno2 = numeroAleatorio1+numeroAleatorio2+numeroAleatorio3;

        int puntuacionActual2 = puntuacionInicial - puntuacionTurno2;




    }
}
