package sh.tech.eolymp1;

import java.util.Scanner;
 class Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a % b == 0)
            System.out.println("Divisible");
        else
            System.out.println((a/b) + " " + (a%b));
    }
}
