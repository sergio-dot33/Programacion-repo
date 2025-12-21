package EjsPOO;

public class Product {

    //    10- Crea una clase Product y un metodo que aplique un descuento sobre su precio

    private String nombre;
    private double precio;

    public Product(String nombre, double precio){

        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularDescuento(){

        return precio * 0.2;
    }

    public double verPrecioFinal(){

        return precio - calcularDescuento();
    }
}
