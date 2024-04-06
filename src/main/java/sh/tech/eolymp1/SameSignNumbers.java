package sh.tech.eolymp1;

import java.util.Scanner;

public class SameSignNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if ((n<0 && m<0) || (n>0 && m>0))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
