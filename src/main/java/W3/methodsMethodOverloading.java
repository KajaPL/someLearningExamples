package W3;

public class methodsMethodOverloading {
    static int mySixMethod(int x, int y) {
        return x + y;
    }

    static double mySixMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = mySixMethod(9, 6);
        double num2 = mySixMethod(3.14, 6.66);
        System.out.println("int num1: " + num1);
        System.out.println("double num2: " + num2);
    }
}
