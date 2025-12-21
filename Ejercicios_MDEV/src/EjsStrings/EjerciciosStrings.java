package EjsStrings;

public class EjerciciosStrings {

    public void ejercicios(){

        /*

        1- Concatena dos cadenas de texto
        2- Muestra longitud de cadena de texto
        3- Muestra primer y ultimo caracter de String
        4- Convierte a mayusculas y minusculas un string
        5- Comprueba si una cadena de texto contiene una palabra concreta
        6- Formatea un string con un entero
        7- Elimina los espacions en blanco al principio y al final
        8- Sustituye todos los espacions en blanco de un string
        9- Comprueba si dos strings son iguales
        10- Comprueba si dos strigns tienen la misma longitud

         */

        //1
        int a = 3;
        int b = 44;
        System.out.println("El valor de "+a+ " es diferente al valor de "+b);

        //2
        String ciudad = "Valencia";
        System.out.println(ciudad.length());

        //3
        System.out.println(ciudad.charAt(0));
        System.out.println(ciudad.charAt(ciudad.length()-1));

        //4
        System.out.println(ciudad.toLowerCase());
        System.out.println(ciudad.toUpperCase());

        //5
        System.out.println(ciudad.toUpperCase().contains("CIA"));

        //6
        System.out.printf("Hola tete, vivo en %s y tengo %d anios%n",ciudad, b);

        //7
        System.out.println(" Hola capitan ".trim());

        //8
        System.out.println(" Hola capitan ".replace(" ", "!!!"));

        //9
        String pueblo = "Xirivella";
        System.out.println(pueblo.equals(ciudad));

        //10
        System.out.println(ciudad.length() == pueblo.length());

    }
}
