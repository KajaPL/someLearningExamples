package Polymorphism;

public class Cat1 extends Animal1{
    private String litterPreference;

    public void eat() {
        System.out.println("nom nom nom");
    }
    public String getLitterPreference() {
        return litterPreference;
    }
    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
