package W3;

import java.util.Scanner;

public class methodWithIfElse {
    static void checkAge() {
        Scanner scanner = new Scanner(System.in);
        int ageConsole = Integer.parseInt(scanner.nextLine());

        if (ageConsole <= 18) {
            System.out.println("Oh, you can't buy gin!");
        } else {
            System.out.println("Ah, lets drink some pink gin!");
        }
    }

    public static void main(String[] args) {
        checkAge();
    }
}
