package sh.tech.eolymp1;

import java.util.Scanner;

public class InTheInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if (x>=a && x<=b)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
