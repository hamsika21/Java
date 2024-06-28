/*
 * This program defines a class A to calculate simple interest and compound interest.
 * The class includes methods to compute simple interest on a daily basis and to calculate the final amount 
 * with compound interest compounded daily.
 */

class A {
    // Instance variables to hold the number of years, principal, and interest rate
    double n, p, r;

    // Constructor to initialize the number of years, principal, and interest rate
    A(double x, double y, double z) {
        n = x;
        p = y;
        r = z;
    }

    // Method to calculate the simple interest on a daily basis
    double sI() {
        return (p * r) / 36500.0;
    }

    // Method to calculate and print the amount with compound interest compounded daily
    void cI() {
        int i;
        double s = 0;
        for (i = 1; i <= 365 * n; i++) {
            s = sI();
            p = p + s;
        }
        System.out.println("Amount with compound interest: " + p);
    }
}

class ClassA {
    public static void main(String args[]) {
        // Create an object with 1 year, principal of 100, and interest rate of 10%
        A obj1 = new A(1, 100, 10);
        // Calculate and print the amount with compound interest
        obj1.cI();
    }
}
