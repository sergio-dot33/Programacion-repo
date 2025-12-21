import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {

    public void ejercicio1(){

        int [][] tabla = new int[][]{ {1,2,3},{4,5,6}, {7,8,9} };

        System.out.println("Matrix 3x3:");

        for (int [] fila  : tabla){
            for (int numero : fila){
                System.out.print(numero+" ");
            }
            System.out.println();
        }



    }

    public void ejercicio2(){

        Scanner scanner = new Scanner(System.in);

        int [][] tabla = new int[2][4];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Introduce un valor para posicion: ["+i+"]["+j+"]");
                tabla[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz resultante:");

        for (int [] fila : tabla){
            for (int numeros : fila){
                System.out.print(numeros+" ");
            }
            System.out.println();
        }
    }

    public void ejercicio3(){

        int [][] matriz = new int[][]{ {2,4,6,8},{1,3,5,7}, {9,11,13,15}, {10,12,14,16} };

        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
            }
        }

        System.out.println("Suma total de elementos: "+sumaTotal);


    }

    public void ejercicio4(){

        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int[][]{ {12,45,23,67,89}, {34,56,78,90,11}, {22,33,44,55,66} };

        System.out.println("Que numero quieres buscar: ");
        int numeroBuscar = scanner.nextInt();
        int filaEncontrada = -1;
        int columnaEncontrada =-1;
        boolean numeroEncontrado = false;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroBuscar){
                    numeroEncontrado = true;
                    filaEncontrada = i;
                    columnaEncontrada = j;
                    break;
                }
            }

            if (numeroEncontrado) {
                break;
            }
        }

        if (numeroEncontrado){
            System.out.println("El numero " + numeroBuscar + " ha sido encontrado en la posicion [" + filaEncontrada + "] [" + columnaEncontrada + "]");
        } else {
            System.out.println("El numero "+numeroBuscar+" no se ha encontrado");
        }
    }

    public void ejercicio5(){

        double [][] matriz = new double[][]{ {5.5,7.2,6.8}, {8.1,9.3,7.5}, {4.2,5.6,6.1}, {7.8,8.9,9.2} };

        double promedio = 0;
        double suma;


        for (int i = 0; i < matriz.length; i++) {

            suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma+= matriz[i][j];
                promedio = suma / matriz[i].length;
            }

            System.out.printf("Promedio de fila: %d: %.2f \n",i,promedio);

        }


    }

    public void ejercicio6(){

        int [][] matriz = new int[][]{ {15,23,8,19},{42,17,31,25},{28,35,12,40} };

        int numeroMayor;

        for (int i = 0; i < matriz[0].length; i++) {

            numeroMayor = 0;

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] > numeroMayor){
                    numeroMayor = matriz[j][i];
                }
            }
            System.out.println("El numero mayor de la columa "+i+" es "+numeroMayor);
        }
    }
    
    public void ejercicio7(){
        
        int [][] matriz = new int[][]{ {1,2,3,4},{5,6,7,8},{9,10,11,12} };

        System.out.println("Matriz original:");

        for (int[] fila : matriz){
            for (int numeros : fila){
                System.out.print(numeros +"\t");
            }
            System.out.println();
        }

        System.out.println();

        int [][] matrizTrans = new int[4][3];

        for (int i = 0; i < matrizTrans.length; i++) {

            for (int j = 0; j < matrizTrans[i].length; j++) {
                matrizTrans[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz transpuesta:");

        for (int [] filas : matrizTrans){
            for (int numeros : filas){
                System.out.print(numeros+"\t");
            }
            System.out.println();
        }
    }

    public void ejercicio8(){

        int [][] matriz = new int[][]{ {12,15,8,23,34}, {17,20,9,14,27}, {6,11,18,25,30}, {13,22,7,16,19} };

        System.out.println("Matriz: ");
        for (int[] filas : matriz){
            for (int numeros : filas){
                System.out.print(numeros + "\t");
            }
            System.out.println();
        }

        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] %2 == 0){
                    numerosPares++;
                } else {
                    numerosImpares++;
                }
            }

        }

        System.out.println("Numeros pares: "+numerosPares);
        System.out.println("Numeros impares: "+numerosImpares);

    }

    public void ejercicio9(){

        int [][] matriz = new int[10][10];

        System.out.println("Tabla de multiplicar 10: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i+1)*(j+1);
            }

        }

        for (int[] fila : matriz){
            for (int numeros : fila){
                System.out.print(numeros+"\t");
            }
            System.out.println();
        }
    }

    public void ejercicioBombo(){

        //Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
        //sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
        //Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
        //que un mismo equipo no puede jugar más de un partido

        /*String[] bombo2 = new String[]{"Brasil","Peru","Japon","China", "USA"};

        for (int i = 0; i < bombo1.length; i++) {

            for (int j = 0; j < bombo2.length; j++) {

                System.out.println("El partido "+(i+1)+ " se juega entre el equipo "+bombo1[i]+" y el equipo "+bombo2[i]);
                break;

            }

        }*/

        String[] bombo1 = new String[]{"Marruecos","Portugal","Croacia","Espana","Alemania"};

        ArrayList<String> listaBombo2 = new ArrayList<>();
        listaBombo2.add("Brasil");
        listaBombo2.add("Peru");
        listaBombo2.add("Japon");
        listaBombo2.add("China");
        listaBombo2.add("USA");



        System.out.println(listaBombo2);

        Collections.shuffle(listaBombo2);

        System.out.println(listaBombo2);

        for (int i = 0; i < bombo1.length; i++) {

            System.out.println("El partido "+(i+1)+" se juega entre el equipo "+bombo1[i]+" y el equipo "+listaBombo2.get(i));

        }










    }

}


