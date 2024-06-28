class A {
    // Instance variables to hold the sides of the triangle
    int a, b, c;

    // Constructor to initialize the sides of the triangle
    A(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Method to calculate the semi-perimeter of the triangle
    double semiPerimeter() {
        return (a + b + c) / 2.0;
    }

    // Method to check if the given sides form a valid triangle
    boolean check() {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }

    // Method to calculate and print the area of the triangle if valid
    void area() {
        double s, ar;
        if (check()) {
            s = semiPerimeter();
            ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("area = " + ar);
        } else {
            System.out.println("no area");
        }
    }
}

class CallA {
    public static void main(String args[]) {
        // Create two triangle objects with different side lengths
        A obj1 = new A(2, 2, 1);
        A obj2 = new A(1, 1, 2);

        // Calculate and print the area of both triangles
        obj1.area();
        obj2.area();
    }
}
