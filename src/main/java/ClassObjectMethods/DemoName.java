package ClassObjectMethods;

import java.util.Scanner;

public class DemoName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello " + name.toUpperCase());
    }
}
