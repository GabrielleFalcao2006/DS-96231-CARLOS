package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
    // String nome = "Marta";
    // int idade = 22;

    //PROGRAMAÇÃO ORIENTADA A OBJETO
    //Cliente cliente1 = new Cliente();
    // cliente1.nome = "Marta";
    // cliente1.idade = 22;

    //COM CONSTRUTOR
    Cliente c1 = new Cliente("Gabrielle", 19);

    Aluno aluno1 = new Aluno("Julia", "julia@gmail.com");
 
    //EMCAPSULAMENTO
    Pet pet1 = new Pet();
    pet1.setNome("Scóbi");
    pet1.setIdade(2);

    Pet2 p2 = new Pet2("Cuscuz", 1, "vira-lata", "médio", "Ração");

    Livro livro1 = new Livro("O Pequeno Principe", "gabi", 220, 22.30);    

    Funcionario f1 = new Funcionario();
    f1.setNome("Carlos");
    f1.setCargo("Professor");
    f1.setSalario(1650.00);

    //Veiculo veiculo1 = new Veiculo();

    System.out.println("CLIENTE");
    System.out.println("Nome:"+ c1.getNome());
    System.out.println("Idade: " + c1.getIdade());
    System.out.println("");

    System.out.println("PET");
    System.out.println("Nome: " + pet1.getNome());
    System.out.println("Idade: " + pet1.getIdade());
    System.out.println("");

    System.out.println("PET2");
    System.out.println("Nome: " + p2.getNome());
    System.out.println("Idade: " + p2.getIdade());
    System.out.println("Raça: " + p2.getRaca());
    System.out.println("Porte: " + p2.getPorte());
    System.out.println("Alimentação: " + p2.getAlimentacao());


    System.out.println("LIVRO");
    System.out.println("Titulo: " + livro1.getTitulo());
    System.out.println("Preço: " + livro1.getPreco());
    System.out.println("Autor: " + livro1.getAutor());
    System.out.println("Número de páginas: " + livro1.getNumero_pag());
    System.out.println("");

    System.out.println("FUNCIONÁRIO");
    System.out.println("Nome: " + f1.getNome());
    System.out.println("Cargo: " + f1.getCargo());
    System.out.println("Salário: " + f1.getSalario());
    System.out.println("");

    System.out.println("ALUNO");
    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Email: " + aluno1.getEmail());

    }
}
