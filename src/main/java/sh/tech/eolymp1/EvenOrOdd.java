package sh.tech.eolymp1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number%2 == 1)
            System.out.println("ODD");
        else
            System.out.println("EVEN");
    }
}
