package sh.tech.eolymp1;

import java.util.Scanner;

public class SquareOfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int first = number/10;
        int second = number%10;
        System.out.println((first + second)*(first + second));
    }
}
