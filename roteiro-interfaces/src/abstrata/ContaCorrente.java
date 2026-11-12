package abstrata;

public class ContaCorrente extends Conta {
    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public double calcularTarifaMensal(){
        return 15.0;
    }
}
