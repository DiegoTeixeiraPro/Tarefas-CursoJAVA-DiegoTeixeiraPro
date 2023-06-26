import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Programa - Soma");
        System.out.println("Olá, por favor digite o primeiro número:");
        int valor1 = s.nextInt();

        System.out.println("Agora digite o segundo número:");
        int valor2 = s.nextInt();

        System.out.println("Valores digitados:");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        System.out.println("A soma dos dois valores é: " + (valor1 + valor2));

        s.close();
    }

}
