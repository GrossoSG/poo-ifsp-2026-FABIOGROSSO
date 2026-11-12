package abstrata;

public class Main {
    public static void main(String[] args) {
        Conta[] contas = {
                new ContaCorrente("Ana", 500),
                new ContaPoupanca("Bruno", 1500),
                new ContaPoupanca("Carla", 200),
        };

        for (Conta c : contas){
            c.cobrarTarifa();
            c.exibirSaldo();
        }
    }
}
