package Programiz;

class CallOneConstructorFromAnother {
    int sum;

    CallOneConstructorFromAnother() {
        this(5, 2);
    }

    CallOneConstructorFromAnother(int arg1, int arg2) {
        this.sum = arg1 + arg2;
    }

    void display() {
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        CallOneConstructorFromAnother newObj1 = new CallOneConstructorFromAnother();
        newObj1.display();
    }

}
