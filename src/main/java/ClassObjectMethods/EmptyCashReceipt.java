package ClassObjectMethods;

import java.util.Scanner;

public class EmptyCashReceipt {
    static void receiptHeader (){
        System.out.println("\n\nCash receipt \n --- --- ---");
    }

    static void receiptCharged (String productName1){
        System.out.println("Charged to: " + productName1);
    }
    static void receiptBody (Double money1){
        System.out.println("To be paid: " + money1);
    }
    static void receiptReceived (String yourName2) {
        System.out.println("Received by: " + yourName2);
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
        String productName1 = scanner.nextLine();
        yourName ();
        String yourName2 = scanner.nextLine();
        money ();
        Double money1 = scanner.nextDouble();

        receiptHeader ();
        receiptCharged(productName1);
        receiptReceived(yourName2);
        receiptBody(money1);
    }
}
