package aula17_09;
import java.math.*;

public class Estatistica {

    public static double media(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    public static double variancia(double[] valores) {

        double media = media(valores);
        double soma = 0;

        for (double valor : valores) {
            valor = Math.pow((valor - media), 2);
            soma += valor;
        }

        return soma / (valores.length - 1);
    }

    public static double desvioPadrao(double[] valores){
        return Math.sqrt(variancia(valores));
    }

}
