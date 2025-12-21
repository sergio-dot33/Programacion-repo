package EjsPOO;

public class Worker {

    //     8- Crea una clase Worker que reciba nombre y salario y metodo para mostrar su salario

    private String nombre;
    private int salario;

    public Worker(String nombre, int salario){

        this.nombre = nombre;
        this.salario = salario;

    }

    public int verSalario(){

        return salario;
    }
}


