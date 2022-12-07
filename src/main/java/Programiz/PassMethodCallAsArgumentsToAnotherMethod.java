package Programiz;

class PassMethodCallAsArgumentsToAnotherMethod {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public void square(int num) {
        int result = num * num;
        System.out.println(result);
    }

    public static void main(String[] args) {
        PassMethodCallAsArgumentsToAnotherMethod newObj1 = new PassMethodCallAsArgumentsToAnotherMethod();
        newObj1.square(newObj1.add(15, 9));
    }
}
