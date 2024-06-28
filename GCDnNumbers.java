/*
 * This program defines a class GCDnNumbers to calculate the Greatest Common Divisor (GCD)
 * of multiple numbers using the Euclidean algorithm.
 * The main method in CallGcdnNumbers initializes an array of integers entered by the user and calculates their GCD.
 */

import java.util.Scanner;

class GCDnNumbers {
    // Method to calculate GCD of two numbers using Euclidean algorithm
    int gcd(int a, int b) {
        int r;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);
        return a;
    }

    // Method to calculate GCD of an array of numbers
    void gcdn(int a[]) {
        int g1, n, i;
        n = a.length;
        g1 = a[0];
        for (i = 1; i < n; i++) {
            g1 = gcd(g1, a[i]);
        }
        System.out.println("GCD of the numbers = " + g1);
    }
}

// Main class to execute the program
class CallGcdnNumbers {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        // Initialize an array of integers with user-provided size
        int[] numbers = new int[size];

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create an object of GCDnNumbers class
        GCDnNumbers obj1 = new GCDnNumbers();

        // Calculate and print the GCD of the numbers in the array
        obj1.gcdn(numbers);

        // Close the scanner object to release resources
        sc.close();
    }
}
