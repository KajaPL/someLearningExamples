package String;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "Argos";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
