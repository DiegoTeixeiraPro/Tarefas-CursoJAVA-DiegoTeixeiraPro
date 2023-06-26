//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível


import java.util.Scanner;

public class Exercicio2While {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Qual o seu combustível preferido?");
        System.out.println("1: Álcool, 2: Gasolina, 3: Diesel, 4: Sair");
        int entrada = s.nextInt();

        while (entrada <= 4) {
            if (entrada == 1) {
                alcool += 1;
                System.out.println("1: Álcool, 2: Gasolina, 3: Diesel, 4: Sair");
                entrada = s.nextInt();
            } else if (entrada == 2) {
                gasolina += 1;
                System.out.println("1: Álcool, 2: Gasolina, 3: Diesel, 4: Sair");
                entrada = s.nextInt();
            } else if (entrada == 3) {
                diesel += 1;
                System.out.println("1: Álcool, 2: Gasolina, 3: Diesel, 4: Sair");
                entrada = s.nextInt();
            } else if (entrada == 4) {
                System.out.println("Saindo");
                break;
            }

        }

        System.out.println("Muito Obrigado!!!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        s.close();
    }
}
