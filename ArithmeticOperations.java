/*
 * This program defines a class A to perform basic arithmetic operations such as checking divisibility,
 * calculating the quotient, and finding the remainder for two given numbers.
 */

class A {
    // Instance variables to hold the two numbers
    short a, b;

    // Constructor to initialize the two numbers
    A(int x, int y) {
        this.a = (short) x;
        this.b = (short) y;
    }

    // Method to check if the first number is divisible by the second number
    void check() {
        if (a % b == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }
    }

    // Method to calculate and print the quotient of the two numbers
    void quotient() {
        int q = a / b;
        System.out.println("quotient = " + q);
    }

    // Method to calculate and print the remainder of the two
