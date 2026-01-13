package ejercicio5;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;

    }

    public void depositar(double deposito){

        System.out.println("Deposito: "+deposito+"€");
        this.saldo += deposito;
        System.out.println("Nuevo saldo: "+getSaldo()+"€");

    }

    public void retirar(double retirada){

        System.out.println("Retiro: "+retirada+"€");
        this.saldo -= retirada;
        System.out.println("Nuevo saldo: "+getSaldo()+"€");

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
