package GetterSetter;

public class GettetSetterExample {
    private int salary;
    //a setter method that assign a value to the salary variable
    void setSalary(int s)
    {
        if (s < 0) {
            s = -s;
        }
        this.salary = s;
    }
    //a getter method to retrieve the salary
    int getSalary() {
        return this.salary;
    }
    public int storeSalaryDB(int salary)
    {
        System.out.println("The ");
        return salary;
    }

    public static void main(String[] args) {
        GettetSetterExample obj = new GettetSetterExample();
        obj.setSalary(-50000);
        int salary = obj.getSalary();
        obj.storeSalaryDB(salary);
    }
}
