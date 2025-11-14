import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota:");
        int nota = scanner.nextInt();

        switch (nota){
            case 1:
                String nombre = "assfasfda";
                System.out.println("La nota vale 1, has suspendido con honores");
                break;

            case 5:
                System.out.println("Has aprobado raspado");
                break;

            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;

            case 10:
                System.out.println("Lo has cuadrado");
                break;

            default:
                System.out.println("Estya nota no es analizable");
        }

        System.out.println("Hoy estamos a "+DiaSemana.Jueves+" de "+MesesAnio.Noviembre);

    }

    public void estructuraLambda(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        String nombre = scanner.next();
        String apellido = "";

        switch (nombre.toUpperCase()){
            case "Borja" ->{
                System.out.println("Nombre introducido Borja");
                apellido = "asd";
            }
            case "Maria" ->{
                System.out.println("Nombre introducido Borja");
                apellido = "asd";
            }
            case "Juan" ->{
                System.out.println("Nombre introducido Borja");
                apellido = "asd";
            }
            case "Marcos" ->{
                System.out.println("Nombre introducido Borja");
                apellido = "asd";
            }
            default -> {
                System.out.println("Nombre introducido no contemplado");
                apellido = "asd";
            }

        }
    }

    public void estructuraChar(){

        char letra = 'a';

        switch (letra){

        }

    }




}
