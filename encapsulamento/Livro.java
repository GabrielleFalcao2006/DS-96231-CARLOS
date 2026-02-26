package com.example.encapsulamento;

public class Livro {
  String titulo;
  String autor;
  int numero_pag;
  double preco;
  
  public Livro(String titulo, String autor, int numero_pag, double preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.numero_pag = numero_pag;
    this.preco = preco;
  }
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getAutor() {
    return autor;
  }
  public void setAutor(String autor) {
    this.autor = autor;
  }
  public int getNumero_pag() {
    return numero_pag;
  }
  public void setNumero_pag(int numero_pag) {
    this.numero_pag = numero_pag;
  }
  public double getPreco() {
    return preco;
  }
  public void setPreco(double preco) {
    this.preco = preco;
  }
  
}
