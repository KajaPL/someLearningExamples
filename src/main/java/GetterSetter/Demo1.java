package GetterSetter;

public class Demo1 {
    public static void main(String[] args) {
        Person1 first = new Person1();
        first.setName("Bob");
        first.setAge(20);
        System.out.println(first.getName() + " " + first.getAge());
    }
}
