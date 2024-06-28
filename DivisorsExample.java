// Description: This program demonstrates inheritance and method overriding in Java.
// Class A defines a method to find and print divisors of a number.
// Class B extends A and overrides the divisors method to filter and print divisors greater than a given value.

import java.util.Scanner;

// Parent class A
class A {
    int n; // Instance variable to hold the number

    // Constructor to initialize n
    A(int n) {
        this.n = n;
    }

    // Method to print divisors of n
    void divisors() {
        System.out.print("Divisors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// Child class B inheriting from A
class B extends A {
    int m; // Additional instance variable to store a comparison value

    // Constructor to initialize n (via super) and m
    B(int n, int m) {
        super(n); // Call superclass constructor to initialize n
        this.m = m; // Initialize m
    }

    // Override method to print divisors of n greater than m
    @Override
    void divisors() {
        System.out.print("Divisors of " + n + " greater than " + m + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m < i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// Main class to demonstrate the functionality
public class DivisorsExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter two numbers (n m): ");
        int n = sc.nextInt(); // Read n
        int m = sc.nextInt(); // Read m

        // Create objects of A and B
        A objA = new A(n);
        B objB = new B(n, m);

        // Call divisors method for both objects
        objA.divisors();
        objB.divisors();

        sc.close(); // Closing scanner
    }
}
