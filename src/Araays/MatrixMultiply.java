package Araays;

public class MatrixMultiply {
    public static void main(String[] args) {
        // Define two 3x3 matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Result matrix to store the multiplication result
        int[][] result = new int[3][3];

        // Multiply the matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Multiplication of the two 3x3 matrices is: ");
        for (int[] row : result) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

