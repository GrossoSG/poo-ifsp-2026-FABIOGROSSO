package aula00;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer fatorial = 1;
        for (Integer i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
}
