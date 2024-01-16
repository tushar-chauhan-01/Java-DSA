/*Problem statement
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1

 */

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int ans=1 ;

        while (n>0) {
            ans = ans *x;
            n=n-1;
        }

        System.out.println(ans);
    }
}
