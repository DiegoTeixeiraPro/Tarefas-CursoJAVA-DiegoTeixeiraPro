import java.util.Scanner;

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int entrada1 = s.nextInt();
        System.out.println("Informe o segundo número:");
        int entrada2 = s.nextInt();

        if (entrada1 % entrada2 == 0 || entrada2 % entrada1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        s.close();
    }
}