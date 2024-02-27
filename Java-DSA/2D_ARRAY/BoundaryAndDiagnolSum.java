/*
 Problem statement
For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the 
diagonals and at all the four boundaries.

Sample input:
1 2 3
4 5 6
7 8 9
Sample Output:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. 
For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to
 both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
 */
public class BoundaryAndDiagnolSum {
    public static void main(String[] args) {
        // square matrix only
        int mat[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };
        print(mat);
        sumOfDiagAndBoundary(mat);
    }

    public static void print(int a[][]) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfDiagAndBoundary(int a[][]) {

        if (a.length == 0 || a[0].length == 0) {
            System.out.println("Boundary sum is 0"); // Handle empty matrix
            return;
        }

        // Sum of boundary elements
        int b_sum = 0;
        for (int j = 0; j < a[0].length; j++) {
            b_sum = b_sum + a[0][j];
            if (a.length > 1) {
                b_sum = b_sum + a[a.length - 1][j];
            }
        }

        for (int i = 1; i < a.length - 1; i++) {
            b_sum = b_sum + a[i][0];
            if (a[0].length > 1) {
                b_sum = b_sum + a[i][a[0].length - 1];
            }
        }
        System.out.println("Boundary sum is " + b_sum);

        // sum of diagnols
        int d_sum = 0;
        int diag_len = a[0].length - 2;
        if (a.length > 2 && a[0].length > 2) {
            for (int i = 1; i < a.length - 1; i++) {
                d_sum = d_sum + a[i][i];
                if (i != diag_len) {
                    d_sum = d_sum + a[i][diag_len];
                }
                diag_len--;
            }
        }
        System.out.println("Diagnol sum is " + d_sum);

        System.out.println("Total is - " + (d_sum + b_sum));

    }
}
