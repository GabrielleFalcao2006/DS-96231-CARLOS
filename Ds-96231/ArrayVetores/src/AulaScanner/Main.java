package AulaScanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma = 0;



        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota:");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("Média:" + media);

        ler.close();


    }
}
