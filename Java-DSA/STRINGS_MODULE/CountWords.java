import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int count = countWords(input);
        System.out.println(count);

        int counts = countWordsSplit(input);
        System.out.println(counts);
    }

    // using split
    public static int countWordsSplit(String input) {

        String arr[] = input.split(" ");

        return arr.length - 1 ;
    }

    // using for loop
    public static int countWords(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
}
