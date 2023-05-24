import java.util.Scanner;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class Exercicio02 {
    public static void main(String[] args) {

        int a, b, c, d, dif;

        Scanner s = new Scanner(System.in);

        System.out.println("Programa - Diferença");

        System.out.println("Olá, por favor digite o primeiro número:");
        a = s.nextInt();

        System.out.println("Digite o segundo número:");
        b = s.nextInt();

        System.out.println("Digite o terceiro número:");
        c = s.nextInt();

        System.out.println("Digite o quarto número:");
        d = s.nextInt();

        dif = a * b - c * d;

        System.out.println("A diferença é de: " + dif);

        s.close();
    }

}
