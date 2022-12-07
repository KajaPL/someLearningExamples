package Programiz;

class CalculateExecutionTimeOfMethods {
    public void display(){
        System.out.println("Calculating Method execution time");
    }

    public static void main(String[] args) {
        CalculateExecutionTimeOfMethods newObj1 = new CalculateExecutionTimeOfMethods();
        long start = System.nanoTime();
        newObj1.display();
        long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds.");
    }
}
