// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Exercicio1While {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int senha = 2002;

        System.out.println("Olá, por favor digite a senha:");
        int entrada = s.nextInt();

        while (senha != entrada) {
            System.out.println("Senha Inválida, favor digitar novamente");
            entrada = s.nextInt();
        }

        System.out.println("Acesso Permitido");

        s.close();
    }
}