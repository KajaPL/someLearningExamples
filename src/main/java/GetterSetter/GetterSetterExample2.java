package GetterSetter;

class Employee {
    private int eId;
    private String eName;
    private String eDesignation;
    private String eCompany;

    public int geteId() {
        return eId;
    }

    public void seteId(final int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(final String eName) {
        if (eName == null || eName.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.eName = eName;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    public void seteDesignation(final String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public String geteCompany() {
        return eCompany;
    }

    public void seteCompany(final String eCompany) {
        this.eCompany = eCompany;
    }

    @Override
    public String toString() {
        return "Emplyee: [id= " + geteId()
                + " name = " + geteName()
                + ", designation = " + geteDesignation()
                + ", company = " + geteCompany() + "]";
    }
}
    public class GetterSetterExample2
    {
        public static void main(String[] args)
        {
            final  Employee emp = new Employee();
            emp.seteId(107);
            emp.seteName("Kathy");
            emp.seteDesignation("Software Tester");
            emp.seteCompany("XYZ Corpo");
            System.out.println(emp.toString());
        }
    }

