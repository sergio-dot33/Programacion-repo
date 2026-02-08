package model;

import java.util.ArrayList;

public class Video extends ElementoMultimedia {

    private String director;
    private ArrayList<String> actores;

    public Video() {

        actores = new ArrayList<>();
    }

    public Video(String id, String titulo, String autor, String formato, int tamano, String director, ArrayList<String> actores) {
        super(id, titulo, autor, formato, tamano);
        this.director = director;
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return super.toString() +
                "director='" + director + '\'' +
                ", actores=" + actores +
                '}';
    }
}
