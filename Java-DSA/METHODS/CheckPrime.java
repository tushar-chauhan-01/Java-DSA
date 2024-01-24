import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printPrime(n);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int lim) {
        for (int i = 2; i <= lim; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

}
