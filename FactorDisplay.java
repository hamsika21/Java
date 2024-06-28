/*
 * This program defines a class X with a method to display the factors of a given number.
 * A subclass displayFactors extends X and initializes the number. The main method reads an integer 
 * from the user and displays its factors.
 */

import java.util.Scanner;

// Base class X with a method to display factors of a given number
class X {
    // Method to display factors of the number n
    void display(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(" " + i);
        }
    }
}

// Subclass displayFactors extends class X
class displayFactors extends X {
    int n;

    // Constructor to initialize the number n
    displayFactors(int n) {
        this.n = n;
    }
}

// Main class to execute the program
class CallX {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        // Read an integer from the user
        int s = sc.nextInt();

        // Create an object of displayFactors and pass the input number
        displayFactors obj1 = new displayFactors(s);

        // Display the factors of the input number
        System.out.print("Factors of " + s + " are:");
        obj1.display(s);
    }
}
