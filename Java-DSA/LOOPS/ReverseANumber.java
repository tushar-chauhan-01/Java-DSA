import java.util.Scanner;

/*
 Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. For e.g., 
reverse of 10400 will be 401 instead of 00401.
 */

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trailing_zero = 1, i, n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.print(n);
        } else {

            while (n != 0) {
                if (n % 10 == 0 && trailing_zero == 1) {
                    n = n / 10;
                } else {
                    trailing_zero = 0;
                    i = n % 10;
                    System.out.print(i);
                    n = n / 10;
                }
            }
        }

    }
}
