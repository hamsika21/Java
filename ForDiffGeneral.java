/*
 * This program demonstrates forward difference interpolation using a polynomial.
 * Class A contains methods to calculate polynomial values at given x values and generate a difference table.
 * Class B extends A and adds methods for factorial calculation and interpolation using the difference table.
 * Class ForwardDiffGeneral contains the main method to create objects and execute interpolation.
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
        int i, j;
        double a[][] = new double[n + 1][];

        for (i = 0, j = n + 2; i <= n; i++, j--) {
            a[i] = new double[j];
        }

        a[0][0] = x0;

        for (i = 1; i <= n; i++) {
            a[i][0] = a[i - 1][0] + h;
        }

        double b[] = new double[n + 1];
        double c[] = new double[n + 1];

        for (i = 0; i <= n; i++) {
            b[i] = a[i][0];
        }

        c = y(b, z);

        for (i = 0; i <= n; i++) {
            a[i][1] = c[i];
        }

        for (j = 2; j <= n + 1; j++) {
            for (i = 0; i < n - j + 2; i++) {
                a[i][j] = a[i + 1][j - 1] - a[i][j - 1];
            }
        }

        for (i = 0; i <= n; i++) {
            for (j = 0; j < n + 2 - i; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println("");
        }

        double d[] = new double[n + 2];

        for (i = 0; i <= n + 1; i++) {
            d[i] = a[0][i];
        }

        return d;
    }
}

class B extends A {
    B(int n) {
        super(n);
    }

    // Method to calculate factorial
    long fact(int i) {
        long f = 1;
        for (int j = 1; j <= i; j++) {
            f *= j;
        }
        return f;
    }

    // Method to perform interpolation using forward difference table
    void inter(double x0, double h, double z[], double a) {
        double d[] = new double[n + 2];
        d = super.diff(x0, h, z);

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
        obj1.inter(0, 1, z, x); // Perform interpolation using the forward difference table
    }
}
