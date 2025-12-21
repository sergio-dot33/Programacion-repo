package EjsPOO;

public class Student {

    //5- Crea una clase Student con atributo score y un metodo que diga si aprobo (mayor o igual a 60)

    private int score;

    public Student(int score){

        this.score = score;

    }

    public boolean siAprobado(){

        return score>=60;

    }

}


