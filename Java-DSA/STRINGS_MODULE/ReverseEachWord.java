import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String s) {

        if (s.length() == 0) {
            return s;
        }
        String arr[] = s.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                output.append(arr[i].charAt(j));
                
            }
            if (i < arr.length - 1) {
                output.append(" ");
            }
        }

        return output.toString();
    }
}
