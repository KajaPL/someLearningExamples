package Polymorphism;

public class Dog1 extends Animal1 {
    private int breed;
    public void eat() {
        System.out.println("chomp chomp");
    }
    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("chomp chomp");
        }

    }
    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
