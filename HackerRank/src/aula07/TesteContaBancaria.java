package aula07;

public class TesteContaBancaria {

    public static void main (String[] args){
        ContaBancaria feckt0n = new ContaBancaria("Feckt0n");
        ContaBancaria feckt0nprime = new ContaBancaria(feckt0n);
        ContaBancaria belline = new ContaBancaria("Beline", 10000, true);
        ContaBancaria laranjac = new ContaBancaria("Laranja", -10, true);

        feckt0nprime.isAtiva();
        feckt0nprime.depositar(1000);
        belline.depositar(10000);
        laranjac.depositar(-100);

        System.out.print(feckt0n.getSaldo());
        System.out.print(feckt0nprime.getSaldo());
        System.out.print(belline.getSaldo());
        System.out.print(laranjac.getSaldo());

    }
}
