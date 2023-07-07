package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.print("Insira o caminho completo do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)) {
                    int votesSoFar = votos.get(name);
                    votos.put(name, count + votesSoFar);
                } else {
                    votos.put(name, count);
                }
                line = br.readLine();
            }

            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}