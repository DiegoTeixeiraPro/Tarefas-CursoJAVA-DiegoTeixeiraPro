import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número");
        int entrada = s.nextInt();

        if (entrada >= 0) {
            System.out.println("Não Negativo");
        } else {
            System.out.println("Negativo");
        }

        s.close();
    }
}