package sh.tech.eolymp1;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int max = 0;
            int min = 30000;
            for(int i=0; i<num; i++){
                int kq = scan.nextInt();
                if (kq>max)
                    max = kq;
                if (min>kq)
                    min = kq;
            }
            if (num<2)
                System.out.println("Ooops!");
            else
                System.out.print(min + " " + max);
        }
}
