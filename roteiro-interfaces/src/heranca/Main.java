package heranca;

public class Main {
    public static void main (String[] args){
        Carro carro = new Carro("ABC-1234", 2020, 4);
        Moto moto = new Moto("XYZ-9876", 2022, 300);

        carro.exibirDados();
        System.out.println("Portas: " + carro.getPortas());
        moto.exibirDados();
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
