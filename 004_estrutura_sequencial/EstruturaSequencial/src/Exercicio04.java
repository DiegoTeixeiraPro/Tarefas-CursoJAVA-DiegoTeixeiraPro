import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Cadastro "o ideal era ser separado, mas o exercício não solicita"
        System.out.println("Qual o código do produto 1 a ser cadastrado?");
        int codigoPeca1 = s.nextInt();
        System.out.println("Qual o valor do produto 1 a ser cadastrado?");
        double valorPeca1 = s.nextInt();

        System.out.println("Qual o código do produto 2 a ser cadastrado?");
        int codigoPeca2 = s.nextInt();
        System.out.println("Qual o valor do produto 2 a ser cadastrado?");
        double valorPeca2 = s.nextInt();


        // Frente de Caixa
        System.out.println("Quantas unidades do produto 1 está sendo vendido?");
        int quantidadeVendidaProd1 = s.nextInt();

        System.out.println("Quantas unidades do produto 2 está sendo vendido?");
        int quantidadeVendidaProd2 = s.nextInt();

        //Venda
        System.out.println("Prod código: " + codigoPeca1 + "     Quantidade: " + quantidadeVendidaProd1);
        System.out.println("Prod código: " + codigoPeca2 + "     Quantidade: " + quantidadeVendidaProd2);

        double valorTotalVenda = (quantidadeVendidaProd1 * valorPeca1) + (quantidadeVendidaProd2 * valorPeca2);

        System.out.printf("Valor total da venda é de %.2f", valorTotalVenda );

        s.close();
    }

}