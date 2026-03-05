package Dowhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int avaliacao;
            do {
                System.out.println("Avalie nosso atendimento, 1 de 5 estrelas:");
                avaliacao = ler.nextInt();
            } while(avaliacao<1||avaliacao > 5);
                    System.out.println("Obrigado!");
    }
}
