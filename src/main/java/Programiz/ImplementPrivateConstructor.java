package Programiz;

class ImplementPrivateConstructor {
    private ImplementPrivateConstructor () {
        System.out.println("This is a private constructor.");
    }
    public static void instanceMethod() {
        ImplementPrivateConstructor obj = new ImplementPrivateConstructor();
    }
}
class Main {
    public static void main(String[] args) {
        ImplementPrivateConstructor.instanceMethod();
    }
}
