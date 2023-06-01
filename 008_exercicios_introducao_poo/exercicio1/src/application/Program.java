package application;

/*
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
 */

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Por favor informe a largura: ");
        rectangle.width = s.nextDouble();

        System.out.print("Por favor informe a altura: ");
        rectangle.height = s.nextDouble();

        System.out.println();

        System.out.printf("Área = %.2f %n", rectangle.area());
        System.out.printf("Perímetro = %.2f %n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f %n", rectangle.diagonal());

        s.close();
    }
}
