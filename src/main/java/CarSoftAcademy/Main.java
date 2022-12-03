package CarSoftAcademy;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 21;
        p.name ="Mary";
        p.gender = "Female";

        Car c = new Car();
        c.brand = "Audi";
        c.model = "A4";
        c.year = 2004;
        c.power  = 180;
        c.owner = p;

        System.out.println(c.owner.name.toUpperCase());
    }
}
