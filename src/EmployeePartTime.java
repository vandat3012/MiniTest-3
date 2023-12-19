public class EmployeePartTime extends Employee {
    private double numberWorkTime;

    public EmployeePartTime() {
    }

    public EmployeePartTime(double numberWorkTime) {
        this.numberWorkTime = numberWorkTime;
    }

    public EmployeePartTime(double employeeCode, String name, int age, String telephoneNumber, String email, double numberWorkTime) {
        super(employeeCode, name, age, telephoneNumber, email);
        this.numberWorkTime = numberWorkTime;
    }

    public double getNumberWorkTime() {
        return numberWorkTime;
    }

    public void setNumberWorkTime(double numberWorkTime) {
        this.numberWorkTime = numberWorkTime;
    }

    @Override
    public double getSalary() {
        return numberWorkTime * 100000;
    }
}
