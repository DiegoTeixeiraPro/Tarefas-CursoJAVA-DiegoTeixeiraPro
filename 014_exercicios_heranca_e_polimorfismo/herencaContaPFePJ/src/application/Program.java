package application;

import entities.Conta;
import entities.ContaPJ;
import entities.ContaPoupanca;

public class Program {
    public static void main(String[] args) {

        Conta conta001 = new Conta(1001, "Alex", 1000.0);
        conta001.saque(200.0);
        System.out.println(conta001.getSaldo());

        Conta conta002 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        conta002.saque(200.0);
        System.out.println(conta002.getSaldo());

        Conta conta003 = new ContaPJ(1003, "Bob", 1000.0, 500.0);
        conta003.saque(200.0);
        System.out.println(conta003.getSaldo());
    }
}