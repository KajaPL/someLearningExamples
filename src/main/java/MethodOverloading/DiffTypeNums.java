package MethodOverloading;

public class DiffTypeNums {
    static int plusMethodInt (int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = plusMethodInt(8,5);
        double num2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + num1);
        System.out.println("double: " + num2);
    }
}
