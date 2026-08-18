package aula02;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        System.out.println("================================");


        for(int i=0;i<3;i++){
            String s1=scan.next();
            int x=scan.nextInt();
            int espaco = s1.length();
            System.out.printf("%s", s1);
            for (int j = 15;j>espaco;j--){
                System.out.printf(" ");
            }
            System.out.printf("%03d\n", x);
        }
        scan.close();
        System.out.println("================================");
    }
}
