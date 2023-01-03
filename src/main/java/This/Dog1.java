package This;

public class Dog1 {
    private String name;
    private int age;

    public Dog1() {
        this("Fido", 1);
    }
    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
