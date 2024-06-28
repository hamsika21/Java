/*
 * This program defines a class MatrixPower to compute the square of a matrix.
 * The main method in CallMatrixPower initializes a 2x2 matrix and computes its square using the sqrMatrix method.
 */

class MatrixPower {
    // Method to compute the square of a square matrix
    void sqrMatrix(int a[][]) {
        int n = a.length;
        int b[][] = new int[n][n]; // Initialize result matrix b

        // Perform matrix multiplication to compute the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    b[i][j] += a[i][k] * a[k][j];
                }
            }
        }

        // Print the resulting squared matrix
        System.out.println("Squared matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }
}

// Main class to execute the program
class CallMatrixPower {
    public static void main(String args[]) {
        // Create an object of MatrixPower class
        MatrixPower obj1 = new MatrixPower();

        // Initialize a 2x2 matrix
        int a[][] = { { 1, 2 }, { 3, 4 } };

        // Compute and print the square of the matrix using sqrMatrix method
        obj1.sqrMatrix(a);
    }
}
