package Constructor;

class DefaultConstructorDisplayDefaultValues {
    int id;
    String name;
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        DefaultConstructorDisplayDefaultValues a1 = new DefaultConstructorDisplayDefaultValues();
        DefaultConstructorDisplayDefaultValues a2 = new DefaultConstructorDisplayDefaultValues();
        a1.display();
        a2.display();
    }
    /*Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor.
    Here 0 and null values are provided by default constructor.*/
}
