package W3;

public class CAOcreateClassConstructor {
    int x;
    public CAOcreateClassConstructor(){
        x = 5;
    }

    public static void main(String[] args) {
        CAOcreateClassConstructor newObject1 = new CAOcreateClassConstructor();
        System.out.println(newObject1.x);
    }
}
