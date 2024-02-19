import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        int start = 0, last = str.length() - 1;
        while (start < last) {
            if (str.charAt(start) != str.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

}
