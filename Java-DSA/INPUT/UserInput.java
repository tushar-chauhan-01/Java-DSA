import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float totalMarks = 100f ;
        System.out.println("Total Marks -->");
        float totalMarks = sc.nextFloat();
        // int scored = 89 ;
        System.out.println("Scored -->");
        int scored = sc.nextInt();

        sc.close(); // close sc when you dont required it

        float percentage =  ( scored/totalMarks ) * 100 ;
        System.out.println("Percentage --> "+percentage);
    }
}
