import java.util.Scanner;

public class SquareMatrixCheck {
    
    public static void main(String[] args) {
        int matrix[][] = input();
        print(matrix);
        int a[] = getDiagnolElement(matrix);

        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
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

    public static int[] getDiagnolElement(int a[][]) {

        int diag[] = new int[a.length];

        if (a.length != a[0].length) {
            System.out.println("NO, IT IS NOT A SQUARE MATRIX.");
            return diag;
        }

        int col = 0;
        for (int i = 0; i < a.length; i++) {
            diag[i] = a[i][col];
            col = col + 1;
        }
        System.out.println("YES, IT IS A SQUARE MATRIX.");
        return diag;
    }

}
