package String;

public class ConvertingStrinBuilder {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        System.out.println("String is: " + s);
        System.out.println("Reverse string is: " + rev);
    }
}
