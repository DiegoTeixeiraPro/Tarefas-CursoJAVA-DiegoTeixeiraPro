/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

import java.util.Scanner;

public class Exercicio5for {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Quantos valores serão digitados?");
        int n = s.nextInt();

        int in = 0;
        int out = 0;

        System.out.println("Por favor informe os valores, um por vez e digite enter para cada um:");
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        s.close();
    }
}
