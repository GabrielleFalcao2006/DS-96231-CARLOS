package org.example.exercicio2;

public class Main {
    public static void main(String[] args) {

        String aluno = "Stephanie";
        double n1 = 9.9;
        double n2 = 6.5;

        double media = (n1+n2)/2;

        if (media<7){
            System.out.println (aluno + " você foi reprovado(a)!. Sua média foi: " + media);
        }else{
            System.out.println (aluno + " sua média foi: " + media);
        }


    }
}
