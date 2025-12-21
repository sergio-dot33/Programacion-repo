package EjsPOO;

public class BankAccount {

    //6- Crea una clase BankAccount con atributo balance y un metodo deposit que sume el saldo

    private double balance;

    public BankAccount(double balance){

        this.balance = balance;

    }

    public void deposit(double cantidadDeposit){

        balance += cantidadDeposit;

    }

    public double verSaldo(){

        return balance;

    }











}
