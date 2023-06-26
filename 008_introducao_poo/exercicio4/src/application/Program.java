package application;

import java.util.Scanner;

import static util.CurrencyConverter.valorTotal;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a cotação do dólar? ");
        double cotacao = scanner.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double dollares = scanner.nextDouble();

        System.out.print("Valor a ser pago em reais, já com o IOF: R$ ");
        System.out.print(valorTotal(cotacao, dollares));

        scanner.close();
    }

}
