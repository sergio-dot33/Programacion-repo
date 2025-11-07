import java.util.Scanner;

public class EstructuraFor {

    public void ejercicio1(){

        //cuadrado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el tamano del cuadrado");
        int tamanio = scanner.nextInt();

        //pintar cuadrado

        for (int i = 0; i < tamanio; i++) {
            System.out.println("*");
        }


    }
}
