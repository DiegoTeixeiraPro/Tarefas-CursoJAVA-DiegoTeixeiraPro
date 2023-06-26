package entities;

public class ContribuintePJ extends Contribuinte {
    private Integer numeroFuncionarios;

    public ContribuintePJ(String nome, Double rendimentoAnual, int numeroFuncionarios) {
        super(nome, rendimentoAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double taxa() {
        if (numeroFuncionarios <= 10) {
            return getRendimentoAnual() * 0.16;
        } else {
            return getRendimentoAnual() * 0.14;
        }
    }
}