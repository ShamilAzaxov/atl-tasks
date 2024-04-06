package sh.tech.eolymp1;

import java.util.Scanner;

public class BiggestOfFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        for (int i = 0; i<4; i++){
            int number = in.nextInt();
            if (i == 0)
                max = number;
            if (number>max)
                max = number;
        }
        System.out.println(max);

    }
}
