public class EmployeeFullTime extends Employee {
    private double bonus;
    private double fine;
    private double hardSalary;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(double bonus, double fine, double hardSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public EmployeeFullTime(double employeeCode, String name, int age, String telephoneNumber, String email, double bonus, double fine, double hardSalary) {
        super(employeeCode, name, age, telephoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public double getSalary() {
        return hardSalary + (bonus - fine);
    }
}
