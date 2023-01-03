package Super;

class Vehicle2 {
    Vehicle2() {

        System.out.println("Vehicle constructor");
    }
}

class Car2 extends Vehicle2 {
    Car2() {
        System.out.println("Car constructor");
    }
}

class Main2 {
    public static void main(String[] args) {
        Car2 c = new Car2();

    }
}
