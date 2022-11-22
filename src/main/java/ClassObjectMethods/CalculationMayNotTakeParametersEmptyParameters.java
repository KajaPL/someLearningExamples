package ClassObjectMethods;

public class CalculationMayNotTakeParametersEmptyParameters {
    int a;
    int b;

    void sum() {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        CalculationMayNotTakeParametersEmptyParameters cal = new CalculationMayNotTakeParametersEmptyParameters();
        cal.a=100;
        cal.b=200;
        cal.sum();
    }
}
