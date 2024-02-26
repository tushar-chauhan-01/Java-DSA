import java.util.Scanner;

public class LargestColumnSum {
    public static void main(String[] args) {

        int matrix[][] = input();
        print(matrix);
        LargestSum(matrix);

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

    public static void LargestSum(int a[][]) {
        int row = a.length;
        int col = a[0].length;
        int column_index = 0;
        int largest_sum = Integer.MIN_VALUE;

        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum = sum + a[i][j];
            }
            if (sum > largest_sum) {
                column_index = j;
                largest_sum = sum;
            }
        }
        System.out.println("largest sum = " + largest_sum + " is of column index" + column_index);
    }
}
