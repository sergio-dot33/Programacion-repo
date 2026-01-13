package ejercicio7_1;

public class Cliente {

    private String nombre, email;

    Direccion direccion = new Direccion();

    public Cliente(String nombre, String email){

        this.nombre = nombre;
        this.email = email;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void mostrarDatos(){

        System.out.println("Cliente: "+getNombre());
        System.out.println("Email: "+getEmail());
        System.out.println("Direccion: "+getDireccion());

    }


}
