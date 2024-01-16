import java.util.Scanner;
// Print n numbers in a fibonacci series
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // we already know firdt 2 numbers in a series. 0 and 1

        // 0, 1, 1, 2, 3, 5, 8, 13.......

        int temp_f, sum_b = 0, sum_f = 1;

        System.out.print(sum_b+" "+sum_f+" ");
        while( n-2 > 0 ) {
            temp_f = sum_f+sum_b;
            System.out.print(temp_f+" ");
            sum_b = sum_f;
            sum_f = temp_f;
            

            n=n-1;
        }

    }
}
