/*Problem statement
Given a binary number as an integer N, convert it into decimal and print. */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0, lastDigit ;
        double n = 0;
        sc.close();

        while (x != 0) {
            lastDigit = x % 10;
            ans = lastDigit * (int) Math.pow(2, n) + ans;
            x = x / 10;
            n++;
        }

        System.out.println(ans);
    }
}
