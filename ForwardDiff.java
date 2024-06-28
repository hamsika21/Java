/*
 * This program generates and displays a forward difference table using a 2D array.
 * Class A defines methods to calculate and display the forward difference table.
 * Class ForwardDiff contains the main method to create an object and execute the table generation.
 */

class A {
    int n; // Size of the table

    // Constructor to initialize the size of the table
    A(int n) {
        this.n = n;
    }

    // Method to calculate and display the forward difference table
    void diff() {
        int i, j;

        // Create a 2D array for the forward difference table
        int[][] a = new int[n + 1][];

        // Initialize each row with appropriate size
        for (i = 0, j = n + 2; i <= n; i++, j--) {
            a[i] = new int[j];
        }

        // Calculate and assign values to the table
        for (i = 0; i <= n; i++) {
            for (j = 0; j < n + 2 - i; j++) {
                a[i][j] = i + j;
            }
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
public class ForwardDiff {
    public static void main(String args[]) {
        A obj = new A(4); // Create an object of class A with size 4
        obj.diff(); // Call the method to generate and display the forward difference table
    }
}
