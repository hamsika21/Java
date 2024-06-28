/*
 * This program defines a class MatrixPower to compute the power of a square matrix.
 * The sqrMatrix method computes the matrix multiplication of two matrices.
 * The cubeMat method computes the matrix raised to the power up to the given exponent.
 */

import java.util.Scanner;

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
    void cubeMat(int a[][], int m) {
        int n = a.length;
        int b[][] = new int[n][n];
        
        // Initialize matrix b with matrix a
        b = a;
        
        // Compute the power of matrix a up to the exponent m using matrix multiplication
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
class CallMatrixPower3 {
    public static void main(String args[]) {
        // Create an object of MatrixPower class
        MatrixPower obj1 = new MatrixPower();

        // Initialize variables and read matrix size and exponent from user
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (n x n): ");
        n = sc.nextInt();
        System.out.print("Enter exponent for matrix power: ");
        m = sc.nextInt();

        // Initialize a matrix based on user input
        int a[][] = new int[n][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Compute and print the matrix raised to the power m using cubeMat method
        obj1.cubeMat(a, m);

        // Close the scanner object to release resources
        sc.close();
    }
}
