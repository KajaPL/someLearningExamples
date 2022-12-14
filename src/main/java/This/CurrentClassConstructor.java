package This;

public class CurrentClassConstructor {
    int a;
    int b;
    CurrentClassConstructor() {
        this(10, 20);
        System.out.println("Inside default constructor\n");
        System.out.println(a + " " + b);
        //защо се принтиш като второто? аха заради this
    }
    CurrentClassConstructor(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside parametrized constructor" + a + b);
    }

    public static void main(String[] args) {
        CurrentClassConstructor object = new CurrentClassConstructor();
    }
}
