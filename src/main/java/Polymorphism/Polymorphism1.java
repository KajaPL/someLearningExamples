package Polymorphism;

public class Polymorphism1 {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        myAnimal.eat();

        Dog1 myDog = new Dog1();
        myDog.eat(3);

        Cat1 myCat = new Cat1();
        myCat.eat();
    }
}
