package Application;

import java.util.Scanner;

/*
Faça um programa que leia um número inteiro positivo N e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */
public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número: ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }
        scanner.close();
    }
}
