import java.util.Scanner;

public class Operador {

    Scanner lectorNumeros;
    Scanner lectorNumeros1;
    Scanner lectorNumeros2;
    Scanner lectorDatos;
    Scanner lectorPrecio;
    Scanner lectorDatos1;
    Scanner lectorNumeros3;
    Scanner lectorNotas;
    Scanner lectorHoras;

    public void ejercicio1(){

        lectorNumeros = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int num1 = lectorNumeros.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = lectorNumeros.nextInt();

        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        int divi = num1/num2;
        int modulo = num1%num2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multi: "+multi);
        System.out.println("Division: "+divi);
        System.out.println("Modulo: "+modulo);


        lectorNumeros.close();

    }

    public void ejercicio2(){

        lectorNumeros1 = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int num1 = lectorNumeros1.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = lectorNumeros1.nextInt();

        boolean mayor = num1>num2;
        boolean menor = num1<num2;
        boolean igual = num1==num2;
        boolean diferente = num1!=num2;
        boolean mayorIgual = num1>=num2;
        boolean menorIgual = num1<=num2;

        System.out.println(num1+ " es mayor que "+num2+" ?:"+mayor);
        System.out.println(num1+ " es menor que "+num2+" ?:"+menor);
        System.out.println(num1+ " es igual que "+num2+" ?:"+igual);
        System.out.println(num1+ " es diferente que "+num2+" ?:"+diferente);
        System.out.println(num1+ " es mayor o igual que "+num2+" ?:"+mayorIgual);
        System.out.println(num1+ " es menor o igual que "+num2+" ?:"+menorIgual);

        lectorNumeros1.close();


    }

    public void ejercicio4(){

        lectorNumeros2 = new Scanner(System.in);
        System.out.println("Introduce un numero :");
        int num = lectorNumeros2.nextInt();
        int resto = num % 2;

        if (resto == 0){
            System.out.println("El numero "+num+ " es par (resto al dividir entre 2 : "+resto+" )");
        } else {
            System.out.println("El numero "+num+ " es impar (resto al dividir entre 2 : "+resto+" )");
        }

        lectorNumeros2.close();

    }

    public void ejercicio5(){

        lectorDatos = new Scanner(System.in);

        System.out.println("Introduce tu edad :");
        int edad = lectorDatos.nextInt();
        System.out.println("Tienes carnet de conducir? ");
        boolean siCarnet = lectorDatos.nextBoolean();

        boolean esMayor = edad>=21;
        boolean puedeAlquilar = esMayor && siCarnet;

        System.out.println("Eres nayor de 21 anos?: "+esMayor);
        System.out.println("Tienes carnet?: "+siCarnet);
        System.out.println("Puedes aluilar un coche? "+puedeAlquilar);

        lectorDatos.close();


    }

    public void ejercicio6(){

        lectorPrecio = new Scanner(System.in);

        System.out.println("Introduce el precio del producto:");
        double precio = lectorPrecio.nextDouble();
        System.out.println("Introduce el porcentaje de descuento:");
        double descuento = lectorPrecio.nextDouble();
        System.out.println("Precio original: "+precio+ " €");

        double descuentoFormula = descuento*precio/100;
        double precioFinal = precio-descuentoFormula;

        System.out.println("Precio final: "+precioFinal+" €");

        lectorPrecio.close();

    }

    public void ejercicio7(){

        lectorDatos1 = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = lectorDatos1.nextInt();
        System.out.println("Eres estudiante? (true/false):");
        boolean siEstudiante = lectorDatos1.nextBoolean();

        boolean menor26 = edad<26;
        boolean noEstudiante = !siEstudiante;
        boolean descuentoJoven = menor26;
        boolean descuentoEstudiante = siEstudiante;
        boolean descuentoEspecial = menor26 && siEstudiante;

        System.out.println("Eres menor de 26 anos? "+menor26);
        System.out.println("Eres estudiante? "+siEstudiante);
        System.out.println("NO eres estudiante? "+noEstudiante);
        System.out.println("Descuento joven? "+descuentoJoven);
        System.out.println("Descuento estudiante? "+descuentoEstudiante);
        System.out.println("Descuento especial? "+descuentoEspecial);

        lectorDatos1.close();

    }

    public void ejercicio8(){

        lectorNumeros3 = new Scanner(System.in);
        System.out.println("Introduce primer numero:");
        int numero1 = lectorNumeros3.nextInt();
        System.out.println("Introduce segundo numero:");
        int numero2 = lectorNumeros3.nextInt();
        System.out.println("Introduce tercer numero:");
        int numero3 = lectorNumeros3.nextInt();

        int suma = numero1+numero2+numero3;
        System.out.println("Suma de los tres numeros "+suma);

        double promedio = suma/3;
        System.out.println("Promedio = "+promedio);
        double multi = (numero1*numero2)/numero3;
        System.out.println("Resultado de multi y div "+multi);

        lectorNumeros.close();

    }

    public void ejercicio9(){

        lectorNotas = new Scanner(System.in);
        System.out.println("Introduce nota del primer examen");
        double nota1 = lectorNotas.nextDouble();
        System.out.println("Introduce nota del segundo examen");
        double nota2 = lectorNotas.nextDouble();
        System.out.println("Introduce nota del tercer examen");
        double nota3 = lectorNotas.nextDouble();

        double notaMedia = (nota1+nota2+nota3)/3;
        boolean siAprobado = nota1>=5 && nota2>=5 && nota3>=5;
        boolean siNotable = nota1>=7 && nota2>=7 && nota3>=7;
        boolean siSobresaliente = nota1>=9 && nota2>=9 && nota3>=9;

        System.out.println("Nota media: "+notaMedia);
        System.out.println("Ha aprobado?: "+siAprobado);
        System.out.println("Tiene notable? "+siNotable);
        System.out.println("Tiene sobresaliente? "+siSobresaliente);

        lectorNotas.close();

    }

    public void ejercicio10(){

        lectorHoras = new Scanner(System.in);
        System.out.println("Indica cuanto cobras por hora");
        int salarioHora = lectorHoras.nextInt();
        System.out.println("Indica cuantas horas has trabajado");
        int horasTrabajadas = lectorHoras.nextInt();
        System.out.println("Has trabajado horas extras");
        boolean horasExtras = lectorHoras.nextBoolean();

        int salarioTotal=0;

        if (horasExtras && horasTrabajadas>40){
            int numeroHorasExtras = horasTrabajadas-40;
            salarioTotal = numeroHorasExtras * (salarioHora*2);
            salarioTotal += 40*salarioHora;
        } else {
            salarioTotal += 40*salarioHora;
        }
        System.out.println("El salario sobrado este mes es "+salarioTotal);



        lectorHoras.close();





    }
}
















