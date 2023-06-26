package application;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static <Product> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();

        System.out.print("Olá bem vindo!!!\nQuantos produtos serão cadastrados? ");
        int quantidadeProdutos = scanner.nextInt();

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("Produto número " + i + ": ");

            System.out.print("O produto é: (1:comum / 2:usado / 3:importado), digite:(1, 2 ou 3): ");
            int tipoDoProduto = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Informe o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o preço do produto: ");
            Double preco = scanner.nextDouble();

            if (tipoDoProduto == 1) {
                lista.add(new Produto(nome, preco));
            } else if (tipoDoProduto == 3) {
                System.out.print("Informe a taxa da importação: ");
                Double taxa = scanner.nextDouble();
                lista.add(new ProdutoImportado(nome, preco, taxa));
            } else {
                System.out.print("Informe a data de fabricação do produto (DD/MM/YYYY): ");
                LocalDate dataFabricacao = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
            }
        }

        System.out.println();
        System.out.println("Etiquetas de Preços:");

        for (Produto prod : lista) {
            System.out.println(prod.etiquetaPreco());
        }

        scanner.close();
    }
}