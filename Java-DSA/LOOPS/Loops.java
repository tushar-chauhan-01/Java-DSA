import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;

        // for loop
        for (i = 1; i <= 10; i++) {
            System.out.println("FOR LOOP " + n + " * " + i + " = " + (i * n));
        }

        // while loop
        int b = 1;
        while (b <= 10) {
            System.out.println("WHILE LOOP " + n + " * " + b + " = " + (b * n));
            b++;
        }

        // Guess the number , do while loop
        // while loop
        int c = 4;
        int g_num ;
        do {
            System.out.println("Guess a number --> ");

            g_num = sc.nextInt();
            if (g_num == c){
                System.out.println("You got it right !!!!!!!!!!");
            }
        } while (g_num != c);
        sc.close();
    }

}
