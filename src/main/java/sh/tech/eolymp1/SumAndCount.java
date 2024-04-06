package sh.tech.eolymp1;

import java.util.Scanner;

public class SumAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int count = 0;
        while (sc.hasNext()){
            int num = sc.nextInt();
            if (num == 0)
                break;
            result+=num;
            count++;
        }
        System.out.println(count + " " + result);
    }
}
