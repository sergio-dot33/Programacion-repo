import java.util.Scanner;
import java.util.Arrays;

public class Controller {

    public void ejercicio1(){

        String[] frutas = new String[]{
                "Manzana",
                "Platano",
                "Naranja",
                "Fresa",
                "Uva"
        };


        System.out.println("Frutas en el array:");

        for ( String item : frutas ){
            System.out.println(item);
        }
    }

    public void ejercicio2(){

        int[] numeros = new int[]{10,20,30,40,50,60};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion "+i+" : "+numeros[i]);
        }
    }

    public void ejercicio3(){

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre "+(i+1)+" :");
            nombres[i] = scanner.next();
        }

        System.out.println("Nombres introducidos");

        for ( String item:nombres ){
            System.out.println(item);
        }



    }

    public void ejercicio4(){

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[]{5,12,8,3,15,9,6};

        System.out.println("Introduce numero a buscar:");
        int numeroBuscar = scanner.nextInt();
        boolean numeroEncontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeroBuscar == numeros[i]) {
                System.out.println("El numero " + numeroBuscar + " se encuenta en la posicion " + i);
                numeroEncontrado = true;
                break;
            }

        }

            if (!numeroEncontrado) {
                System.out.println("El numero " + numeroBuscar + " no se encuentra en el array");
            }

        scanner.close();

    }

    public void ejercicio5(){



        int[] numeros = new int[]{23,17,45,29,12,56,28,34,1,43};
        int acumulador = 0;

        System.out.println("Array: "+ Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>50){
                acumulador++;
            }
        }

        System.out.println("Cantidad de numeros mayores de 50: "+acumulador);
    }

    public void ejercicio6(){

        double[] numeros = new double[]{4.5,7.2,3.8,9.1,5.6,8.3,6.7,4.9};
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma+= numeros[i];
        }

        double promedio = suma / numeros.length;

        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El promedio es "+promedio);
    }

    public void ejercicio7(){

        int[] numeros = new int[]{15,8,23,4,19,12};
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }

            if (numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }

        }

        System.out.println("Array : "+ Arrays.toString(numeros));

        System.out.println("El numero mayor es: "+numeroMayor);
        System.out.println("El numero menor es: "+numeroMenor);



    }

    public void ejercicio8(){

        Scanner scanner = new Scanner(System.in);

        String[] animales = new String[]{"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};

        System.out.println("Introduce palabra a buscar");
        String palabraBuscar = scanner.next();
        int acumulador = 0;

        for (int i = 0; i < animales.length; i++) {
            if (palabraBuscar.equals(animales[i])){
                acumulador++;
            }
        }

        System.out.println("La palabra "+palabraBuscar+" aparece "+acumulador+" en el array.");
        scanner.close();
    }

    public void ejercicio9(){

        int[] numeros = new int[]{2, 4, 6, 8, 10, 12, 14};

        for ( int item : numeros){
            System.out.print(item+ " ");
        }

        System.out.println();

        for (int i = numeros.length-1; i >= 0 ; i--) {
            System.out.print(numeros[i]+ " ");
        }

    }

    public void ejercicio10(){

        //pedir cantidad estudiantes
        //crear array para almacenar notas
        //usar bucle while para rellenar array
        //usar bucle for para:
        //1-mostrar todas las calificaciones
        //2-calcular promedio de la clase
        //3- contar cuantos estudiantes aprobaron >=5
        //4-encontrar nota mas alta y mas baja

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos estudiantes hay en tu clase:");
        int estudiantes = scanner.nextInt();
        int i = 0;

        double[] notas = new double[estudiantes];

        while (i < estudiantes){
            System.out.println("Introduce la nota del estudiante: ");
            double nota = scanner.nextDouble();

            if (nota >10 || nota <0){
            System.out.println("Nota no valida, debe estar entre 0 y 10");
            } else {
            notas[i] = nota;
            i++;
            }
        }

        double suma = 0;
        int acumulador = 0;
        double notaMayor = notas[0];
        double notaMenor = notas[0];

        for (int j = 0; j < notas.length; j++) {
            System.out.println("La nota del estudiante "+(j+1)+" es de "+notas[j]);
            suma+= notas[j];

            if (notas[j] >=5){
                acumulador++;
            }

            if (notas[j] > notaMayor){
                notaMayor = notas[j];
            } else {
                notaMenor = notas[j];
            }

        }

        double promedio = suma / notas.length;

        System.out.println("---REPORTE DE CALIFICACIONES---");

        for ( double item : notas){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.printf("Promedio de la clase: %.2f\n ",promedio);
        System.out.println("Estudiantes aprobados: "+acumulador);
        System.out.println("La nota mas alta es "+notaMayor);
        System.out.println("La nota mas baja es "+notaMenor);

        scanner.close();

    }

}


