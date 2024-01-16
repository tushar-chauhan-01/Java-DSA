import java.util.Scanner;

/*Problem statement
Write a program that takes a number as input and prints all its factors except 1 and the number itself.
If the number has only two factors (1 and the number itself), then the program should print -1. 
*/
public class Factors {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int count = 1, n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count = 0;
                System.out.print(i + " ");
            }
        }
        if (count == 1) {
            System.out.print(-1);
        }
    }

}