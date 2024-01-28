import java.util.Scanner;
/*
Note :
A composite number is a positive integer that has at least one positive divisor other than one or itself. In other words, 
a composite number is any positive integer greater than one that is not a prime number.

Input:
The function takes an integer n as input, which represents the upper limit of the range to check for composite numbers.

Output:
The function should print composite numbers found within the range from 2 to n (inclusive),
 */
public class CompositeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_composite(n);
        sc.close();
    }

    public static void print_composite(int n) {
        for (int i = 2; i <= n; i++) {
            int counter = 0;
            for (int j = i; j >= 2; j--) {
                if (i % j == 0 && i != j) {
                    counter = counter + 1;
                }
            }
            if (counter > 0) {
                System.out.println(i);
            }

        }
    }

}
