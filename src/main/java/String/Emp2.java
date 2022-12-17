package String;

class Emp1{}
public class Emp2 {
    public static void main(String[] args) {
        Emp1 e = new Emp1();
        String s = e.toString();
        String s2 = String.valueOf(e);
        System.out.println(s);
        System.out.println(s2);
    }
}
