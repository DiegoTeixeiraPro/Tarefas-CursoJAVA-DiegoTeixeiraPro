import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

CODIGO      ESPECIFICACAO       PREÇO
1           Cachorro quente     4,00
2           X-Salada            4,50
3           X-Bacon             5,00
4           Torrada simples     2,00
5           Refrigerante        1,50
*/

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Bem Vindo ao Mercadinho do Bairro");
        System.out.println("Por favor digite o código do item");
        int codigo = s.nextInt();

        System.out.println("Quantas unidades?");
        int quantidade = s.nextInt();

        double total;

        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("O Total da compra foi de: R$ %.2f%n", total);

        s.close();
    }
}