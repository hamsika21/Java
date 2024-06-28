/*
 * This program demonstrates forward difference interpolation using a polynomial.
 * Class A contains methods to calculate polynomial values at given x values, generate a difference table, and perform interpolation.
 * Class B extends A and overrides the interpolation method for a more optimized approach.
 * Class ForwardDiffGeneral contains the main method to create objects and execute interpolation using both classes.
 */

import java.util.Scanner;

class A {
    int n; // Degree of the polynomial

    // Constructor to initialize the degree of the polynomial
    A(int n) {
        this.n = n;
    }

    // Method to calculate polynomial values at different x values
    double[] y(double x[], double a[]) {
        double[] p = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                p[i] += a[j] * Math.pow(x[i], j);
            }
        }
        return p;
    }

    // Method to generate and display the forward difference table
    double[] diff(double x0, double h, double z[]) {
        double a[][] = new double[n + 1][];

        for (int i = 0, j = n + 2; i <= n; i++, j--) {
            a[i] = new double[j];
        }

        // Creating the 0th column which are values of x
        a[0][0] = x0;
        for (int i = 1; i <= n; i++) {
            a[i][0] = a[i - 1][0] + h;
        }

        double b[] = new double[n + 1];
        double c[] = new double[n + 1];

        for (int i = 0; i <= n; i++) {
            b[i] = a[i][0];
        }

        c = y(b, z);

        // Assigning the functional value received in c in the first column of a
        for (int i = 0; i <= n; i++) {
            a[i][1] = c[i];
        }

        // Calculating the difference table
        for (int j = 2; j <= n + 1; j++) {
            for (int i = 0; i < n - j + 2; i++) {
                a[i][j] = a[i + 1][j - 1] - a[i][j - 1];
            }
        }

        // Displaying the difference table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n + 2 - i; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }

        double d[] = new double[n + 2];
        for (int i = 0; i <= n + 1; i++) {
            d[i] = a[0][i];
        }
        return d;
    }

    // Method to calculate factorial
    long fact(int i) {
        long f = 1;
        for (int j = 1; j <= i; j++) {
            f *= j;
        }
        return f;
    }

    // Method to perform interpolation using the forward difference table
    void inter(double x0, double h, double z[], double a) {
        double d[] = new double[n + 2];
        d = diff(x0, h, z);

        double u, p, s = 0;
        u = (a - x0) / h;

        for (int i = 0; i <= n; i++) {
            p = 1;
            for (int j = 0; j < i; j++) {
                p *= (u - j);
            }
            s += p * d[i + 1] / fact(i);
            System.out.print("  " + s);
        }

        System.out.println("\n\n  " + s);
    }
}

class B extends A {
    B(int n) {
        super(n);
    }

    // Optimized interpolation method using Lagrange's formula
    void inter(double x0, double h, double z[], double a) {
        double b[] = new double[n + 1];
        b[0] = x0;
        for (int i = 1; i <= n; i++) {
            b[i] = b[i - 1] + h;
        }

        double c[] = y(b, z);
        double p, s = 0;

        for (int i = 0; i <= n; i++) {
            p = 1;
            for (int j = 0; j <= n; j++) {
                if (j != i) {
                    p *= (a - b[j]) / (b[i] - b[j]);
                }
            }
            s += p * c[i];
        }

        System.out.println("  " + s);
    }
}

public class ForwardDiffGeneral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the degree of the polynomial: ");
        int n = sc.nextInt(); // Read degree of the polynomial
        double z[] = new double[n + 1];
        System.out.println("Enter the coefficients of the polynomial:");
        for (int i = 0; i <= n; i++) {
            z[i] = sc.nextDouble();
        }

        A obj = new A(n);
        // obj.diff(1, 1, z); // Uncomment if you want to display the difference table

        B obj1 = new B(n);
        System.out.print("Enter the value of x for interpolation: ");
        double x = sc.nextDouble();
        obj.inter(0, 1, z, x); // Perform interpolation using the forward difference table in class A
        obj1.inter(0, 1, z, x); // Perform interpolation using the optimized method in class B
    }
}
