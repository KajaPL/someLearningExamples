package Return;

public class MethodsNotReturningAvalue {
    void demoSum(int a, int b){
        int sum = 0;
        sum = (a+b) / 10;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new MethodsNotReturningAvalue().demoSum(5, 5);
        System.out.println("No return keyword is used and program executed successfully");
    }
}
