package ClassObjectMethods;

import java.util.Scanner;

public class EmptyCashReceipt {
    static void receiptHeader (){
        System.out.println("\n\nCash receipt \n --- --- ---");
    }

    static void receiptCharged (String str1){
        System.out.println("Charged to: " + str1);
    }
    static void receiptBody (Double money1){
        System.out.println("To be paid: " + money1);
    }
    static void receiptReceived (String str2) {
        System.out.println("Received by: " + str2);
    }

    static void productName(){
        System.out.println("What you want to buy?");
    }
    static void yourName () {
        System.out.println("How is your name?");
    }
    static void money () {
        System.out.println("How much money you have (double)?");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        productName();
        String str1 = scanner.nextLine();
        yourName ();
        String str2 = scanner.nextLine();
        money ();
        Double money1 = scanner.nextDouble();

        receiptHeader ();
        receiptCharged(str1);
        receiptReceived(str2);
        receiptBody(money1);
    }
}
