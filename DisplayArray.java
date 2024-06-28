/*
 * This program defines a class Array to display the elements of an integer array.
 * The main method in CallArray initializes an array based on user input and displays its elements.
 */

import java.util.Scanner;

class Array {
    // Method to display the elements of an integer array
    void display(int a[]) {
        int n = a.length;
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

// Main class to execute the program
class CallArray {
    public static void main(String args[]) {
        // Create an object of Array class
        Array obj1 = new Array();

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize an array of integers based on user input size
        int[] a = new int[size];

        // Prompt the user to enter elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Display the elements of the array using the display method of Array class
        obj1.display(a);

        // Close the scanner object to release resources
        sc.close();
    }
}
