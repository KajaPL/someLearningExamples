package Recursion;

public class RecursionFactorialNumber {
    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n*factorial(n-1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
        //to me: 1*2*3*4*5=120
    }
}
