package entities;

public final class ContaPJ extends Conta {
    private Double limiteEmprestimo;

    public ContaPJ() {
        super();
    }

    public ContaPJ(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double quantia) {
        if (quantia <= limiteEmprestimo) {
            saldo += quantia - 10.0;
        }
    }

    @Override
    public void saque(Double quantia) {
        super.saque(quantia);
        saldo -= 2.0;
    }

}
