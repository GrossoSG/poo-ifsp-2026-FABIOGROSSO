package aula03;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 1 && n <= 100){

            if(n % 2 != 0){
                System.out.println("Weird");
            }
            else{
                if(n >= 6 && n <=20){
                    System.out.println("Weird");
                }
                else{
                    System.out.println("Not Weird");
                }
            }

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            scanner.close();
        }
    }
}

