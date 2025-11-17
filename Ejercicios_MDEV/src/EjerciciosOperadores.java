public class EjerciciosOperadores {

    /*

    1- Crea variable con el resultado de cada operacion aritmetica
    2- Crea una variable para cada tipo de operacion de asignacion
    3- Imprime 3 comparaciones verdaderas con diferentes operadores de comparacion
    4- Imprime 3 comparaciones falsas con diferentes operadores de comparacion
    5- Utiliza el operador logico and
    6- Utiliza el operador logico or
    7- Combina ambios operadores logicos
    8- Incluye alguna negacion
    9- Imprime 3 ejemplos de uso de operadores unarios
    10-Combina operadores aritmeticos comparacion y logicos


     */

    public void ejercicios(){

        //1
        int suma = 2 + 5;
        int resta = 2 - 5;
        int multiplicacion = 2 * 5;
        int division = 2 / 5;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        //2
        int numero1 = 3;
        int numero2 = 6;
        numero1 += 4;
        System.out.println(numero1);
        numero1 -= 4;
        System.out.println(numero1);
        numero1 *= 2;
        System.out.println(numero1);
        numero1 /= 2;
        System.out.println(numero1);

        //3
        System.out.println(numero1 != numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 <= numero2);

        //4
        System.out.println(numero1 == numero2);
        System.out.println(numero1 > numero2);
        System.out.println(numero2 <= numero1);

        //5
        System.out.println(numero1 < numero2 && numero1 != numero2);

        //6
        System.out.println(numero2 < numero1 || numero2 != numero1);

        //7
        System.out.println(numero1>numero2 && numero1!= numero2 || numero2>=numero1);

        //8
        System.out.println(!(numero2<numero1) && numero1!=numero2);

        //9
        int valor = 33;
        valor++;
        System.out.println(valor);
        valor--;
        System.out.println(valor);
        ++valor;
        System.out.println(valor);

        //10
        System.out.println(3*3<=6 || 4+4>4);

    }
}
