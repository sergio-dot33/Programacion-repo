package ejercicio9;

public class Calculadora {



    public static int sumar(int numero1, int numero2){


        return numero1+numero2;

    }

    public static int restar(int numero1, int numero2){

        return numero1 - numero2;

    }

    public static int multi(int numero1, int numero2){

        return numero1 * numero2;

    }

    public static double division(double numero1, double numero2){

        if (numero2 ==0){
            System.out.println("Error, no se puede dividir por 0");
            return 0;
        }

        return numero1 / numero2;

    }

    public static int potencia(int base, int exponente){

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {

            resultado = resultado * base;

        }

        return resultado;

    }
}
