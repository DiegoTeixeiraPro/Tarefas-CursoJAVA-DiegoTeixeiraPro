package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int num = scanner.nextInt();
        int[] vetor = new int[num];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.printf("%nNúmeros pares: ");
        int pares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                pares += 1;
            }
        }

        System.out.printf("%nQuantidade de pares: %d", pares);

        scanner.close();
    }
}