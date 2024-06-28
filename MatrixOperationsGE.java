// Description: This program demonstrates matrix operations including recursive transformation, diagonal matrix creation,
// determinant calculation, Gaussian elimination, and display of matrices.

import java.util.Scanner;

// Parent class A for matrix operations
class A {

    // Method to display a matrix
    void display(double a[][]) {
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    // Recursive transformation of matrix
    double[][] rec(double a[][], int i, int j) {
        int n = a.length;
        int m = a[0].length;
        if (i == n - 1 || j == m - 1) {
            return (a);
        }
        max(a, i, j);
        swap(a, i, j);
        transform(a, i, j);
        return rec(a, i + 1, j + 1);
    }

    // Method to find maximum value in a column
    int max(double a[][], int p, int q) {
        int i, k = 0;
        double m1 = 0;
        int n = a.length;
        int m = a[0].length;
        for (i = p; i < n; i++) {
            if (a[i][0] > m1) {
                m1 = a[i][0];
                k = i;
            }
        }
        return k;
    }

    // Method to swap rows in a matrix
    void swap(double a[][], int p, int q) {
        int i, k;
        double k1;
        int n = a.length;
        int m = a[0].length;
        k = max(a, p, q);
        for (i = q; i < m; i++) {
            k1 = a[0][i];
            a[0][i] = a[k][i];
            a[k][i] = k1;
        }
    }

    // Method to perform matrix transformation
    void transform(double a[][], int p, int q) {
        int i, j;
        double k;
        int n = a.length;
        int m = a[0].length;
        for (i = p + 1; i < n; i++) {
            k = a[i][p] / a[p][q];
            for (j = q; j < m; j++) {
                a[i][j] = a[i][j] - k * a[p][j];
            }
        }
    }
}

// Child class B extending A for additional matrix operations
class B extends A {

    // Method to create a diagonal matrix
    double[][] diagonalMatrix(double a[][], int i, int j) {
        int n = a.length;
        int m = a[0].length;
        double c[][] = rec(a, i + 1, j + 1);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i != j) {
                    c[i][j] = 0;
                }
            }
        }
        return c;
    }

    // Method to calculate determinant of a matrix
    void determinant(double a[][], int i, int j) {
        int n = a.length;
        int m = a[0].length;
        double e[][] = diagonalMatrix(a, i + 1, j + 1);
        double d = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    d *= e[i][j];
                }
            }
        }
        System.out.print("Determinant = " + d);
        System.out.println("\n");
    }

    // Method to perform Gaussian elimination on a matrix
    void gaussElimination(double a[][], int i, int j) {
        int n = a.length;
        int m = a[0].length;
        double g[][] = diagonalMatrix(a, i + 1, j + 1);
        double x, y, z;
        x = g[0][0];
        y = g[1][1];
        z = g[2][2];
        System.out.println("x = " + x + "  y = " + y + "   z = " + z);
    }

    // Method to manipulate matrix (Example placeholder method)
    void gaussMatrix(double a[][], int i, int j) {
        // Placeholder method, not fully implemented as per original intent in provided code
        int n = a.length;
        int m = a[0].length;
        double p[][] = rec(a, i + 1, j + 1);
        double l, q, r;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == n - 1 && j == m - 1) {
                    r = p[i][j];
                }
            }
        }
    }
}

// Main class to demonstrate matrix operations
public class GroupWork3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double b[][] = new double[n][m];

        // Input matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextDouble();
            }
        }

        // Creating objects and performing matrix operations
        A o1 = new A();
        o1.rec(b, 0, 0); // Recursive transformation
        o1.display(b); // Display transformed matrix

        B o2 = new B();
        o2.diagonalMatrix(b, 0, 0); // Creating diagonal matrix
        o2.display(b); // Display diagonal matrix

        o2.determinant(b, 0, 0); // Calculate determinant
        o2.gaussElimination(b, 0, 0); // Perform Gaussian elimination

        sc.close(); // Close scanner
    }
}
