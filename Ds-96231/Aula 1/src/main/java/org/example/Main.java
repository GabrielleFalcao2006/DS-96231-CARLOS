package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        double prestacao = valorCompra / 5;

        System.out.println("Mercado: Loja Mamão com Açúcar");
        System.out.printf("Valor de cada prestação: R$ %.2f%n", prestacao);

        sc.close();
    }
}




