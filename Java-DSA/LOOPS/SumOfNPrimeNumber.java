import java.util.Scanner;

public class SumOfNPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int i , j, flag;

        for (i=2; i<=n; i++) {
            flag=1;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                System.out.println(i + " is a Prime Number");
                sum = i + sum;
            }
        }
        System.out.println(sum + " is sum of all prime numbers till " + n);

    }

}