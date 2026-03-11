package org.example.atv1;

public class Processador extends Super {

    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
}
