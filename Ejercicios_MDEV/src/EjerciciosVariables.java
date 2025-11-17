public class EjerciciosVariables {

    /*
    1- Declara variable tipo String y asigna tu nombre
    2- Crea varaible tipo int y asigna tu edad
    3- Crea variable double y pon altura metros
    4- Declara variable tipo boolean y indica si te gusta programar
    5- Declara constante tu email
    6- Crea variable tipo char y guarda tu incial nombre
    7 - Declara variable tipo String con localidad, cambia el valor y vuelve a imprimir
    8- Crea variable int llamada a, otra b, e imprime la suma de ambas
    9 - Imprime el tipo de dos variables creadas anteriormente
    10- Intenta declarar una variable sin inicializarla

     */

    public void ejercicios(){

        //1
        String nombre = "Paco";
        System.out.println(nombre);

        //2
        int edad = 33;
        System.out.println(edad);

        //3
        double altura = 1.66;
        System.out.println(altura);

        //4
        Boolean gustaProgramar = false;
        System.out.println(gustaProgramar);

        //5
        final String EMAIL = "pacojuan@gmail.com";
        System.out.println(EMAIL);

        //6
        char inicial = 'S';
        System.out.println(inicial);

        //7
        String localidad = "Xirivella";
        localidad = "Patraix";
        System.out.println(localidad);

        //8
        int a = 3;
        int b = 3;
        int sumaAB = a+b;
        System.out.println(sumaAB);

        //9
        System.out.println(gustaProgramar.getClass().getSimpleName());

        //10

        String calle;


    }
}
