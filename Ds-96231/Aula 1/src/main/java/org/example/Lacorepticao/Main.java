package org.example.Lacorepticao;

import javax.sound.midi.InvalidMidiDataException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner("Digite sua idade");
        int idade = ler.nextInt();

        while(idade < 18){
            System.out.println("Acesso negado");
            System.out.println("Digite sua idade");
            idade = ler.nextInt();

        }
        System.out.println("Acesso permitido");
        System.out.println("Carregando...");
    }

}
