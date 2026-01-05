package model;

public class Coche {

    private String marca, modelo;
    private int kmActuales, puntos, victorias;

    public Coche(String marca, String modelo, int kmActuales, int puntos, int victorias){

        this.marca = marca;
        this.modelo = modelo;
        this.kmActuales = kmActuales;
        this.puntos = puntos;
        this.victorias = victorias;
    }

    public void avanzar(int km){
        this.kmActuales += km;
    }

    public void resetearKm(){
        this.kmActuales = 0;
    }

    public void sumarPuntos(int puntos){

        this.puntos += puntos;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmActuales() {
        return kmActuales;
    }

    public void setKmActuales(int kmActuales) {
        this.kmActuales = kmActuales;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
}
