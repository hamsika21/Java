/*
 * This program defines a class acceptMatrix to accept a matrix from the user.
 * The main method reads the dimensions and elements of the matrix and prints it.
 */

import java.util.Scanner;

class AcceptMatrix {
    public static void main(String[] args) {
        // Method to accept and print a matrix
        int[][] matrix() {
            int m, n, i, j;

            // Create a Scanner object to read input from the user
            Scanner sc = new Scanner(System.in);

            // Read number of rows from the user
            System.out.print("Number of rows: ");
            m = sc.nextInt();

            // Read number of columns from the user
            System.out.print("Number of columns: ");
            n = sc.nextInt();

            // Initialize the matrix with the given dimensions
            int[][] x = new int[m][n];

            // Read matrix elements from the user
            System.out.println("Enter the elements of the matrix:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    x[i][j] = sc.nextInt();
                }
            }

            // Print the matrix
            System.out.println("The matrix is:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(" " + x[i][j]);
                }
                System.out.println();
            }

            return x;
        }

        // Call the matrix method to execute the functionality
        matrix();
    }
}
