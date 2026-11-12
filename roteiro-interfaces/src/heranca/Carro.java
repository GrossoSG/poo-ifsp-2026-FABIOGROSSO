package heranca;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String placa, int ano, int portas){
        super(placa, ano);
        this.portas = portas;
    }

    public int getPortas(){
        return portas;
    }
}
