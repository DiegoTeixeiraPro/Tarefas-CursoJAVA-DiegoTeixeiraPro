package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int elementos = scanner.nextInt();

        double[] vetor = new double[elementos];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;
        System.out.println("Média do Vetor: " + media);

        System.out.println("Elementos Abaixo da Média:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f %n", vetor[i]);
            }
        }
        scanner.close();
    }
}