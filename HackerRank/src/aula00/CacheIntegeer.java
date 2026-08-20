package aula00;

public class CacheIntegeer {
    public static void main(String[] args){
        // Par 1: dois valores IGUAIS dentro da faixa -128 a 127 (ex.: 100 e 100)
        Integer x1 = 128;
        Integer x2 = 125;
        System.out.println("Par dentro da faixa (== ): " + (x1 == x2));
        System.out.println("Par dentro da faixa (.equals()): "+ x1.equals(x2));

        // Par 2: dois valores IGUAIS fora da faixa -128 a 127 (ex.: 200 e 200)

        Integer y1 = 300;
        Integer y2 = 300;
        System.out.println("Par dentro da faixa (== ): "+ (y1 == y2));
        System.out.println("Par dentro da faixa (.equals()): "+ y1.equals(y2));
    }
}
