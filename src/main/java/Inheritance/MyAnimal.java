package Inheritance;

public class MyAnimal {
    public static void main(String[] args) {
       //  Animal a = new Animal("George");
        Dog d = new Dog("Buck");
        Cat c = new Cat("Puszek");
        Animal a = new Dog("Copper");

        /*System.out.println("Animal a: ");
        a.speak();
        a.move();
        System.out.println();*/

        System.out.println("Dog d: ");
        d.speak();
        d.move();
        System.out.println();

        System.out.println("Cat c:");
        c.speak();
        c.move();
        System.out.println();

        System.out.println("Animal a:");
        a.speak();
        a.move();

        System.out.println();
    }
}
