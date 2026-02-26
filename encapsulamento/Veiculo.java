package com.example.encapsulamento;

public class Veiculo {
    private String placa;
    private String cor;
    private int numero_pass;
    private double cap_tanque;
    private double velocidade_max;
    private double cons_med;
    
    public Veiculo(String placa, String cor, int numero_pass, double cap_tanque, double velocidade_max,
            double cons_med) {
        this.placa = placa;
        this.cor = cor;
        this.numero_pass = numero_pass;
        this.cap_tanque = cap_tanque;
        this.velocidade_max = velocidade_max;
        this.cons_med = cons_med;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumero_pass() {
        return numero_pass;
    }

    public void setNumero_pass(int numero_pass) {
        this.numero_pass = numero_pass;
    }

    public double getCap_tanque() {
        return cap_tanque;
    }

    public void setCap_tanque(double cap_tanque) {
        this.cap_tanque = cap_tanque;
    }

    public double getVelocidade_max() {
        return velocidade_max;
    }

    public void setVelocidade_max(double velocidade_max) {
        this.velocidade_max = velocidade_max;
    }

    public double getCons_med() {
        return cons_med;
    }

    public void setCons_med(double cons_med) {
        this.cons_med = cons_med;
    }

}
