package aula02;

import java.util.*;
import java.io.*;
import java.math.*;

class Loops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int resultado;

            for (int j = 0; j < n; j++) {
                resultado = a;
                for (int k = 0; k <= j; k++){
                    int potencia = (int) Math.pow(2, k);
                    resultado += (potencia * b);
                }
                System.out.printf("%d ", resultado);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
