package Tema1;

public class EjsTema1 {

    public void ejercicios(){

        //1

        String nombre = "Ana";
        int edad = 25;
        String ciudad = "Madrid";

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(ciudad);

        //2

        int puntuacionInicial = 0;
        puntuacionInicial = 3;
        puntuacionInicial = 5;
        puntuacionInicial = 2;

        System.out.println(puntuacionInicial);

        //3

        String pueblo = "Mislata";
        int nota = 5;
        boolean esAprobado = true;
        double altura = 1.55;
        char incial = 'C';

        System.out.println(pueblo+ " String");
        System.out.println(nota+ " int");
        System.out.println(esAprobado+ " boolean");
        System.out.println(altura+ " double");
        System.out.println(incial+ " char");

        //4

        String titulo = "Don Quijote de la Mancha";
        String autor = "Miguel";
        int anioPubli = 1605;
        int numPaginas = 863;
        boolean estaDisponible = true;

        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano publicacion: "+anioPubli);
        System.out.println("Numero de paginas: "+numPaginas);
        System.out.println("Disponible en la biblio?: "+estaDisponible);

        //5

        final String NOMBREAPP = "MiApp";
        String version = String.format("%d.%d.%d",1,0,0);
        final double valorPI = 3.14159;
        String usuarioActual = "Laura";
        int nivel = 1;
        int puntos = 0;

        usuarioActual = "Miguel";
        nivel = 2;
        puntos = 150;

        System.out.println(version);
        System.out.println("Usuario actualizado: "+usuarioActual);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuacion actualizada: "+puntos);

        //6

        int num1 = 8;
        int num2 = 5;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        //7

        String name = "Paco";
        String apellido = "Perez";
        int anios = 33;
        String poblacion = "Manises";

        System.out.println("Hola! Me llamo "+name+" "+apellido+" tengo "+anios+" anios y vivo en "+poblacion);

        //8

        int baseRect = 5;
        int alturaRect = 3;
        int formulaArea = baseRect * alturaRect;

        System.out.println("El area del rectangulo es: "+formulaArea);

        //9

        System.out.println("---INFORMACION PRODUCTO---");

        String nombrePro = "Auriculares bluetooth";
        double precio = 29.99;
        String codigo = "AUR-2023";
        boolean disponible = true;

        System.out.println("Nombre "+nombrePro);
        System.out.println("Precio: "+precio+" €");
        System.out.println("Codigo: "+codigo);
        System.out.println("Disponible: "+disponible);

        //10

        double tempCelsius = 25;

        double formulaFahrenheit = tempCelsius * 9/5 +32;

        System.out.println("Temperatura celsius: "+tempCelsius);
        System.out.println("Temperatura Fahrenheit "+formulaFahrenheit);
    }
}
