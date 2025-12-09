public class EjerciciosCondicionales {

    public void ejercicios(){

        /*

        1- Establece la edad de usuario y muestra si puede votar mayor o igual de 18
        2- Declara dos numeros y muestra cual es mayor, o si son iguales
        3 - Dado un numero verifica si es positivo negativo o cero
        4- Crea programa que diga si numero es par o impar
        5- Verifica si numero esta en rango de 1 a 100
        6- Declara variable con dia de semana y muestra su nombre con switch
        7- simula sistema de notas, muestra sobresaliente aprobado suspenso segun nota 0-10
        8- Escribe programa que determine si puedes entrar al cine debes tener al menos 15 anios o ir acompanado
        9- Crea programa que diga si letra es vocal o consonante
        10- Usa tres variables a b c y muestra cual es mayor de las tres

         */

        //1

        int edad = 22;

        if (edad>=18){
            System.out.println("Puedes votar");
        } else {
            System.out.println("Todavia no puedes votar. Edad minima 18 anios");
        }

        //2
        int num1 = 4;
        int num2 = 16;

        if (num1 > num2){
            System.out.println("El "+num1+" es mayor que "+num2);
        } else if (num1 < num2) {
            System.out.println("El "+num2+" es mayor que "+num1);
        } else {
            System.out.println("El "+num1+" es igual que "+num2);
        }

        //3
        int numero = 3;

        if (numero >0){
            System.out.println("Numero positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero igual a cero");
        }

        //4
        if (numero %2 == 0){
            System.out.println("Numero es par");
        } else {
            System.out.println("Numero impar");
        }

        //5
        if (numero >0 && numero <=100 ){
            System.out.println("Numero esta en rango de 1 a 100");
        } else {
            System.out.println("Numero fuera de rango");
        }

        //6
        String diaSemana = "Viernes";

        switch (diaSemana){
            case "Lunes" -> System.out.println("Estamos a lunes");
            case "Martes" -> System.out.println("Estamos a martes");
            case "Miercoles" -> System.out.println("Estamos a miercoles");
            case "Jueves" -> System.out.println("Estamos a jueves");
            case "Viernes" -> System.out.println("Estamos a viernes");
            default -> System.out.println("Dia de la semana no valido");
            }

        //7
        double nota = 6.33;

        if (nota >= 0 && nota < 5) {
            System.out.println("Has suspendido");
        } else if (nota >= 5 && nota < 9) {
            System.out.println("Has aprobado");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no valida");
        }

        //8
        int edadCine = 13;
        boolean vaAcompaniado = true;

        if (edadCine >= 15 || vaAcompaniado){
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("Lo siento no puedes entrar");
        }

        //9
        String letra = "B";

        if (letra.toUpperCase().contains("a,e,i,o,u")){
            System.out.println("La letra es vocal");
        } else {
            System.out.println("La letra es consonante");
        }

        //10
        int a = 33;
        int b = 22;
        int c = 501;

        if (a > b && a > c){
            System.out.println("La variable "+a+" es la mayor de todas");
        } else if (b > a && b > c) {
            System.out.println("La variable "+b+" es la mayor de todas");
        } else {
            System.out.println("La variable "+c+" es la mayor de todas");
        }

    }



    }
