package sh.tech.eolymp1;

import java.util.Scanner;

public class MonthsAndQuarters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number <4)
            System.out.println("First");
        else if (number<7)
            System.out.println("Second");
        else if (number<10)
            System.out.println("Third");
        else if (number<13)
            System.out.println("Fourth");
    }
}
