package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor digite quantos produtos serão " +
                "cadastrados: ");
        int n = scanner.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("Qual o produto? ");
            String name = scanner.nextLine();
            System.out.print("Qual o preço? ");
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double media = soma / vect.length;
        System.out.printf("Preço médio dos produtos = %.2f%n", media);

        scanner.close();
    }
}