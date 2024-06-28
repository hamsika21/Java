/*
 * This program calculates the roots of a polynomial using the Bisection method.
 * Class A defines methods to calculate powers and evaluate the polynomial.
 * Class B extends A and adds a method to find roots using the Bisection method.
 * Class RootsOfPoly contains the main method to accept user input and execute root calculation.
 */

import java.util.Scanner;

// Class A to handle polynomial operations
class A {
    int n; // Degree of the polynomial
    double[] a; // Coefficients of the polynomial
    double e; // Error tolerance for root calculation

    // Constructor to initialize degree and coefficients
    A(int m) {
        n = m;
        a = new double[n + 1]; // Initialize array for coefficients
    }

    // Method to calculate power of a number
    double p(double a, double b) {
        double x = Math.pow(a, b);
        return x;
    }

    // Method to evaluate the polynomial for a given x
    double f(double x) {
        double s = a[0];
        for (int i = 1; i < n + 1; i++) {
            s += p(x, i) * this.a[i];
        }
        return s;
    }

    // Method to find roots using the Bisection method
    void roots(double a, double b) {
        double c = a;
        while ((b - a) > e) {
            c = (a + b) / 2;
            if (f(c) == 0)
                break;
            else if (f(a) * f(c) < 0)
                b = c;
            else
                a = c;
        }
        System.out.println(" Root of the polynomial: " + c);
    }
}

// Class B extends A to utilize polynomial operations
class B extends A {
    B(int n) {
        super(n); // Call superclass constructor to initialize degree
    }
}

// Main class to execute the program
class RootsOfPoly {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the degree of the polynomial: ");
        int n = sc.nextInt(); // Input degree of polynomial

        B obj1 = new B(n); // Create object of class B with degree n

        System.out.println("Enter coefficients of the polynomial (from highest to lowest degree):");
        double[] b = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            b[i] = sc.nextDouble(); // Input coefficients of the polynomial
        }
        obj1.a = b; // Assign coefficients to object

        System.out.print("Enter error tolerance (e): ");
        double e = sc.nextDouble(); // Input error tolerance
        obj1.e = e; // Assign error tolerance to object

        System.out.print("Enter initial guesses (p and q): ");
        double p = sc.nextDouble(); // Input initial guess p
        double q = sc.nextDouble(); // Input initial guess q

        obj1.roots(p, q); // Find and display roots using Bisection method
    }
}
