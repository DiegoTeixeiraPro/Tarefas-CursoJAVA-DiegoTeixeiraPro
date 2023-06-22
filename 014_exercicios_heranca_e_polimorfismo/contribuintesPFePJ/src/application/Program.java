package application;

import entities.Contribuinte;
import entities.ContribuintePF;
import entities.ContribuintePJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Contribuinte> listaContribuintes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, Bem Vindo!!!\nQuantos contribuintes serão cadastrados: ");
        int c = scanner.nextInt();

        for (int i = 1; i <= c; i++) {
            System.out.println("\nContribuinte número " + i + ":");
            System.out.print("Contribuinte Pessoa Física ou Pessoa Jurídica, digite(f/j): ");
            char tipo = scanner.next().charAt(0);

            scanner.nextLine();
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Qual a renda anual: ");
            Double rendimentoAnual = scanner.nextDouble();

            if (tipo == 'f') {
                System.out.print("Informe os gastos com saúde (ou 0.00 se for o caso): ");
                Double gastosComSaude = scanner.nextDouble();
                listaContribuintes.add(new ContribuintePF(nome, rendimentoAnual, gastosComSaude));
            } else {
                System.out.print("Informe o número de funcionários: ");
                int numeroFuncionarios = scanner.nextInt();
                listaContribuintes.add(new ContribuintePJ(nome, rendimentoAnual, numeroFuncionarios));
            }
        }

        Double totalImposto = 0.0;
        System.out.println("\nImpostos Pagos:");
        for (Contribuinte contr : listaContribuintes) {
            Double taxa = contr.taxa();
            System.out.println(contr.getNome() + ": R$ " + String.format("%.2f", taxa));
            totalImposto += taxa;
        }

        System.out.println("\nTotal dos Impostos: R$ " + String.format("%.2f", totalImposto));
        scanner.close();
    }
}