import java.util.Scanner;

public class Traversing2dArray {

    public static void main(String[] args) {
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

        int arr1D[] = printRowWise(arr);
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }
    }

    public static int[] printRowWise(int[][] a) {
        int arr[] = new int[a.length * a[0].length];

        int count = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                arr[count] = a[i][j];
                count++;
            }
        }
        return arr;
    }
}
