package Inheritance;

public class Animal1 {
    //parent class
    String name;
    String eating;
    public void eat() {
        System.out.println("I can eat " + eating);
    }
}

class Dog1 extends Animal1 {
    //inheritance
    public void display() {
        System.out.println("My name is " + name);
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("I can eat only kulki");
    }
}

class Main1 {
    public static void main(String[] args) {
        //object of subclass
        Dog1 cocker = new Dog1();

        cocker.name = "Argos";
        cocker.display();
        cocker.eating = "your shoes!";
        cocker.eat();
    }
}
