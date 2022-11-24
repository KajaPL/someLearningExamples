package Arrays;

public class ArrayNull {
private static void LengthOfArray(String[] array){
    if (array == null) {
        System.out.println("Array is empty, length can't be determined");
    } else{
        int arrayLength = array.length;
        System.out.println("Length is " + arrayLength);
    }
}

    public static void main(String[] args) {
        String[] fruits = {"Truskawka", "Mango", "Mandarynki", "Jabłka", "Malinki", "Arbuz"};
        String[] alphabets = {"k", "a", "j", "a", "m"};
        String[] numbers = {"12", "25", "63", "84", "90", "11", "54"};
        LengthOfArray(null);
        LengthOfArray(fruits);
        LengthOfArray(alphabets);
        LengthOfArray(numbers);
    }
}
