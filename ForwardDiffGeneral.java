/*
 * This program generates and displays a forward difference table for a general case using a 2D array.
 * Class A defines methods to calculate and display the forward difference table.
 * Class ForwardDiffGeneral contains the main method to create an object and execute the table generation.
 */

import java.util.Scanner;

class A {
    int n; // Size of the table

    // Constructor to initialize the size of the table
    A(int n) {
        this.n = n;
    }

    // Method to calculate and display the forward difference table
    void diff(int x0, int h) {
        int i, j;

        // Create a 2D array for the forward difference table
        int[][] a = new int[n + 1][];

        // Initialize each row with appropriate size
        for (i = 0, j = n + 2; i <= n; i++, j--) {
            a[i] = new int[j];
        }

        // Assign initial value x0 to the first element of the first column
        a[0][0] = x0;

        // Calculate and assign values to the table based on the forward difference formula
        for (i = 1; i <= n; i++) {
            a[i][0] = a[i - 1][0] + h;
        }

        // Display the forward difference table
        for (i = 0; i <= n; i++) {
            for (j = 0; j < n + 2 - i; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }
    }
}

// Main class to execute the program
public class ForwardDiffGeneral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the forward difference table: ");
        int n = sc.nextInt(); // Read input for the size of the table
        A obj = new A(n); // Create an object of class A with size n
        obj.diff(1, 1); // Call the method to generate and display the forward difference table
    }
}
