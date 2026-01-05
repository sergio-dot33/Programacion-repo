package model;

import java.util.List;

public class Carrera {

    private int kmObjetivo;
    private boolean finalizada;
    private String nombre;
    private List<Coche> participantes;
    private List<Coche> clasificacion;
    private List<Integer> puntosCarrera;

    public Carrera(String nombre, int kmObjetivo, List<Coche> participantes) {
        this.nombre = nombre;
        this.kmObjetivo = kmObjetivo;
        this.participantes = participantes;
        this.finalizada = false;
        this.clasificacion = null;
    }


    public int getKmObjetivo() {
        return kmObjetivo;
    }

    public void setKmObjetivo(int kmObjetivo) {
        this.kmObjetivo = kmObjetivo;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public List<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Coche> participantes) {
        this.participantes = participantes;
    }

    public List<Coche> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(List<Coche> clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getPuntosCarrera() {
        return puntosCarrera;
    }

    public void setPuntosCarrera(List<Integer> puntosCarrera) {
        this.puntosCarrera = puntosCarrera;
    }
}
