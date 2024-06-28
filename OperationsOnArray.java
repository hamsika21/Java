/*
 * This program defines a class A to perform operations on an array of integers.
 * The initialize method sets a value for n.
 * The accept method counts how many elements in the array are divisible by n.
 * The avg method calculates the average of elements in the array that are divisible by n.
 */

class A {
    int n;

    // Method to initialize the value of n
    void initialize(int a) {
        n = a;
    }

    // Method to count elements in the array divisible by n
    int accept(int a[]) {
        int m = a.length;
        int c = 0;

        for (int i = 0; i < m; i++) {
            if (a[i] % n == 0) {
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
            if (a[i] % n == 0) {
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
        // Create an object of class A
        A obj1 = new A();

        // Initialize n and define an array of integers
        obj1.initialize(2);
        int a[] = { 4, 6, 10, 8 };

        // Calculate and print the average of elements divisible by n
        obj1.avg(a);
    }
}
