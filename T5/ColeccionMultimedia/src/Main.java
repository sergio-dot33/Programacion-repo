import controller.GestionMultimedia;
import model.Audio;
import model.ElementoMultimedia;
import model.Libro;
import model.Video;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("APP GESTOR MULTIMEDIA");
        System.out.println("===============");

        GestionMultimedia gestionMultimedia = new GestionMultimedia();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        ElementoMultimedia elemento = null;
        

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Anadir a la coleccion");
            System.out.println("2. Eliminar de la coleccion");
            System.out.println("3. Listar elementos");
            System.out.println("4. Buscar por autor");
            System.out.println("5. Buscar por actor");
            System.out.println("6. Buscar por director");
            System.out.println("7. Salir");
            System.out.println();
            System.out.println("Selecciona opcion:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){





                case 1 -> {
                    System.out.println("Que tipo de objeto es?");
                    String objeto = scanner.nextLine().toLowerCase();
                    System.out.println("Introduce id");
                    String id = scanner.nextLine();
                    System.out.println("Introduce titulo:");
                    String titulo = scanner.nextLine();
                    System.out.println("Introduce autor");
                    String autor = scanner.nextLine();
                    System.out.println("Introduce tamano");
                    int tamano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce formato");
                    String formato = scanner.nextLine();

                    if (objeto.equals("libro")){
                        System.out.println("Introduce ISBN");
                        String isbn = scanner.nextLine();
                        System.out.println("Introduce numero paginas");
                        int paginas = scanner.nextInt();
                        scanner.nextLine();

                        elemento = new Libro(id, titulo, autor, formato, tamano, isbn, paginas);

                    } else if (objeto.equals("video")) {
                        System.out.println("Introduce director");
                        String director = scanner.nextLine();

                        ArrayList<String> actores = new ArrayList<>();
                        System.out.println("Introduce actores y escribe fin para terminar");

                        while (true){
                            String actor = scanner.nextLine();
                            if (actor.equalsIgnoreCase("fin")){
                                break;
                            }
                            actores.add(actor);
                        }

                        elemento = new Video(id, titulo, autor, formato, tamano, director, actores);

                    } else if (objeto.equals("audio")) {
                        System.out.println("Introduce duracion");
                        int duracion = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduce soporte");
                        String soporte  = scanner.nextLine();

                        elemento = new Audio(id, titulo, autor, formato, tamano, soporte, duracion);
                    }


                    if (gestionMultimedia.anadirElemento(elemento)){
                        System.out.println("Anadido correctamente");
                    } else {
                        System.out.println("Error, ya existe elemento con mismo id");
                    }

                }

                case 2 -> {

                    System.out.println("Introduce que id quieres eliminar");
                    String id = scanner.nextLine();

                    if (gestionMultimedia.eliminarElemento(id)){
                        System.out.println("Eliminado correctamente");
                    } else {
                        System.out.println("Error, no se ha podido eliminar");
                    }
                }
                
                case 3 -> {

                    System.out.println("Pulsa 1 para listar todo, 2 para listar videos o 3 para listar audio");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (numero == 1){
                        gestionMultimedia.listarTodos();
                    } else if (numero == 2) {
                        gestionMultimedia.listarVideo();
                    } else if (numero == 3) {
                        gestionMultimedia.listarAudio();
                    } else {
                        System.out.println("Opcion no valida");
                    }
                }

                case 4 -> {

                    System.out.println("Introduce el autor a buscar...");
                    String autor = scanner.nextLine();

                    gestionMultimedia.buscarAutor(autor);

                }

                case 5 -> {

                    System.out.println("Introduce el actor a buscar...");
                    String actor = scanner.nextLine();

                    gestionMultimedia.buscarActor(actor);

                }

                case 6 -> {

                    System.out.println("Introduce el director a buscar...");
                    String director = scanner.nextLine();

                    gestionMultimedia.buscarDirector(director);

                }

                case 7 -> System.out.println("Saliendo...");

                default -> System.out.println("Valor introducido no valido");

            }

        } while (opcion != 7);

    }
}
