package Inheritance;

public class Dog extends Animal {
    public Dog (String name) {
        super(name);
    }
    public void speak() {
        System.out.println("Woof!");
    }
    public void move() {
        super.move();
        System.out.println(name + " is running");
    }

}
