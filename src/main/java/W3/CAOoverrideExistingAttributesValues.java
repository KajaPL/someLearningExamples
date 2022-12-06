package W3;

public class CAOoverrideExistingAttributesValues {
    int x = 10;
    String name = "Kaja";

    public static void main(String[] args) {
        CAOoverrideExistingAttributesValues newObj1 = new CAOoverrideExistingAttributesValues();
        newObj1.x = 35;
        newObj1.name = "Mamacita";
        System.out.println(newObj1.x);
        System.out.println(newObj1.name);
    }
}
