package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int numeros = scanner.nextInt();

        double[] vetor = new double[numeros];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println();
        System.out.print("Valores Digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }

        System.out.println();
        System.out.print("Soma: ");
        double x = 0;
        for (int i = 0; i < vetor.length; i++) {
            x += vetor[i];
        }

        System.out.print(x);
        System.out.println();
        System.out.print("Média: ");
        System.out.println(x / vetor.length);

        scanner.close();
    }
}
