public class RowWiseSum {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rowWiseSum(mat1); // Output: 6 15 24

        int[][] mat2 = { { -1, 2, -3 }, { 4, -5, 6 }, { 7, -8, 9 } };
        rowWiseSum(mat2); // Output: -2 5 8

        int[][] mat3 = { {} };
        rowWiseSum(mat3); // Output:

        int[][] mat4 = { { 1, 2, 3 } };
        rowWiseSum(mat4); // Output: 6

        int[][] mat5 = { { 1 }, { 2 }, { 3 } };
        rowWiseSum(mat5); // Output: 1 2 3
    }

    public static void rowWiseSum(int mat[][]) {
        if (mat.length == 0)
            return; // Handle empty matrix

        if (mat[0].length == 0)
            return; // Handle empty row

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum = sum + mat[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
