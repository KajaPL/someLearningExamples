package W3;

public class methodWithMultipleParameters {
    static void myThirdMethod(String names, int age){
        System.out.println(names + " is " + age + " years old!");
    }

    public static void main(String[] args) {
        myThirdMethod("Desi", 15);
        myThirdMethod("Didi", 17);
        myThirdMethod("Eli", 19);
        myThirdMethod("Mimi", 21);
    }
}
