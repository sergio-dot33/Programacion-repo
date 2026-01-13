import ejercicio10.Libro;
import ejercicio10.Prestamo;
import ejercicio10.Usuario;
import ejercicio11.Carrito;
import ejercicio11.Cliente;
import ejercicio11.ItemCarrito;
import ejercicio11.Producto;
import ejercicio1_2.Persona;
import ejercicio3.Rectangulo;
import ejercicio5.CuentaBancaria;
import ejercicio6.Estudiante;
import ejercicio7_1.Direccion;
import ejercicio8.Empleado;
import ejercicio9.Calculadora;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*

        Persona persona = new Persona("Ana", 30);
        System.out.println("Datos iniciales:");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println();


        System.out.println("Datos modificados:");
        persona.setNombre("Maria");
        persona.setEdad(28);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());

        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        System.out.println("Rectangulo con base "+rectangulo.getBase()+" y altura "+rectangulo.getAltura());
        System.out.println("Area: "+rectangulo.calcularArea());
        System.out.println("Perimetro: "+rectangulo.calcularPerimetro());

        Libro libro = new Libro();
        System.out.println("Libro 1: "+libro.getTitulo()+", "+libro.getAutor()+", "+libro.getPaginas()+" paginas");
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes");
        System.out.println("Libro 2: "+libro1.getTitulo()+", "+libro1.getAutor()+", "+libro1.getPaginas()+" paginas");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 471);
        System.out.println("Libro 3: "+libro2.getTitulo()+", "+libro2.getAutor()+", "+libro2.getPaginas()+" paginas");

        CuentaBancaria cuentaBancaria = new CuentaBancaria("Juan Garcia", 1500.0);
        System.out.println("Cuenta de "+cuentaBancaria.getTitular()+": "+cuentaBancaria.getSaldo()+"€");
        cuentaBancaria.depositar(500.0);
        System.out.println();

        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Maria Lopez", 800.0);
        System.out.println("Cuenta de "+cuentaBancaria1.getTitular()+": "+cuentaBancaria1.getSaldo()+"€");
        cuentaBancaria1.retirar(200.0);
        System.out.println();

        CuentaBancaria cuentaBancaria2 = new CuentaBancaria("Pedro Martin", 1200.0);
        System.out.println("Cuenta de "+cuentaBancaria2.getTitular()+": "+cuentaBancaria2.getSaldo()+"€");
        cuentaBancaria2.depositar(300.0);
        System.out.println();

        System.out.println("Saldos finales:");
        System.out.println(cuentaBancaria.getTitular()+", "+cuentaBancaria.getSaldo()+"€");
        System.out.println(cuentaBancaria1.getTitular()+", "+cuentaBancaria1.getSaldo()+"€");
        System.out.println(cuentaBancaria2.getTitular()+", "+cuentaBancaria2.getSaldo()+"€");

        Estudiante estudiante = new Estudiante("Laura Fernandez");
        System.out.println("Estudiante: "+estudiante.getNombre());
        estudiante.setNota(5.5);
        System.out.println("Nota actual: "+estudiante.getNota());
        System.out.println();
        estudiante.setNota(12);
        System.out.println("Nota actual: "+estudiante.getNota());

        Producto producto = new Producto("Teclado", 45.99, 10);
        System.out.println(producto);
        Producto producto1 = new Producto("Raton", 25.50, 25);
        System.out.println(producto1);
        Producto producto2 = new Producto("Monitor", 299.99, 5);
        System.out.println(producto2);

        Cliente cliente = new Cliente("Carlos Ruiz", "carlos.ruiz@gmail.com");
        Direccion direccion = new Direccion("Calle Mayor", "Madrid", 28001);
        cliente.setDireccion(direccion);
        cliente.mostrarDatos();

        Empleado[] empleados = new Empleado[5];

        empleados[0] = new Empleado("Ana Perez", "Desarrollodores", 35000);
        empleados[1] = new Empleado("Luis Garcia", "Disenador", 28000);
        empleados[2] = new Empleado("Maria Torres", "Project Manager", 42000);
        empleados[3] = new Empleado("Jorge Diaz", "Analista", 32000);
        empleados[4] = new Empleado("Laura Sanchez", "Tester", 26000);

        System.out.println("Lista de empleados:");

        int contador = 1;

        for (Empleado item : empleados){
            System.out.println(contador +". "+item.getNombre()+" - "+item.getPuesto()+" - "+ item.getSalario()+"€");
            contador++;
        }

        int salario = 0;
        String nombre = "";
        double promedio = 0;

        for (int i = 0; i < empleados.length; i++) {

            promedio += empleados[i].getSalario();


            if (empleados[i].getSalario() > salario){
                salario = empleados[i].getSalario();
                nombre = empleados[i].getNombre();

            }

        }

        System.out.println("Empleado con mayor salario: "+nombre+"("+salario+"€)");
        System.out.println("Salario promedio: "+promedio/ empleados.length+"€");

        System.out.println(Calculadora.sumar(10,5));
        System.out.println(Calculadora.restar(10,5));
        System.out.println(Calculadora.multi(10,5));
        System.out.println(Calculadora.division(10,5));
        System.out.println(Calculadora.potencia(2, 3));

        Libro libro = new Libro("Don Qujote", "Miguel de Cervantes", 123);
        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 234);
        Libro libro2 = new Libro("1984", "George Orwell", 567);

        System.out.println("---BIBLIOTECA---");
        System.out.println("Libros disponibles:");
        System.out.println(libro);
        System.out.println(libro1);
        System.out.println(libro2);

        Usuario usuario = new Usuario("Juan Perez", 101);
        Usuario usuario1 = new Usuario("Maria Lopez", 102);

        Prestamo prestamo = new Prestamo(libro,usuario,"20/12/2025");
        prestamo.prestarLibro();
        System.out.println();

        Prestamo prestamo1 = new Prestamo(libro, usuario1, "21/12/25");
        prestamo1.prestarLibro();
        System.out.println();

        prestamo.devolverLibro();
        System.out.println();
        prestamo1.prestarLibro();*/

        System.out.println("---TIENDA ONLINE---");

        Producto producto = new Producto("123", "Portatil", 899.99, 6);
        Producto producto1 = new Producto("234", "Raton", 25.50, 5);
        Producto producto2 = new Producto("567", "Teclado", 45.99, 4);

        Carrito carrito = new Carrito();

        Cliente cliente = new Cliente("Ana Martinez", "ana@gmail.com", carrito);

        System.out.println(cliente);

        carrito.anadirProductos(producto, 1);
        carrito.anadirProductos(producto1, 2);
        carrito.anadirProductos(producto2, 1);

        System.out.println();
        carrito.mostrarCarrito();

        System.out.println();
        carrito.eliminarProducto("Raton");

        System.out.println();
        carrito.finalizarCompra();

    }
}
