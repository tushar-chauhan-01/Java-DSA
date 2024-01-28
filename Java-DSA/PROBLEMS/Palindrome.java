import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(palindromeNumber(num));
    }

    public static boolean palindromeNumber(int n) {

        int rev = 0, last_digit, num = n;

        while (num != 0) {
            last_digit = num % 10;
            rev = rev * 10 + last_digit;
            num = num / 10;
        }
        if (rev == n) {
            return true;
        }
        return false;
    }
}
