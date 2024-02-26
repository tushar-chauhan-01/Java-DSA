public class PrintSpiralMatrix {
    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 } };

        int matrix2[][] = { { 1, 2, 3, 4, 5 } };

        int matrix3[][] = { { 1 }, { 2 }, { 3 }, { 4 }, { 5 } };

        int matrix4[][] = new int[0][0];

        System.out.println("MATRIX 1");
        print(matrix);
        printSpiral(matrix);

        System.out.println("MATRIX 2");
        print(matrix2);
        printSpiral(matrix2);

        System.out.println("MATRIX 3");
        print(matrix3);
        printSpiral(matrix3);

        System.out.println("MATRIX 4");
        print(matrix4);
        printSpiral(matrix4);
    }

    public static void print(int a[][]) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int a[][]) {

        int rows = a.length;
        if (rows == 0)
            return; // Handle empty matrix

        int cols = a[0].length;
        if (cols == 0)
            return; // Handle empty row

        int top = 0, left = 0, bottom = a.length - 1, right = a[0].length - 1;

        System.out.println("Printing Spiral Array");
        while (top <= bottom && left <= right) {

            // Print top row from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(a[left][i] + " ");
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Print bottom row from right to left
            if (top <= bottom) { // Ensure there's a bottom row
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            // Print left column from bottom to top
            if (left <= right) { // Ensure there's a left column
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }

        }
        System.out.println();
    }
}
