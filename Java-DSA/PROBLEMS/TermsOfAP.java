import java.util.Scanner;
/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
 */
public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ap = 1, sum;
        sc.close();

        while (n > 0) {
            sum = 3 * ap + 2;
            if ( sum % 4 != 0) {
                System.out.print(sum + " ");
                n = n - 1;
            }
            ap = ap + 1;
        }
    }
}
