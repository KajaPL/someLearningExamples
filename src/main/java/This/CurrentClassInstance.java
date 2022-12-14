package This;

public class CurrentClassInstance {
    int a;
    int b;

    CurrentClassInstance(){
        a=10;
        b=20;
    }
    CurrentClassInstance get(){
        return this;
    }

    void display(){
        System.out.println("a= " + a + "\nb= " + b);
    }

    public static void main(String[] args) {
        CurrentClassInstance object = new CurrentClassInstance();
        object.get().display();
    }
}
