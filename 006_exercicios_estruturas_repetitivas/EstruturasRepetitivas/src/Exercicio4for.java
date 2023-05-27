//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso

import java.util.Scanner;

public class Exercicio4for {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Por favor digite um valor: ");
        int x = s.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        s.close();
    }
}
