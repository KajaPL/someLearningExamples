package Arrays;

public class ArrayReplaceElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Before: " + arr[2]);
        arr[2] = 9;
        System.out.println("After: " +arr[2]);

        String[] cars = {"Infiniti", "bmv", "Bus", "Mazda"};
        System.out.println(cars[2]);
        cars[2] = "Opel";
        System.out.println(cars[2]);
        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
