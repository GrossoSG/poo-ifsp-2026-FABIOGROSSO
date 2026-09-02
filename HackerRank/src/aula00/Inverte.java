package aula00;

public class Inverte {

    public static void main (String[]args) {

        int[] valores = {10, 20, 30, 40, 50};
        int[] invertidos = new int[5];

        for (int valor : valores) {
            System.out.println(valor);
        }
        for (int i = 0; i < valores.length; i++) {
            invertidos[i] = valores[valores.length - 1 - i];
        }

        for (int i = 0; i < valores.length; i++) {
            valores[i] = invertidos[i];
        }

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}

