import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        System.out.println(reverse(input));

    }

    public static String reverse(String input) {
        String str = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            str = str + input.charAt(i);
        }

        return str;
    }

}
