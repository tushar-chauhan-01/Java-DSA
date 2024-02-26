import java.util.Scanner;

public class PrintUsingForEachLoop {

    public static void main(String[] args) {
        print(input());
    }

    public static void print(int a[][]) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
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

}
