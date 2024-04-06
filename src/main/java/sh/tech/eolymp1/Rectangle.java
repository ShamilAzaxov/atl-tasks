package sh.tech.eolymp1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum =0;
        if (n>=1 && n<=1000000){
            for (int i = 1; i <=n; i++) {
                sum+=i*i;
            }
            System.out.println(sum);
        }
    }
}
