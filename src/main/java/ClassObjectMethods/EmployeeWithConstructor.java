package ClassObjectMethods;

public class EmployeeWithConstructor {
    int empid;
    String empname;
    int salary;
    int deptno;

    EmployeeWithConstructor(int id, String name, int sal, int dno) {
        empid = id;
        empname = name;
        salary = sal;
        deptno = dno;
    }
    void display () {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptno);
    }

    public static void main(String[] args) {
         EmployeeWithConstructor emp1 = new EmployeeWithConstructor(101, "Kaja", 20000, 10);
         emp1.display();
         EmployeeWithConstructor emp2 = new EmployeeWithConstructor(102, "Didi", 30000, 20);
         emp2.display();
         //constructor
    }

}
