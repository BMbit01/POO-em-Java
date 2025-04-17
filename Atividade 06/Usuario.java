package Atividades.Atividade_06;

public class Usuario {
    private String nome;
    private int numConta;
    private String agencia;
    private double saldo;

    public Usuario(String nome, int numConta, String agencia, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

