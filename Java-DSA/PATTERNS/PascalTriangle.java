import java.util.Scanner;
/*You are given an integer N. Your task is to print the pascal’s triangle till the row N.

A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. 
Pascal's triangle contains the values of the binomial coefficient. For example in the figure below. 

For example, given integer N= 4 then you have to print.

---1  
--1-1 
-1-2-1 
1-3-3-1

Here for the third row, you will see that the second element is the summation of the above two-row elements 
i.e. 2=1+1, and similarly for row three 3 = 1+2 and 3 = 1+2.
Refer notes for proper logic
*/
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0 ; i< n ; i++){
            for (int j =0 ; j<n-i-1 ; j++){
                System.out.print("-");
            }
            
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j+1);
            }

            System.out.println();
        }
    }
}
