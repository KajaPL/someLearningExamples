package Super;

class Vehicle1 {
    //superclass
    int maxSpeed = 120;
}

class Car extends Vehicle1 {
    //subclass
    int maxSpeed = 100;
    public void display() {
        System.out.println(super.maxSpeed);
    }

}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
