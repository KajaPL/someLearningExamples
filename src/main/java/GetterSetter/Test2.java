package GetterSetter;

public class Test2 {
    public static void main(String[] args) {
        Person2 Bob = new Person2();
        Bob.setName("Bob");
        Bob.setFavColor("Pink");
        Bob.setAge(16);

        System.out.println("Name is " + Bob.getName());
        System.out.println("My color is " + Bob.getFavColor());
        System.out.println("I'm " + Bob.getAge() + " years old");
    }
}
