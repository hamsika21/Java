/*
 * This program defines a class A to perform operations on an array of integers.
 * The constructor initializes the value of n.
 * The accept method counts how many elements in the array are divisible by n.
 * The avg method calculates the average of elements in the array that are divisible by n.
 */

class A {
    int n;

    // Constructor to initialize the value of n
    A(int n) {
        this.n = n;
    }

    // Method to count elements in the array divisible by n
    int accept(int a[]) {
        int m = a.length;
        int c = 0;

        for (int i = 0; i < m; i++) {
            if (a[i] % this.n == 0) {
                // Uncomment the line below to print elements divisible by n
                // System.out.print(" " + a[i]);
                c++;
            }
        }
        return c;
    }

    // Method to calculate the average of elements divisible by n
    void avg(int a[]) {
        int av = 0;
        int m = a.length;
        int count = accept(a); // Number of elements divisible by n

        for (int i = 0; i < m; i++) {
            if (a[i] % this.n == 0) {
                av += a[i];
            }
        }
        av = av / count; // Calculate average
        System.out.print(" " + av);
    }
}

// Main class to execute the program
class CallA {
    public static void main(String[] args) {
        // Create an object of class A with n=2
        A obj1 = new A(2);

        // Define an array of integers
        int a[] = { 4, 6, 7, 8 };

        // Calculate and print the average of elements divisible by n
        obj1.avg(a);
    }
}
