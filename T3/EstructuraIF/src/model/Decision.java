package model;

public class Decision {

    public void estructuraIF(){
        System.out.println("Explicamos estructura de IF");
        int nota = 7;
        if(nota>=5){
            System.out.println("El examen esta aprobado");
        } else {
            System.out.println("El examen esta suspenso");
        }
    }

    public void estructuraIFELSEIF(){

        //0 -> desastroso
        //1 ->
        //2
        //4
        //5
        //8
        //9
        //10

        double nota = 100;


        /*System.out.println("Iniciando la evaluacion del examen");
        if (nota>=0 && nota<=10){
            if(nota>=0&&nota<1){
            System.out.println("Examen desastroso");
        } else if (nota<3.99){
            System.out.println("Examen mal");
        } else if (nota<5){
            System.out.println("Examen suspendo raspado");
        } else if (nota<8){
            System.out.println("Examen bien");
        } else if (nota<9){
            System.out.println("Examen notable");
        } else if (nota <10){
            System.out.println("Examen sobresaliente");
        } else{
            System.out.println("Examen de M");
        }


    }
}







