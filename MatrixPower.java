/*
 * This program defines a class MatrixPower to compute the power of a square matrix.
 * The sqrMatrix method computes the matrix multiplication of two matrices.
 * The fourthMat method computes the power of the matrix up to the given exponent.
 */

class MatrixPower {
    // Method to compute matrix multiplication of two matrices
    int[][] sqrMatrix(int a[][], int c[][]) {
        int n = a.length;
        int b[][] = new int[n][n];
        
        // Initialize matrix b with zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = 0;
            }
        }
        
        // Perform matrix multiplication of matrices a and c
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    b[i][j] += a[i][k] * c[k][j];
                }
            }
        }
        
        return b;
    }

    // Method to compute the power of a matrix up to m
    void fourthMat(int a[][], int m) {
        int n = a.length;
        int b[][] = new int[n][n];
        
        // Initialize matrix b with matrix a
        b = a;
        
        // Compute the power of matrix a up to the exponent m
        for (int i = 1; i < m; i++) {
            b = sqrMatrix(a, b);
        }
        
        // Print the resulting matrix after raising to the power m
        System.out.println("Matrix after raising to the power " + m + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }
}

// Main class to execute the program
class CallMatrixPower2 {
    public static void main(String args[]) {
        // Create an object of MatrixPower class
        MatrixPower obj1 = new MatrixPower();

        // Initialize a 2x2 matrix
        int a[][] = { { 1, 2 }, { 3, 4 } };
        
        // Define the exponent
        int n = 4;

        // Compute and print the matrix raised to the power n using fourthMat method
        obj1.fourthMat(a, n);
    }
}
