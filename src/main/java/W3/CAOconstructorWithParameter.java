package W3;

public class CAOconstructorWithParameter {
    int manufacturedYear;
    String carName;

    public CAOconstructorWithParameter(int year, String name) {
        manufacturedYear = year;
        carName = name;
    }

    public static void main(String[] args) {
        CAOconstructorWithParameter ourCars = new CAOconstructorWithParameter(2015, "Infiniti");
        System.out.println(ourCars.manufacturedYear + " " + ourCars.carName);
    }
}
