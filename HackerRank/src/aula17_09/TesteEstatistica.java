package aula17_09;

public class TesteEstatistica {
    public static void main (String[] args){

        double[] array = {5, 8, 10, 7};

        double media = Estatistica.media(array);
        double variancia = Estatistica.variancia(array);
        double desvioPadrao = Estatistica.desvioPadrao(array);

        System.out.println(media);
        System.out.println(variancia);
        System.out.println(desvioPadrao);

    }
}
