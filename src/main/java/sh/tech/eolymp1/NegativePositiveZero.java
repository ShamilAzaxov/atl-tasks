package sh.tech.eolymp1;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >0)
            System.out.println("Positive");
        else if (number <0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
