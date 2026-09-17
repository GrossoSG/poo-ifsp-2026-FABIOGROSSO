package aula17_09;

public class Magica {

    public static boolean isQuadradoMagico(int[][] matriz){

        int M = (matriz.length * (matriz.length * matriz.length + 1)) / 2;
        int somaLinha = 0;
        int somaColuna = 0;
        int somaDiagonalP = 0;
        int somaDiagonalS = 0;


        for (int[] ints : matriz) {
            if (matriz.length != ints.length) {
                return false;
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
                if (i == j){
                    somaDiagonalP += matriz[i][j];
                }
                if(j != matriz.length-1){
                if(matriz[i][j] == matriz[i][matriz.length-1]){
                    return false;
                }
                }
            }
            if (somaLinha != M || somaColuna != M){
                return false;
        }
            somaLinha = 0;
            somaColuna = 0;
            somaDiagonalS += matriz[i][matriz.length - 1 - i];
        }

        if (somaDiagonalP != M || somaDiagonalS != M){
            return false;
        }

        return true;
    }
}
