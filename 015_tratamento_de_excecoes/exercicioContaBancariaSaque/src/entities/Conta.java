package entities;

import exceptions.ExcecaoComercial;

public class Conta {
    Integer numeroConta;
    String clienteConta;
    Double saldoConta;
    Double saqueLimite;


    public Conta(Integer numeroConta, String clienteConta, Double saldoConta, Double saqueLimite) {
        this.numeroConta = numeroConta;
        this.clienteConta = clienteConta;
        this.saldoConta = saldoConta;
        this.saqueLimite = saqueLimite;
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getClienteConta() {
        return clienteConta;
    }

    public void setClienteConta(String clienteConta) {
        this.clienteConta = clienteConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Double getSaqueLimite() {
        return saqueLimite;
    }

    public void setSaqueLimite(Double saqueLimite) {
        this.saqueLimite = saqueLimite;
    }


    public void deposito(Double quantia) {
        saldoConta += quantia;
    }

    public void saque(Double quantia) {
        validacaoSaque(quantia);
        saldoConta -= quantia;
    }


    private void validacaoSaque(double quantia) {
        if (quantia > getSaqueLimite()) {
            throw new ExcecaoComercial("Saque não autorizado: A quantia excede o limite de saque!!!");
        }
        if (quantia > getSaldoConta()) {
            throw new ExcecaoComercial("Saque não autorizado: Saldo insuficiente!!!");
        }
    }
}