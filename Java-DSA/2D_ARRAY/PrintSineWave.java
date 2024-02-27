/*
Problem statement
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, 
i.e, print the first column top to bottom, next column bottom to top and so on.
 */
public class PrintSineWave {
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };
        System.out.println("Matrix");
        print(mat);
        System.out.println("Matrix Sine Wave");
        wavePrint(mat);
    }

    public static void print(int a[][]) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void wavePrint(int mat[][]) {
        int row = mat.length;
        if (row == 0)
            return; // Handle empty matrix
        int col = mat[0].length;
        if (col == 0)
            return;

        boolean moveup = false;

        for (int j = 0; j < col; j++) {
            int i = moveup ? row - 1 : 0;
            while (moveup ? i >= 0 : i < row) {
                System.out.print(mat[i][j] + " ");
                i = moveup ? i - 1 : i + 1;
            }
            moveup = !moveup;
        }
    }
}
