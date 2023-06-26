package application;

import entities.Conta;
import exceptions.ExcecaoComercial;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os dados da conta:");
        System.out.print("Número da conta: ");
        Integer numeroConta = scanner.nextInt();

        System.out.print("Nome do cliente: ");
        scanner.nextLine();
        String clienteConta = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        Double saldoConta = scanner.nextDouble();

        System.out.print("Limite de saque: ");
        Double saqueLimite = scanner.nextDouble();

        Conta contaTeste = new Conta(numeroConta, clienteConta, saldoConta, saqueLimite);

        System.out.print("\nInforme a quantia para saque: ");
        Double quantia = scanner.nextDouble();

        try {
            contaTeste.saque(quantia);
            System.out.println("\nSaldo Atual: R$ " + contaTeste.getSaldoConta());
        } catch (ExcecaoComercial e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}