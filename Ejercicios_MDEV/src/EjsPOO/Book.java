package EjsPOO;

public class Book {


    //1- Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos

    private String title, author;

    public Book(String title, String author){

        this.title = title;
        this.author = author;

    }

    public void mostrarDatos(){

        System.out.println("El titulo del libro es "+title+" y el autor se llama "+author);
    }
}
