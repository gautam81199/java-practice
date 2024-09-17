package Araays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int m = 2, n = 3, p = 2;
        int[][] matrix1 = { {3, -2, 5}, {3, 0, 4} };
        int[][] matrix2 = { {2, 3}, {-9, 0}, {0, 4} };

        // Result matrix of size m x p
        int[][] result = new int[m][p];

        // Multiplying the matrices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for (int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

