package sh.tech.eolymp1;

import java.util.Scanner;

public class WhichOneIsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b == c)
            System.out.println(1);
        else if (a == b || b == c || a == c)
            System.out.println(2);
        else
            System.out.println(3);

    }
}
