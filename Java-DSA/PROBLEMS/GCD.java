import java.util.Scanner;

public class GCD {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();   
        sc.close();
        System.out.println(findGCD(num1, num2));
    }
    public static int findGCD(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }// second number must be greater than first one no matter the order of input

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;

    }

}
