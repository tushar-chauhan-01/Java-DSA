import java.util.Scanner;

public class NCR {

    public static int fact(int num){
        int prod = 1;
        for (int i = num ; i > 0 ; i--){
            prod = prod * i ; 
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if (n < 0 || r < 0 || r>n) {
            System.out.println("please enter n >= r >= 0");
            return;
        }

        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nr = fact(n-r);

        int ncr = fact_n / ( fact_r*fact_nr );

        System.out.println(ncr);
    }
}
