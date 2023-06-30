package application;

import entities.Contract;
import entities.Parcela;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Olá bem vindo!!!");
        System.out.println("Por favor informe os dados do contrato");
        System.out.print("Número do contrato: ");
        int numero = scanner.nextInt();
        System.out.print("Data do contrato (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scanner.next(), dataFormatada);
        System.out.print("Qual o valor do contrato? ");
        Double valorContrato = scanner.nextDouble();

        Contract contrato = new Contract(numero, data, valorContrato);
        System.out.print("Quantas parcelas: ");
        int quantidadeDeParcelas = scanner.nextInt();


        ContractService contractService = new ContractService(new PaypalService());
        contractService.contratoProcessado(contrato, quantidadeDeParcelas);

        System.out.println("\nParcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela);
        }

        scanner.close();
    }
}