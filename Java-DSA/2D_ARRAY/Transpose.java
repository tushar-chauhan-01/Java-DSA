import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int matrix[][] = input();
        System.out.println("Matrix");
        print(matrix);
        int transposeMatrix[][]=transpose(matrix);
        System.out.println("Transpose Matrix");
        print(transposeMatrix);        
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
        for( int i[]:a){
            for( int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int a[][]) {
        int transposeMatrix[][] = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                transposeMatrix[j][i] = a[i][j];
            }
        }

        return transposeMatrix;
    }
}
