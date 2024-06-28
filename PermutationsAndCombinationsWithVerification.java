/*
 * This program calculates permutations (P) and combinations (C) using factorial calculations.
 * Class A defines methods for calculating factorial and permutations.
 * Class B extends A and adds a method for calculating combinations, as well as a verification method.
 * Class PandC contains the main method to accept user input, compute P and C, and verify a combinatorial identity.
 */

import java.util.Scanner;

// Class A to calculate factorial and permutations
class A {
    int n;

    // Constructor to initialize n
    A(int n) {
        this.n = n;
    }

    // Method to calculate factorial of a number
    long fact(int m) {
        long f = 1;
        for (int i = 1; i <= m; i++) {
            f = f * i;
        }
        return f;
    }

    // Method to calculate permutations (nPr)
    int P(int r) {
        int nPr = (int) (fact(n) / fact(n - r));
        return nPr;
    }
}

// Class B extends A to calculate combinations (nCr) and verify a combinatorial identity
class B extends A {
    B(int n) {
        super(n);
    }

    // Method to calculate combinations (nCr)
    int C(int r) {
        int nCr = P(r) / (int) fact(r);
        return nCr;
    }

    // Method to verify a combinatorial identity
    void verify() {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s + C(i);
        }
        if (s == (int) Math.pow(2, n)) {
            System.out.println("\nVerified");
        } else {
            System.out.println("\nNot Verified");
        }
    }
}

// Main class to execute the program
class PandC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and r: ");
        int n = sc.nextInt(); // Input n
        int r = sc.nextInt(); // Input r

        B obj1 = new B(n); // Create object of class B with n
        System.out.print(" " + obj1.P(r) + " " + obj1.C(r)); // Print P and C
        obj1.verify(); // Verify the combinatorial identity
    }
}
