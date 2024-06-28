/*
 * This program calculates a mathematical series using powers of a given number.
 * Class A defines a method to compute a power of a number.
 * Class B extends A and adds a method to display the sum of a series based on powers of x.
 * Class Z contains the main method to accept user input and execute the series calculation.
 */

import java.util.Scanner;

// Class A to calculate power of a number
class A {
    // Method to compute power of a number
    double P(double a, double b) {
        double x = Math.pow(a, b);
        return x;
    }
}

// Class B extends A to compute and display a series sum
class B extends A {
    int n; // Number of terms in the series

    // Constructor to initialize n
    B(int n) {
        super(); // Calling superclass constructor implicitly
        this.n = n;
    }

    // Method to display the sum of the series
    void display(double a[], double x) {
        double s = a[0]; // Initialize sum with the first term
        for (int i = 1; i <= n; i++) {
            s += P(x, i) * a[i]; // Add each term of the series
        }
        System.out.println(" Sum of series: " + s);
    }
}

// Main class to execute the program
class Z {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in series: ");
        int n = sc.nextInt(); // Input number of terms
        B obj1 = new B(n); // Create object of class B with n
        double a[] = new double[n + 1]; // Array to store series coefficients
        System.out.println("Enter coefficients of the series:");
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextDouble(); // Input coefficients
        }
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble(); // Input value of x
        obj1.display(a, x); // Display the sum of the series
    }
}
