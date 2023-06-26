import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número:");
        int entrada = s.nextInt();

        if (entrada % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        s.close();
    }
}