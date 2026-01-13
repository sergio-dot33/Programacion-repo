package ejercicio11;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<ItemCarrito>items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public Carrito(ArrayList<ItemCarrito> items) {
        this.items = items;
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemCarrito> items) {
        this.items = items;
    }

    public void anadirProductos(Producto producto, int cantidad){

        if (items == null){
            items = new ArrayList<>();
        }

        if (producto.getStock() < cantidad){
            System.out.println("No tenemos stock suficiente de "+producto.getNombre());
            return;
        }

        boolean encontrado = false;

        for (ItemCarrito data : items){
            if (data.getProducto().getCodigo().equals(producto.getCodigo())){
                data.setCantidad(data.getCantidad() + cantidad);
                encontrado = true;
                System.out.println("Anadiendo "+producto.getNombre()+" x "+cantidad+" al carrito");
                break;
            }
        }

        if (!encontrado){
            ItemCarrito nuevo = new ItemCarrito(producto,cantidad);
            items.add(nuevo);
            System.out.println("Anadiendo "+producto.getNombre()+" x "+cantidad+" al carrito");
        }

    }

    public void mostrarCarrito(){

        if (items == null || items.isEmpty()){
            System.out.println("El carrito esta vacio");
            return;
        }

        System.out.println("---CARRITO DE COMPRA---");

        double precioTotal = 0;
        int contador = 1;

        for (ItemCarrito data : items){

            double subtotal = (data.getProducto().getPrecio()) * data.getCantidad();
            System.out.println(contador+"."
                    + data.getProducto().getNombre()
                    +" x "+ data.getCantidad()
                    +" - "+subtotal+"€");

            precioTotal+= subtotal;
            contador++;

        }

        System.out.println("Total: "+precioTotal+"€");

    }

    public void eliminarProducto(String producto){

        if (items == null || items.isEmpty()){
            System.out.println("El carrito esta vacio");
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getProducto().getNombre().equals(producto)){
                encontrado = true;
                String nombre = items.get(i).getProducto().getNombre();
                items.remove(i);
                System.out.println("Eliminando "+nombre+" del carrito");
                break;
            }
        }

        if (!encontrado){
            System.out.println("Producto no encontrado");
        } else {
            System.out.println("---CARRITO ACTUALIZADO---");
            mostrarCarrito();
        }
    }

    public void finalizarCompra(){

        System.out.println("Finalizando compra...");

        if (items == null || items.isEmpty()){
            System.out.println("El carrito esta vacio");
            return;
        }

        for (ItemCarrito data : items){


            if (data.getProducto().getStock() < data.getCantidad()){
                System.out.println("Compra cancelada, no tenemos suficiente stock");
                return;
            }
        }

        for (ItemCarrito data : items){

            int nuevoStock = data.getProducto().getStock() - data.getCantidad();

            data.getProducto().setStock(nuevoStock);

        }

        System.out.println("Compra realizada con exito");
        System.out.println("Stock actualizado");
        items.clear();


    }
}
