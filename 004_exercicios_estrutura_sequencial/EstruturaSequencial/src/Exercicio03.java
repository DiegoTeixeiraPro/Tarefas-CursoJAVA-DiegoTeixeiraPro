import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais

public class Exercicio03 {
    public static void main(String[] args) {

        String funcionario;
        double salario;
        int horas;

        Scanner s = new Scanner(System.in);

        System.out.println("Programa - Salário Funcionário com Horas Extras");

        System.out.println("Olá, por favor informe o nome do funcionário");
        funcionario = s.nextLine();

        System.out.println("Digite o salário do funcionário:");
        salario = s.nextDouble();

        System.out.println("Quantas horas extras foram feitas:");
        horas = s.nextInt();

        double valorHoraExtras = (((salario / 220) * horas) * 1.5); // aqui acrescento 50% ref hora extra
        double valorReceber = salario + valorHoraExtras;

        System.out.println("O funcionário " + funcionario + " fez " + horas + " horas extras ");
        System.out.println("E deve receber o seu salário de " + salario + " mais " + valorHoraExtras + " de horas extras");
        System.out.printf("Totalizando %.2f ", valorReceber);

        s.close();
    }

}