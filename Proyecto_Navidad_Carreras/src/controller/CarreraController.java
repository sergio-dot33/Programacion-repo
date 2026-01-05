package controller;

import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarreraController {

    public void empezarCarrera(Carrera carrera){

        for (Coche coche : carrera.getParticipantes()){
            coche.resetearKm();
        }

        simularVueltas(carrera);
        ordenarCoches(carrera);
        asignarPuntos(carrera);
        carrera.setFinalizada(true);
    }

    private void simularVueltas(Carrera carrera){

        Random random = new Random();

        boolean terminado = false;

        while (!terminado){

            for (Coche coche : carrera.getParticipantes()){
                int km = random.nextInt(50 - 20 +1) + 20;
                coche.avanzar(km);

                if (coche.getKmActuales() >= carrera.getKmObjetivo()){
                    terminado = true;
                }
            }
        }
    }

    private void ordenarCoches(Carrera carrera){

        carrera.getParticipantes().sort((c1,c2) -> c2.getKmActuales() - c1.getKmActuales());

        carrera.setClasificacion(carrera.getParticipantes());

    }

    private void asignarPuntos(Carrera carrera){

        List<Integer> puntosCarrera = new ArrayList<>();

        for (int i = 0; i < carrera.getClasificacion().size(); i++) {
            Coche coche = carrera.getClasificacion().get(i);

            if (i ==0){
                coche.sumarPuntos(10);
                puntosCarrera.add(10);
                coche.setVictorias(coche.getVictorias() + 1);
            } else if (i == 1){
                coche.sumarPuntos(8);
                puntosCarrera.add(8);
            } else if (i == 2){
                coche.sumarPuntos(6);
                puntosCarrera.add(6);
            } else {
                coche.sumarPuntos(0);
                puntosCarrera.add(0);
            }
        }
        carrera.setPuntosCarrera(puntosCarrera);
    }
}
