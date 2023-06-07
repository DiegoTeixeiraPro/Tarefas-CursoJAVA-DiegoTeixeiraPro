package entities;

public class Account {

    private int conta;
    private String cliente;
    private double saldo;

    public Account(int conta, String cliente) {
        this.conta = conta;
        this.cliente = cliente;
    }

    public Account(int conta, String cliente, double depositoInicial) {
        this.conta = conta;
        this.cliente = cliente;
        deposito(depositoInicial);
    }

    public int getConta() {
        return conta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double montante) {
        saldo += montante;
    }

    public void retirada(double montante) {
        saldo -= montante + 5.0;
    }

    public String toString() {
        return "Conta: " + conta + ", Cliente: " + cliente + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}