public abstract class Employee {
    private double employeeCode;
    private String name;
    private int age;
    private String telephoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(double employeeCode, String name, int age, String telephoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    public double getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(double employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getSalary();
}
