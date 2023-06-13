package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int quantFuncionarios = scanner.nextInt();

        for (int i = 0; i < quantFuncionarios; i++) {
            System.out.print("Qual o Id: ");
            int id = scanner.nextInt();
            System.out.print("Qual o nome: ");
            String name = scanner.next();
            System.out.print("Qual o salário: ");
            double salary = scanner.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Informe o id do funcionário(a) que terá reajuste: ");
        int pesquisaID = scanner.nextInt();

        Employee pesquisa = list.stream().filter(x -> x.getId() == pesquisaID).findFirst().orElse(null);
        if (pesquisa == null) {
            System.out.println("Este id não existe!!!");
        } else {
            System.out.print("Qual o percentual de reajuste? ");
            double percentage = scanner.nextDouble();
            pesquisa.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista dos funcionários:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        scanner.close();
    }
}