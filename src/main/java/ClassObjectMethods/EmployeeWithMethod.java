package ClassObjectMethods;

public class EmployeeWithMethod {
    int empid;
    String empname;
    int salary;
    int deptno;
    //class

    void setdata(int id, String name, int sal, int dno) {
        empid=id;
        empname=name;
        salary=sal;
        deptno=dno;
        //method
    }

    void display (){
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptno);
        //method
    }

    public static void main(String[] args) {
        EmployeeWithMethod emp1 = new EmployeeWithMethod();
        emp1.setdata(101, "Kaja", 20000, 10);
        emp1.display();
    }

}
