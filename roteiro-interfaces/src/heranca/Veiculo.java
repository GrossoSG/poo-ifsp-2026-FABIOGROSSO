package heranca;

public class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Placa: " + placa + " | Ano: " + ano);
    }
}
