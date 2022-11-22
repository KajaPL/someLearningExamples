package ClassObjectMethods;

public class CalculationMethodReturnsSomeValue {
    int a;
    int b;
    int sum() {
        return(a+b);

    }

    public static void main(String[] args) {
        CalculationMethodReturnsSomeValue cal = new CalculationMethodReturnsSomeValue();
        cal.a=100;
        cal.b=200;
        int r = cal.sum();
        System.out.println(r);
    }
}
