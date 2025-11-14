public class Main {

    public static void main(String[] args) {

        //ejercicio1

        String nombre = "Ana";
        int edad = 25;
        String ciudad = "Madrid";

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(ciudad);



        //ejercicio2

        int puntuacionInicial = 0;

        puntuacionInicial = puntuacionInicial+5;
        puntuacionInicial = puntuacionInicial+10;
        puntuacionInicial = puntuacionInicial+15;

        System.out.println("El resultado final de la puntuacion es "+puntuacionInicial);

        //ejercicio3

        String nombre1 = "Carlos";
        int edad1 = 30;
        boolean estudiante = true;
        double altura = 1.75;
        char inicial = 'C';

        System.out.println("La variable "+nombre1+ " es de tipo String");
        System.out.println("La variable "+edad1+ " es de tipo int");
        System.out.println("La variable "+estudiante+ " es de tipo boolean");
        System.out.println("La variable "+altura+ " es de tipo double");
        System.out.println("La variable "+inicial+ " es de tipo char");

        //ejercicio 4 con scanner

        String tituloLibro = "Don Quijote";
        String autorLibro = "Miguel de Cervantes";
        int fechaPublicacion = 1605;
        int numeroPaginas = 863;
        boolean siDisponible = true;

        System.out.println("El titulo del libro es "+tituloLibro);
        System.out.println("El autor del libro es "+autorLibro);
        System.out.println("La fecha de publicacion del libro es "+fechaPublicacion);
        System.out.println("Las paginas del libro son "+numeroPaginas);
        System.out.println("El libro esta disponible? "+siDisponible);

        //ejercicio 5

        final String NOMBRE_APP = "MiApp";
        final double numeroPi = 3.14159;
        double version = 1.0;
        String usuarioActual = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        usuarioActual = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("El nuevo usuario es "+usuarioActual);
        System.out.println("El nuevo nivel es "+nivel);
        System.out.println("La nueva puntuacion es "+puntuacion);


        //ejercicio 6 con scanner

       int numero1 = 33;
       int numero2 = 17;

       int suma = numero1+numero2;
       int restar = numero1-numero2;
       int multi = numero1*numero2;
       int dividir = numero1/numero2;

       System.out.println("El resultado de sumar es "+suma);
       System.out.println("El resultado de restar es "+restar);
       System.out.println("El resultado de multiplicar es "+multi);
       System.out.println("El resultado de dividir es "+dividir);

       //ejercicio 7

        String nombre2 = "Elena";
        String apellido = "Garcia";
        int edad2 = 24;
        String ciudad2 = "Barcelona";

        System.out.println("Hola! Me llamo "+nombre2+ " " +apellido+".");
        System.out.println("Tengo "+edad2+" años y vivo en "+ciudad2+".");

        //ejercicio 8

        int baseRectangulo = 5;
        int alturaRectangulo = 3;
        int multiplicacion = baseRectangulo*alturaRectangulo;

        System.out.println("El area del rectangulo es "+multiplicacion);

        //ejercicio 9

        String nombreProducto ="Auriculares Bluetooth";
        double precio = 29.99;
        final String codigo = "AUR-2023";
        boolean okDisponible = true;

        System.out.println("INFORMACION DEL PRODUCTO");
        System.out.println("----------------------");
        System.out.println("Nombre: "+nombreProducto);
        System.out.printf("Precio: %.2f€\n", precio);
        System.out.println("Codigo: "+codigo);
        System.out.println("Disponible: "+okDisponible);

        //ejercicio10

        Operador operador = new Operador();
        operador.ejercicio10();

        int celsius = 25;

        int formula = celsius*9/5 +32;

        System.out.println("Temperatura en Celsius: "+celsius);
        System.out.println("Temperatura en Fahrenheit "+formula);


    }



}
