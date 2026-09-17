package aula17_09;

public class TesteMagica {

    public static void main (String[] args){

        int[][] matriz = {
                {4, 8, 3},
                {4, 5, 6},
                {7, 2, 6}
        };

        System.out.println(Magica.isQuadradoMagico(matriz));

    }
}
