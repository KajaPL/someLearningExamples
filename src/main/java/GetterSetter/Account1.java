package GetterSetter;

public class Account1 {
    String name;
    int age;

    public static void main(String[] args) {
        Account1 a = new Account1();
        a.setName("Pablo");
        a.setAge(34);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.printDetails();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println(getName() + " , " + getAge());
    }
}
