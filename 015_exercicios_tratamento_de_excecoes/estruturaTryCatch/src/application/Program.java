package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite os nomes apenas separando por espaço: ");
            String[] vect = scanner.nextLine().split(" ");
            System.out.print("Qual possição deseja acessar? ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Possição inválida!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada!");
        }

        System.out.println("Fim do programa");
        scanner.close();
    }
}