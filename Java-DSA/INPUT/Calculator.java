import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number -->");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number -->");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number -->");
        int c = sc.nextInt();

        int avg = (a+b+c) / 3 ;
        System.out.println(avg);
    }
}
