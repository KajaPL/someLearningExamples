package GetterSetter;


class Account1 {
    private String name;
    private int age;

    public static void main(String[] args) {
        Account1 a = new Account1();
        a.setName("Pablo");
        a.setAge(34);
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
