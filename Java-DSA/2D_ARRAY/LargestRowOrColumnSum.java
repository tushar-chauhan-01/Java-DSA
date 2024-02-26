/*
 Problem statement
For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column 
has the largest sum(sum of all the elements in a row or column) amongst all the rows/columns.

Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if 
ith row and jth column has the same largest sum, consider the ith row as answer.
 */

import java.util.Scanner;

public class LargestRowOrColumnSum {
    public static void main(String[] args) {

        int matrix[][] = input();
        print(matrix);
        findLargest(matrix);
    }

    public static int[][] input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows ->");
        int row = sc.nextInt();
        System.out.println("Enter columns ->");
        int columns = sc.nextInt();

        int arr[][] = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter " + j + " element in row " + i + " --> ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();
        return arr;
    }

    public static void print(int a[][]) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void findLargest(int mat[][]) {
        int rows = mat.length;

        int cols = 0;
        if (rows > 0) {
            cols = mat[0].length;
        }

        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIdx = -1;

        int maxColSum = Integer.MIN_VALUE;
        int maxColIdx = -1;

        if (rows == 0 || cols == 0) {
            System.out.println("row 0 " + maxRowSum);
            return;
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIdx = i;
            }
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += mat[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIdx = j;
            }
        }

        if (maxRowSum >= maxColSum) {
            System.out.println("row " + maxRowIdx + " " + maxRowSum);
        } else {
            System.out.println("column " + maxColIdx + " " + maxColSum);
        }
    }
}
