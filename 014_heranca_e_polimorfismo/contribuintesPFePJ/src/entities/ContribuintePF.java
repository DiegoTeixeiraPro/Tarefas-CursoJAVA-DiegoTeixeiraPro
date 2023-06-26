package entities;

public class ContribuintePF extends Contribuinte{
    private Double gastosComSaude;

    public ContribuintePF(String nome, Double rendimentoAnual, Double gastosComSaude) {
        super(nome, rendimentoAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double taxa() {
        if (getRendimentoAnual() < 20.000) {
            return (getRendimentoAnual() * 0.15) - (getGastosComSaude() * 0.5);
        } else {
            return (getRendimentoAnual() * 0.25) - (getGastosComSaude() * 0.5);
        }
    }
}