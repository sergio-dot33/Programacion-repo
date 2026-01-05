import controller.CampeonatoController;
import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Coche> coches = new ArrayList<>();
        List<Carrera> carreras = new ArrayList<>();

        System.out.println("Cuantos coches van a participar?");
        int cochesParticipan = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cochesParticipan; i++) {

            System.out.println("Marca del coche "+ (i + 1)+" :");
            String marca = scanner.nextLine();
            System.out.println("Modelo del coche "+ (i + 1)+" :");
            String modelo = scanner.nextLine();
            Coche coche = new Coche(marca,modelo,0,0, 0);
            coches.add(coche);
        }

        System.out.println("Cuantas carreras va a tener el campeonato?");
        int carrerasCampeonato = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < carrerasCampeonato; i++) {

            System.out.println("Nombre de la carrera: " + (i + 1));
            String nombreCarrera = scanner.nextLine();
            System.out.println("Cuantos km totales tiene la carrera "+ (i + 1));
            int kmTotales = scanner.nextInt();
            scanner.nextLine();
            Carrera carrera = new Carrera(nombreCarrera, kmTotales, coches);
            carreras.add(carrera);

        }

        Campeonato campeonato = new Campeonato(carreras,coches);
        CampeonatoController campeonatoController = new CampeonatoController();
        campeonatoController.iniciarCampeonato(campeonato);

        scanner.close();
    }
}
