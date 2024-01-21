/*
print an X-shaped pattern.
Example : Pattern for N = 3 (No. of rows = 5, No. of columns = 5) :

1---1
-2-2
--3
-2-2
1---1

for each n we are printing 2n-1 rowns
 */

import java.util.Scanner;

public class X_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i, j;
        int value = 1;

        // We are running two for loops. The outer one for each row and the inner one
        // for each column.
        for (i = 0; i <= 2 * (n - 1); i++) {
            for (j = 0; j <= 2 * (n - 1); j++) {

                // Check if current row count is equal to current column count. Or if (current
                // column count + row count) is (size - 1).
                if (i == j || (i + j) == 2 * (n - 1)) {
                    System.out.print(value);

                } else {
                    System.out.print(" ");

                }
            }

            // For the remaining values
            if (i < n - 1) {
                value++;
            } else {
                value--;
            }
            System.out.println();

        }

    }
}
