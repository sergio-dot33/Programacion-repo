package controller;

import model.Audio;
import model.ElementoMultimedia;
import model.Libro;
import model.Video;

import java.util.ArrayList;

public class GestionMultimedia {

    private ArrayList<ElementoMultimedia> listaMultimedia;

    public GestionMultimedia() {

        listaMultimedia = new ArrayList<>();
    }

    public ArrayList<ElementoMultimedia> getListaMultimedia() {
        return listaMultimedia;
    }

    public void setListaMultimedia(ArrayList<ElementoMultimedia> listaMultimedia) {
        this.listaMultimedia = listaMultimedia;
    }

    public boolean anadirElemento(ElementoMultimedia elemento){

        if (elemento == null){
            return false;
        }

        for (ElementoMultimedia item : listaMultimedia){
            if (item.getId().equalsIgnoreCase(elemento.getId())){
                return false;
            }
        }

        listaMultimedia.add(elemento);
        return true;

    }

    public boolean eliminarElemento(String id){

        for (int i = 0; i < listaMultimedia.size(); i++) {

            if (listaMultimedia.get(i).getId().equals(id)){
                listaMultimedia.remove(i);
                return true;
            }
        }

        return false;

    }

    public void listarTodos(){

        for (ElementoMultimedia item : listaMultimedia){
            System.out.println(item);
        }
    }

    public void listarAudio(){

        for (ElementoMultimedia item : listaMultimedia){
            if (item instanceof Audio){
                System.out.println(item);
            }
        }


    }

    public void listarVideo(){

        for (ElementoMultimedia item : listaMultimedia){
            if (item instanceof Video){
                System.out.println(item);
            }
        }
    }

    public void buscarAutor(String autor){

        for (ElementoMultimedia item : listaMultimedia){

            if (item instanceof Libro){
                if (item.getAutor().equalsIgnoreCase(autor)){
                    System.out.println(item.getTitulo());
                }
            }

        }
    }

    public void buscarActor(String actor){

        for (ElementoMultimedia item : listaMultimedia){

            if (item instanceof Video){

                for (String actores : ((Video) item).getActores()){

                    if (actores.equalsIgnoreCase(actor)){
                        System.out.println(item.getTitulo());
                        break;
                    }
                }
            }
        }
    }

    public void buscarDirector(String director){

        for (ElementoMultimedia item : listaMultimedia){

            if (item instanceof Video){
                if (((Video) item).getDirector().equalsIgnoreCase(director)){
                    System.out.println(item.getTitulo());
                }
            }
        }
    }
}
