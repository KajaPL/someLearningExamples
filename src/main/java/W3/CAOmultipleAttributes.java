package W3;

public class CAOmultipleAttributes {
    String name = "Kaja";
    String country = "PL";
    int age = 34;

    public static void main(String[] args) {
        CAOmultipleAttributes newObj1 = new CAOmultipleAttributes();
        System.out.println("My name is " + newObj1.name + ". I come from: " + newObj1.country + ". I'm " + newObj1.age + " old.");
    }
}
