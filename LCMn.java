/*
 * This program defines a class LCMnno to calculate the Least Common Multiple (LCM)
 * of multiple numbers using the Greatest Common Divisor (GCD).
 * The main method in Main initializes an array of integers and calculates their LCM.
 */

class LCMnno {
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

    // Method to calculate LCM of two numbers using GCD
    int lcm2(int a, int b) {
        int g = gcd(a, b);
        int l = (a * b) / g;
        return l;
    }

    // Method to calculate LCM of an array of numbers
    void lcmn(int a[]) {
        int l, n, i;
        n = a.length;
        l = a[0];
        for (i = 1; i < n; i++) {
            l = lcm2(l, a[i]);
        }
        System.out.println("LCM of the numbers = " + l);
    }
}

// Main class to execute the program
class Main {
    public static void main(String args[]) {
        // Create an object of LCMnno class
        LCMnno obj1 = new LCMnno();

        // Initialize an array of integers
        int a[] = { 2, 4, 6, 8, 10 };

        // Calculate and print the LCM of the numbers in the array
        obj1.lcmn(a);
    }
}
