package ClassObjectMethods;

public class CalculationMethodTakesParameters {
    int a;
    int b;

    void sum (int x, int y) {
        a=x;
        b=y;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        CalculationMethodTakesParameters cal = new CalculationMethodTakesParameters();
     cal.sum(100, 200);
    }
}
