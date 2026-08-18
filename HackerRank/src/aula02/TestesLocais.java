package aula02;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class TestesLocais {

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
