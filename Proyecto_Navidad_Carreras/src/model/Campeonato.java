package model;

import java.util.List;

public class Campeonato {

    private List<Carrera> carreras;
    private List<Coche>participantes;

    public Campeonato(List<Carrera> carreras, List<Coche> participantes) {
        this.carreras = carreras;
        this.participantes = participantes;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Coche> participantes) {
        this.participantes = participantes;
    }

}

