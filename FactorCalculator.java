/*
 * This program defines a class X with a subclass G to display the factors of a given number.
 * The main method reads an integer from the user and uses an object of class G to display its factors.
 */

import java.util.Scanner;

// Base class X with an integer variable n
class X {
    int n;
}

// Subclass G extends class X
class G extends X {   
    // Constructor to initialize the number n
    G(int n) {
        this.n = n;
    }

    // Method to display factors of the number n
    void factors() {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }
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

        // Create an object of class G and pass the input number
        G obj1 = new G(s);

        // Display the factors of the input number
        System.out.print("Factors of " + s + " are:");
        obj1.factors();
    }
}
