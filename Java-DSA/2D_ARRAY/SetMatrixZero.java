/*
 Problem statement
Given an ‘N’ x ‘M’ integer matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
 In particular, your task is to modify it in such a way that if a cell has a value 0 (matrix[i][j] == 0), then 
 all the cells of the ith row and jth column should be changed to 0.

You must do it in place.

For Example:

If the given grid is this:
[7, 19, 3]
[4, 21, 0]

Then the modified grid will be:
[7, 19, 0]
[0, 0,  0]
 */

import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {

        int arr[][] = input();
        System.out.println("Original Matrix:");
        print(arr);
        int modifiedMatrix[][] = convertMatrix(arr);
        System.out.println("Modified Matrix:");
        print(modifiedMatrix);

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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] convertMatrix(int matrix[][]) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroColumns = new boolean[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroColumns[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (zeroRows[i] || zeroColumns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
