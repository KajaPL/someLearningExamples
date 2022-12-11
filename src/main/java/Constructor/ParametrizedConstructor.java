package Constructor;

public class ParametrizedConstructor {
    int id;
    String name;
    ParametrizedConstructor(int i, String n) {
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ParametrizedConstructor s1 = new ParametrizedConstructor(111, "Kaja");
        ParametrizedConstructor s2 = new ParametrizedConstructor(222, "Desi");
        s1.display();
        s2.display();
    }
}
