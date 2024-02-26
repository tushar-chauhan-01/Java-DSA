import java.util.Scanner;

public class DeformedMatrix {
    public static void main(String[] args) {
        print(input());
    }

    public static int[][] input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows ->");
        int row = sc.nextInt();

        int arr[][] = new int[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter column length for " + i + " row");
            arr[i] = new int[sc.nextInt()];
            for (int j = 0; j < arr[i].length; j++) {
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

}
