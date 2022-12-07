package W3;

public class CAOaccessClassMethodsWithAnObject {
    public void infiniti() {
        System.out.println("The car is really fast on the road to Elkhovo!");
    }
    public void infinitiSpeed(int maxSpeed){
        System.out.println("Max speed is " + maxSpeed);
    }

    public static void main(String[] args) {
        CAOaccessClassMethodsWithAnObject mitkoCar = new CAOaccessClassMethodsWithAnObject();
        mitkoCar.infiniti();
        mitkoCar.infinitiSpeed(200);
    }
}
