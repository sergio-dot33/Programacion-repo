import java.util.Scanner;

public class Programa {

    Scanner lectorEdad;
    Scanner lectorNumero;
    Scanner lectorNota;
    Scanner lectorCompra;
    Scanner lectorNumero1;
    Scanner lectorEdad1;
    Scanner lectorNota1;
    Scanner lectorNumero2;
    Scanner lectorIMC;
    Scanner lectorAltura;
    Scanner lectorPrecio;
    Scanner lectorPass;
    Scanner lectorDia;

    public void ejercicio1(){

        lectorEdad = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = lectorEdad.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("Eres menor de edad. No puedes votar");
        }

    }

    public void ejercicio2(){

        lectorNumero = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = lectorNumero.nextInt();

        if (numero>=0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    public void ejercicio3(){

        lectorNota = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double nota = lectorNota.nextDouble();

        if (nota>=5){
            System.out.println("Enhorabuena, has aprobado!");
        } else {
            System.out.println("Has suspendido");
        }

    }

    public void ejercicio4(){

        lectorCompra = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra:");
        double precioCompra = lectorCompra.nextDouble();
        double descuento = precioCompra*0.10;
        double precioTotal = precioCompra-descuento;



        if (precioCompra>=100){
            System.out.println("Importe original "+precioCompra+" €");
            System.out.println("Descuento aplicado: "+descuento+" €");
            System.out.println("Importe final: "+precioTotal+" €");
        } else {
            System.out.println("Importe final "+precioCompra);
        }
    }

    public void ejercicio5(){

        lectorNumero1 = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = lectorNumero1.nextInt();

        if (numero%2==0){
            System.out.println("El numero "+numero+" es par");
        } else {
            System.out.println("El numero es impar");
        }

    }

    public void ejercicio6(){

        lectorEdad1 = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = lectorEdad1.nextInt();

        if (edad>=16){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        lectorEdad1.close();



    }

    public void ejercicio7(){

        lectorNota1 = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Introduce tu nota:");
            nota = lectorNota1.nextDouble();

            if (nota<0 || nota>10){
                System.out.println("Error lectura");
            }
        } while (nota<0 || nota>10);


        if (nota>=0 && nota<=4.9){
            System.out.println("Suspenso");
        } else if (nota>=5 && nota<=6.9) {
            System.out.println("Aprobado");
        } else if (nota>=7 && nota<=8.9){
            System.out.println("Notable");
        } else if (nota>=9 && nota==10){
            System.out.println("Sobresaliente");
        }

    }

    public void ejercicio8(){

        lectorNumero2 = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = lectorNumero2.nextInt();
        System.out.println("Introduce otro numero");
        int numero2 = lectorNumero2.nextInt();

        if (numero1>numero2){
            System.out.println("El numero "+numero1+" es mayor que el "+numero2);
        } else if (numero1<numero2){
            System.out.println("El numero "+numero1+" es menor que el "+numero2);
        } else if (numero1==numero2) {
            System.out.println("El "+numero1+" y el "+numero2+" son iguales");
        }


    }

    public void ejercicio9(){

        lectorIMC = new Scanner(System.in);

        System.out.println("Introduce tu peso en KG");
        double peso = lectorIMC.nextDouble();
        System.out.println("Introduce tu altura en metros");
        double altura = lectorIMC.nextDouble();

        double imc = peso/(altura*altura);
        System.out.printf("Tu IMC es de %.2f\n",imc);

        if (imc>=18.5 && imc<=24.9){
            System.out.println("Estas en peso normal");
        } else if (imc<18.5){
            System.out.println("Estas por debajo del peso normal");
        } else if (imc>24.9){
            System.out.println("Estas por encima del peso normal");
        }
    }

    public void ejercicio10(){

        lectorAltura = new Scanner(System.in);

        System.out.println("Introduce tu altura en cm:");
        int altura = lectorAltura.nextInt();
        int alturaMin = 120;
        int alturaMax = 200;

        if (altura<=120){
            System.out.println("No puedes subir. Altura minima "+alturaMin);
        } else if (altura>120 && altura<=200){
            System.out.println("Puedes subir");
        } else if (altura>200) {
            System.out.println("No puedes subir. Altura maxima "+alturaMax);
        }
    }

    public void ejercicio11(){

        lectorPrecio = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra:");
        int precioCompra = lectorPrecio.nextInt();
        System.out.println("Eres socio?");
        boolean esSocio = lectorPrecio.nextBoolean();

        double descImporteMasSocio = precioCompra*0.8;
        double descNoImporteMasSocio = precioCompra*0.9;
        double descImporteMenosSocio = precioCompra*0.95;

        if (precioCompra>=200 && esSocio==true){
            System.out.println("Importe original: "+precioCompra);
            System.out.println("Tienes descuento del 20%");
            System.out.println("Importe final "+descImporteMasSocio);
        } else if (precioCompra<200 && esSocio==true) {
            System.out.println("Tienes descuento del 10%");
            System.out.println("Importe final: "+descNoImporteMasSocio);
        } else if (precioCompra>=300 && esSocio==false){
            System.out.println("Tienes descuento del 5%");
            System.out.println("Importe final: "+descImporteMenosSocio);
        } else if (precioCompra<300 && esSocio==false) {
            System.out.println("No hay descuento");
        }



    }

    public void ejercicio12(){

        lectorPass = new Scanner(System.in);

        System.out.println("Introduce una contrasena");
        String pass = lectorPass.next();
        boolean nCaracteres  = pass.length() >=8;
        System.out.println("La contrasena al menos tiene 8 caracteres "+nCaracteres);
        boolean esValida = !(pass.equals("12345678") || pass.equals("password"));
        System.out.println("La pass es prohibida "+!esValida);
        boolean contieneNumero = pass.contains("1") || pass.contains("2");
        boolean passValida = nCaracteres && esValida && contieneNumero;

        System.out.println("La contrasena es valida: "+passValida);










































    }

    public void ejercicio13(){

        lectorDia = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = lectorDia.nextInt();
        System.out.println("Introduce dia de la semana");
        int diaSemana = lectorDia.nextInt();
        int calculoEntrada = 0;

        if (edad<12){
            calculoEntrada = 0;
        } else if (edad<17){
            if (diaSemana == 2){
                calculoEntrada = 0;
            }
        }


















    }


}
