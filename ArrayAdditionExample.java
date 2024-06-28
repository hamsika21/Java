// Description: This program demonstrates method overriding in Java using arrays to perform addition and subtraction.
// Class A defines a method to add corresponding elements of two arrays.
// Class B extends A and overrides the add method to subtract corresponding elements of two arrays.

import java.util.Scanner;

// Parent class A
class A {
    
    // Method to add corresponding elements of two arrays
    double[] add(double a[], double b[]) {
        int n = a.length;
        double c[] = new double[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
}

// Child class B extending A
class B extends A {
    
    // Override method to subtract corresponding elements of two arrays
    @Override
    double[] add(double a[], double b[]) {
        int n = a.length;
        double c[] = new double[n];
        System.out.print("Result of subtraction:");
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
            System.out.print(" " + c[i]);
        }
        System.out.println();
        return c;
    }
}

// Main class to demonstrate the functionality
public class ArrayAdditionExample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read size of arrays
        
        double a[] = new double[n];
        double b[] = new double[n];
        
        // Input array elements
        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextDouble();
        }
        
        // Create objects of A and B
        A objA = new A();
        B objB = new B();
        
        // Perform addition using object of class A
        double c[] = objA.add(a, b);
        System.out.print("Result of addition:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + c[i]);
        }
        System.out.println();
        
        // Perform subtraction using object of class B
        objB.add(a, b);
        
        sc.close(); 
    }
}
