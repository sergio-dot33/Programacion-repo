package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

public class CampeonatoController {

    public void iniciarCampeonato(Campeonato campeonato){

        CarreraController carreraController = new CarreraController();

        for (int i = 0; i < campeonato.getCarreras().size(); i++) {

            Carrera carrera = campeonato.getCarreras().get(i);

            carreraController.empezarCarrera(carrera);

            mostrarResultadosCarrera(carrera);

            mostrarClasificacionGeneral(campeonato);

            System.out.println();

        }

        mostrarClasificacionGeneral(campeonato);

    }

    private void mostrarResultadosCarrera(Carrera carrera){

        System.out.println("\n---CARRERA "+carrera.getNombre()+" 2026---\n");

        for (int i = 0; i < carrera.getClasificacion().size(); i++) {

            Coche coche = carrera.getClasificacion().get(i);

            int posicion = i + 1;

            System.out.println("El piloto en posicion "+posicion+" pertenece al coche "+coche.getMarca()+ " " +coche.getModelo()+" y ha obtenido "+carrera.getPuntosCarrera().get(i)+" puntos");

        }


    }

    private void mostrarClasificacionGeneral(Campeonato campeonato){

        campeonato.getParticipantes().sort((c1, c2) -> {
            if (c2.getPuntos() != c1.getPuntos()){
                return c2.getPuntos() - c1.getPuntos();
            } else {
                return c2.getVictorias() - c1.getVictorias();
            }
        });

        System.out.println("\n---CLASIFICACIÓN GENERAL---\n");

        for (int i = 0; i < campeonato.getParticipantes().size(); i++) {

            Coche coche = campeonato.getParticipantes().get(i);

            int posicion = i + 1;

            System.out.println("El piloto en posicion "+posicion+" pertenece al coche "+coche.getMarca()+ " " +coche.getModelo()+" y ha obtenido "+coche.getPuntos()+" puntos");


        }
        System.out.println();

        Coche lider = campeonato.getParticipantes().get(0);
        System.out.println("Lider del campeonato: "+lider.getMarca()+" "+lider.getModelo()+" con " +lider.getPuntos()+" puntos");
    }

}
