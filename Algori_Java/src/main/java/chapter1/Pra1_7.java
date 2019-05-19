package chapter1;

import java.util.Scanner;

public class Pra1_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの話を求めます");
        System.out.print("nの値:");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            if (i == n) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
        }

        System.out.println( sum );
    }
}
