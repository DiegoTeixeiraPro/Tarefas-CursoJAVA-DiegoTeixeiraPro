import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Que horas o jogo iniciou?");
        int entrada1 = s.nextInt();
        System.out.println("Que horas terminou o jogo?");
        int entrada2 = s.nextInt();

        int duracaoJogo = entrada2 - entrada1;

        if (duracaoJogo == 0 || duracaoJogo < 0) {
            duracaoJogo += 24;
        }

        System.out.println("O jogo durou: " + duracaoJogo + " horas ");

        s.close();
    }
}