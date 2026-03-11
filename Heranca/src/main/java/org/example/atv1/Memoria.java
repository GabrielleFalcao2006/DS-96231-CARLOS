package org.example.atv1;

public class Memoria extends Super{
    private String CapacidadeProcessador;

    public Memoria(String marca, String modelo, String capacidadeProcessador) {
        super(marca, modelo);
        CapacidadeProcessador = capacidadeProcessador;
    }

    public String getCapacidadeProcessador() {
        return CapacidadeProcessador;
    }

    public void setCapacidadeProcessador(String capacidadeProcessador) {
        CapacidadeProcessador = capacidadeProcessador;
    }
}
