import java.util.Scanner;

public class Operadores {

    public void operadoresArirmeticos(){
        System.out.println("Explicacion de los operadores aritmeticos");
        // UNARIOS -> solo necesitan un operando
        int operandoUno = 7;
        operandoUno++;
        System.out.println("Despues de incrementar "+operandoUno);
        operandoUno--;
        System.out.println("Despues de decrementar "+operandoUno);
        operandoUno=-operandoUno; //estoy calculando su inverso -8 -> 8

        //BINARIOS

        int operandoDos = 0;
        int suma = operandoUno+operandoDos;
        System.out.println("El resultado de la suma es "+(operandoUno+operandoDos));

        int resta = operandoUno - operandoDos;
        System.out.println("El resultrado de la resta es "+resta);

        int multi = operandoUno * operandoDos;
        System.out.println("El resultado de la multi es "+multi);

        double division = (double) operandoUno / operandoDos;
        System.out.println("El resultado de la division es "+division);

        //casteo cambiar temporalmente el tipo

        int modulo = operandoUno%2; //el resto de la division
        System.out.println(modulo);

    }

    public void operadoresAsignacion(){

        int operandoUno = 6;
        operandoUno += 6; // operandoUno = opernandoUno +10; //16
        operandoUno -= 9;
        operandoUno *= 18;

    }

    public void operadoresComparacion(){
        int numeroUno =1;
        int numeroDos =4;

        boolean resultado = numeroUno>numeroDos; // false
        resultado = numeroUno>=numeroDos; // false
        resultado = numeroUno<numeroDos; // true
        resultado = numeroUno==numeroDos; // false
        resultado = numeroUno!=numeroDos; // true


    }

    public void operadoresLogicos(){
        int numeroUno =4;
        int numeroDos = 15;
        int numeroTres = 17;

        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0;
                                // true && true && true & false -> false

        System.out.println("El resultado de la comparacion logica es "+resultadoLogicoAND);

        boolean resultadoLogicoOR = numeroUno!=10;
                                // true || false || false || false -> true

        System.out.println("El resultado de la comparacion logica es "+resultadoLogicoOR);

        numeroUno = 0;
        numeroDos = 10;
        numeroTres = 20;


        boolean resultadoTotal = numeroUno>=0 && numeroDos<20&&false; //false
        System.out.println("El resultado total es "+resultadoTotal);
        boolean resultadoTotalInv = !resultadoTotal;
        System.out.println("El resultado total es "+!resultadoTotalInv);

    }

    public void evaluarCandidato(){

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombreApellido  = lectorTeclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Que salario quieres cobrar");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        // edad inferior a 40 y sueldo < 40k y experiencia

        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluacion es que el candidato es "+resultadoEvaluacion);

        lectorTeclado.close();

    }

}
