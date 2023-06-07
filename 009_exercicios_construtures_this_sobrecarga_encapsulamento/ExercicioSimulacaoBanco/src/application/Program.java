package application;

import java.util.Scanner;

import entities.Account;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Nome do cliente: ");
        scanner.nextLine();
        String cliente = scanner.nextLine();

        System.out.print("Há depósito inicial (s/n)? ");
        char response = scanner.next().charAt(0);
        if (response == 's') {
            System.out.print("Qual o valor do depósito inicial?: ");
            double depositoInicial = scanner.nextDouble();
            account = new Account(conta, cliente, depositoInicial);
        } else {
            account = new Account(conta, cliente);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(account);

        System.out.println();

        System.out.print("Valor do depósito: ");
        double depositValue = scanner.nextDouble();
        account.deposito(depositValue);
        System.out.println("Dados da Conta:");
        System.out.println(account);

        System.out.println();

        System.out.print("Valor do saque: ");
        double retirada = scanner.nextDouble();
        account.retirada(retirada);
        System.out.println("Dados da conta:");
        System.out.println(account);

        scanner.close();
    }
}