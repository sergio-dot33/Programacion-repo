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

        System.out.println("Nombre del jugador1:");
        String nombreJugador1 = scanner.next();
        System.out.println("Nombre del jugador2:");
        String nombreJugador2 = scanner.next();

        int puntInicialJg1 = 301;
        int puntInicialJg2 = 301;
        int contadorTurnos = 0;
        boolean partidaTerminada = false;


        //se lanzan 3 dardos

        do {

            System.out.println("Turno del jugador 1 "+nombreJugador1);

            int tirada1 = (int) (Math.random() * 60)+1;
            System.out.println("Resultado de primer lanzamiento "+tirada1);
            int tirada2 = (int) (Math.random() * 60)+1;
            System.out.println("Resultado de segundo lanzamiento "+tirada2);
            int tirada3 = (int) (Math.random() * 60)+1;
            System.out.println("Resultado de tercer lanzamiento "+tirada3);

            int puntuacionTurno1 = tirada1+tirada2+tirada3;
            System.out.println("El resultado del turno es "+puntuacionTurno1);


            int resultadoGanar = puntInicialJg1 - puntuacionTurno1;
            System.out.println("Tu puntuacion es de "+resultadoGanar);

            if (resultadoGanar < 0) {
                System.out.println("Te has pasado, el resultado no se actualiza");
            } else if (resultadoGanar == 0){
                System.out.println("Has ganado!!! "+nombreJugador1);
                contadorTurnos++;
                System.out.println("La partida ha durado "+contadorTurnos);
                partidaTerminada =true;
                break;
            } else {
                puntInicialJg1 = resultadoGanar;
            }

            contadorTurnos++;

            System.out.println("Turno del jugador 2 "+nombreJugador2);

            int tirada4 = (int) (Math.random() * 60)+1;
            System.out.println("Resultado de primer lanzamiento "+tirada4);
            int tirada5 = (int) (Math.random() * 60)+1;
            System.out.println("Resultado de segundo lanzamiento "+tirada5);
            int tirada6 = (int) (Math.random() * 60)+1;
            System.out.println("Resultado de tercer lanzamiento "+tirada6);

            int puntuacionTurno2 = tirada4+tirada5+tirada6;
            System.out.println("El resultado del turno es "+puntuacionTurno2);


            int resultadoGanar2 = puntInicialJg2 - puntuacionTurno2;
            System.out.println("Tu puntuacion es de "+resultadoGanar2);

            if (resultadoGanar2 < 0) {
                System.out.println("Te has pasado, el resultado no se actualiza");
            } else if (resultadoGanar2 == 0){
                System.out.println("Has ganado!!! "+nombreJugador2);
                contadorTurnos++;
                System.out.println("La partida ha durado "+contadorTurnos);
                partidaTerminada = true;
                break;
            } else {
                puntInicialJg2 = resultadoGanar2;
            }

            contadorTurnos++;

            if (puntInicialJg2 < puntInicialJg1){
                System.out.println("Va ganando el jugador 2");
            } else if (puntInicialJg1 < puntInicialJg2) {
                System.out.println("Va ganando el jugador 1");
            } else if (puntInicialJg1 == puntInicialJg2){
                System.out.println("Vais empatados");
            }

        } while (!partidaTerminada);

    }
}
