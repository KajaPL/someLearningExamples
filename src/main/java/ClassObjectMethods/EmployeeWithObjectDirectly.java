package ClassObjectMethods;

public class EmployeeWithObjectDirectly {
int empid;
String empname;
int salary;
int deptno;
//class

void display()
{
    System.out.println(empid);
    System.out.println(empname);
    System.out.println(salary);
    System.out.println(deptno);
    //method
}

    public static void main(String[] args) {
    //object
        EmployeeWithObjectDirectly emp1 = new EmployeeWithObjectDirectly();
        emp1.empid=101;
        emp1.empname="Kaja";
        emp1.salary=20000;
        emp1.deptno=10;
        emp1.display();

//this is an object of another emplyee
        EmployeeWithObjectDirectly emp2 = new EmployeeWithObjectDirectly();
        emp2.empid=102;
        emp2.empname="Didi";
        emp2.salary=30000;
        emp2.deptno=20;
        emp2.display();
    }

        }