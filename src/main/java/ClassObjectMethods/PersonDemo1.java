package ClassObjectMethods;

public class PersonDemo1 {
    //fields
    String name;
    int age;

    //methods
    public void sayName(){
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

    public void haveBirthday(){
        age++;
    }
}
