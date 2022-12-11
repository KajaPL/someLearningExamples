package Constructor;

public class ConstructorOverloading {
    int id;
    String name;
    int age;

    ConstructorOverloading(int i, int a){
        id = i;
      //  name = n;
        age = a;
    }

    ConstructorOverloading(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading(111, 30);
        ConstructorOverloading s2 = new ConstructorOverloading (222, "Desi", 25);
        s1.display();
        s2.display();
    }
}
