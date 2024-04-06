package sh.tech.eolymp1;

import java.util.Scanner;

public class SquareSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        long result = 0;
        for (int i=1; i<=number; i++){
            result += (long) i*i;
        }
        System.out.println(result);
    }
}
