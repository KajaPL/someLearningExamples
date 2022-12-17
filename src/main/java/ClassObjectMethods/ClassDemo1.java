package ClassObjectMethods;

public class ClassDemo1 {
    public static void main(String[] args) {
PersonDemo1 a = new PersonDemo1();
a.name = "Bob";
a.age = 25;

PersonDemo1 b = new PersonDemo1();
b.name= "Mary";
b.age = 35;

a.sayName();
b.sayName();
a.haveBirthday();
a.sayName();
    }
}
