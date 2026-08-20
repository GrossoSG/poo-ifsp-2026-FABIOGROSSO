package aula03;

import java.util.*;

public class EndofFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;

        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            System.out.println(i + " " + s);
            i++;

        }
        scan.close();
    }
}
