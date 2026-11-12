package heranca;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, int ano, int cilindradas){
        super(placa, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
