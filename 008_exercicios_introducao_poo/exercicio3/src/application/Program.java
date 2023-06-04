package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Por favor, digite o nome do estudante: ");
        student.name = s.nextLine();

        System.out.print("Digite a primeira nota: ");
        student.nota1 = s.nextDouble();
        System.out.print("Digite a segunda nota: ");
        student.nota2 = s.nextDouble();
        System.out.print("Digite a terceira nota: ");
        student.nota3 = s.nextDouble();

        System.out.printf("Nota Final: %.2f%n", student.finalNota());
        if (student.finalNota() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("Faltou %.2f pontos%n", student.pontosFaltantes());
        } else {
            System.out.println("PASS");
        }
        s.close();
    }
}