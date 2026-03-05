package com.example.Atividade3;

public class Conta_banco {
    private String banco;
    private String agencia;
    private String n_conta;
    private String saldo_atual;
    private String lim_d;
    private String cd_fun;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getN_conta() {
        return n_conta;
    }

    public void setN_conta(String n_conta) {
        this.n_conta = n_conta;
    }

    public String getSaldo_atual() {
        return saldo_atual;
    }

    public void setSaldo_atual(String saldo_atual) {
        this.saldo_atual = saldo_atual;
    }

    public String getLim_d() {
        return lim_d;
    }

    public void setLim_d(String lim_d) {
        this.lim_d = lim_d;
    }

    public String getCd_fun() {
        return cd_fun;
    }

    public void setCd_fun(String cd_fun) {
        this.cd_fun = cd_fun;
    }




    public Conta_banco(String banco, String agencia, String n_conta, String saldo_atual, String lim_d, String cd_fun) {
        this.banco = banco;
        this.agencia = agencia;
        this.n_conta = n_conta;
        this.saldo_atual = saldo_atual;
        this.lim_d = lim_d;
        this.cd_fun = cd_fun;
    }




}
