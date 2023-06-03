package application;

/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.
 */

import entities.Employee;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Informe o nome do funcionário: ");
        employee.name = s.nextLine();

        System.out.print("Informe o salário: ");
        employee.grossSalary = s.nextDouble();

        System.out.print("Informe o imposto: ");
        employee.tax = s.nextDouble();

        System.out.println("Funcionário(a) " + employee.name + " recebe " + "R$ " + employee.netSalary());

        System.out.print("Qual o percentual que deseja aumentar o salário bruto? ");
        double percentage = s.nextDouble();
        employee.increaseSalary(percentage);

        System.out.print("Salário Atualizado: " + employee);

        s.close();
    }
}
