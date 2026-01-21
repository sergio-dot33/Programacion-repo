package ejercicio5;

public class Desarrollador extends Empleado {

    private String lenguajeMain;

    public Desarrollador() {
    }

    public Desarrollador(String nombre, int salarioBase, String lenguajeMain) {
        super(nombre, salarioBase);
        this.lenguajeMain = lenguajeMain;
    }

    public String getLenguajeMain() {
        return lenguajeMain;
    }

    public void setLenguajeMain(String lenguajeMain) {
        this.lenguajeMain = lenguajeMain;
    }




}
