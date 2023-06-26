package entities;

public final class ContaPoupanca extends Conta {

    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }


    public void atualizarSaldo() {
        saldo += saldo * taxaJuros;
    }

    @Override
    // Aqui estou falando que esse método foi alterado em relação à Classe Conta. Ou seja, mesmo que seja uma herança (extends da Conta) estou declarando que esse método é diferente do método da classe Conta.
    public void saque(Double quantia) {
        saldo -= quantia;
    }

}