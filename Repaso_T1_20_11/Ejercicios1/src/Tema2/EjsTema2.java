package Tema2;

import java.util.Scanner;

public class EjsTema2 {

    public void ejercicios(){

        //1

        int num1 = 12;
        int num2 = 8;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);

        //2
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce segundo numero");
        int numero2 = scanner.nextInt();

        boolean mayor = numero1 > numero2;
        boolean menor = numero1 < numero2;
        boolean igual = numero1 == numero2;
        boolean diferente = numero1 != numero2;
        boolean mayorIgual = numero1 >= numero2;
        boolean menorIgual = numero1 <= numero2;

        System.out.println(numero1+" es mayor que "+numero2+" "+mayor);
        System.out.println(numero1+" es menor que "+numero2+" "+menor);
        System.out.println(numero1+" es igual que "+numero2+" "+igual);
        System.out.println(numero1+" es diferente que "+numero2+" "+diferente);
        System.out.println(numero1+" es mayor o igual que "+numero2+" "+mayorIgual);
        System.out.println(numero1+" es menor o igual que "+numero2+" "+menorIgual);
        */

        //3

        int valorInicial = 100;
        System.out.println("Valor inicial: "+valorInicial);
        valorInicial+=50;
        System.out.println("Despues de sumar 50: "+valorInicial);
        valorInicial-=30;
        System.out.println("Despues de restar 30: "+valorInicial);
        valorInicial*=2;
        System.out.println("Despues de multiplicar por 2: "+valorInicial);
        valorInicial/=4;
        System.out.println("Despues de dividir entre 4: "+valorInicial);

        //4
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        int nume = scanner.nextInt();

        boolean esPar = nume %2 ==0;
        boolean esImpar = nume %2 !=0;

        System.out.println("El numero "+nume+" es par? "+esPar);
        System.out.println("El numero "+nume+" es impar? "+esImpar);
        */

        //5

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edadUsuario = scanner.nextInt();
        System.out.println("Tienes carnet de conducir?");
        boolean tieneCarnet = scanner.hasNext();

        boolean mayor21 = edadUsuario>=21;
        boolean puedeConducir = tieneCarnet;
        boolean puedeAlquilar = mayor21 && puedeConducir;

        System.out.println("Eres mayor de 21? "+mayor21);
        System.out.println("Tienes carnet? "+puedeConducir);
        System.out.println("Puedes alquilar coche? "+puedeAlquilar);
        */

        //6
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce precio de producto");
        double precio = scanner.nextDouble();
        System.out.println("Que porcentaje de descuento tiene");
        double porcentajeDescuento = scanner.nextDouble();


        double precioDescuento = (porcentajeDescuento / 100) * precio;
        double descuentoTotal = precio - precioDescuento;

        System.out.println("Precio original: "+precio+" €");
        System.out.println("Descuento: ("+porcentajeDescuento+"%)  "+precioDescuento+" €");
        System.out.println("Tu precio final es de: "+descuentoTotal+" €");
        */

        //7
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int anios = scanner.nextInt();
        System.out.println("Eres estudiante?");
        boolean esEstudiante = scanner.nextBoolean();

        boolean esMenor = anios <26;
        boolean noEstudiante = !esEstudiante;
        boolean descuentoEspecial = esMenor && esEstudiante;

        System.out.println("Eres menor de 26 anios? "+esMenor);
        System.out.println("Eres estudiante? "+esEstudiante);
        System.out.println("No eres estudiante? "+noEstudiante);
        System.out.println("Tienes descuento joven? "+esMenor);
        System.out.println("Tienes descuento estudiante? "+esEstudiante);
        System.out.println("Tienes descuento especial? "+descuentoEspecial);
        */


        //8
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce numero");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce numero");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce numero");
        int numero3 = scanner.nextInt();

        int sumaTotal = numero1 + numero2 + numero3;
        int promedio = sumaTotal / 3;
        int operacion = (numero1 * numero2) / numero3;

        System.out.println("Resultado sumar 3 numeros es: "+sumaTotal);
        System.out.println("REsultado promedio es: "+promedio);
        System.out.println("Resultado de multi y dividir es: "+operacion);
        */

        //9
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota primer examen");
        double nota1 = scanner.nextDouble();
        System.out.println("Nota segundo examen");
        double nota2 = scanner.nextDouble();
        System.out.println("Nota tercer examen");
        double nota3 = scanner.nextDouble();

        double notaMedia = (nota1 + nota2 + nota3) /3;

        boolean aprobado = nota1>=5 && nota2>=5 && nota3>=5;
        boolean notable = nota1>=7 && nota2>=7 && nota3>=7;
        boolean sobresaliente = nota1>=9 && nota2>=9 && nota3>=9;

        System.out.printf("Tu nota media es de %.2f\n",notaMedia);
        System.out.println("Has aprobado? "+aprobado);
        System.out.println("Tiene notable? "+notable);
        System.out.println("Tiene sobresaliente? "+sobresaliente);
        */

        //10

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce salario por hora:");
        int salarioHora = scanner.nextInt();
        System.out.println("Introduce horas trabajadas:");
        int horasTrabajo = scanner.nextInt();
        System.out.println("Has hecho horas extras?");
        boolean hacesExtras = scanner.nextBoolean();

        int horasNormalesMax = 40;

        boolean trabajasMas40 = horasTrabajo > horasNormalesMax;
        boolean derechoExtra = trabajasMas40 && hacesExtras;

        int horasNormales = Math.min(horasTrabajo,horasNormalesMax);
        int horasExtra = derechoExtra ? horasTrabajo - 40 : 0;

        int salarioHoraNormal = salarioHora * horasNormales;
        int salarioHoraExtra = (horasExtra * salarioHora) * 2;
        int resultadoSalario = salarioHoraExtra + salarioHoraNormal;

        System.out.println("Trabajas mas de 40? "+trabajasMas40);
        System.out.println("Tienes derecho a extra? "+derechoExtra);
        System.out.println("Aplican horas extras? "+derechoExtra);
        System.out.println("Salario por horas normales: "+salarioHoraNormal);
        System.out.println("Salario por horas extras: "+salarioHoraExtra);
        System.out.println("Salario total: "+resultadoSalario);










    }




}
