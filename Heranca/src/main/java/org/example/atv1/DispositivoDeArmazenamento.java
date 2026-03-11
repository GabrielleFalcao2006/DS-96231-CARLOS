package org.example.atv1;

public class DispositivoDeArmazenamento extends Super {
    private String capacidadeArmazenamento;
    private String TipoConexao;

    public DispositivoDeArmazenamento(String marca, String modelo, String capacidadeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        TipoConexao = tipoConexao;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoConexao() {
        return TipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        TipoConexao = tipoConexao;
    }
}
