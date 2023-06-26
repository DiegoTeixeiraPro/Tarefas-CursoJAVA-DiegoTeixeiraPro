import java.util.Scanner;

public class Exercicio3While {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Por favor digite o código do combustível desejado:");
        System.out.println("1: Álcool, 2: Gasolina, 3: Diesel, 4: Cancelar o Abastecimento");
        int entrada = s.nextInt();


        while (entrada != 4) {
            if (entrada == 1) {
                System.out.println("Alcool - Obrigado");
                break;
            } else if (entrada == 2) {
                System.out.println("Gasolina - Obrigado");
                break;
            } else if (entrada == 3) {
                System.out.println("Diesel - Obrigado");
                break;
            } else if (entrada == 4) {
                System.out.println("Abastecimento Cancelado - Obrigado");
                break;
            } else if (entrada != 4) {
                System.out.println("Opção inválida");
                System.out.println("1: Álcool, 2: Gasolina, 3: Diesel, 4: Cancelar o Abastecimento");
                entrada = s.nextInt();
            }
        }

        s.close();
    }
}
