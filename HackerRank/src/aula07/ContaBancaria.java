package aula07;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String titular, double saldo, boolean ativa){
        this.titular = titular;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    public ContaBancaria(String titular){
        this(titular, 0, true);
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean isAtiva(){
        return true;
    }

    public void depositar(double valor){
        if (isAtiva() && valor > 0){
            this.saldo += valor;
        }
    }

    public ContaBancaria(ContaBancaria outra) {
        this.titular = outra.titular;
        this.saldo = outra.saldo;
        this.ativa = outra.ativa;
    }
}
