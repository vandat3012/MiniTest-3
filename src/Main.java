import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new EmployeeFullTime(1, "a", 18, "091", "a@gmail", 1000000, 200000, 5000000);
        employee[1] = new EmployeeFullTime(2, "b", 19, "092", "b@gmail", 1100000, 200000, 5000000);
        employee[2] = new EmployeeFullTime(3, "c", 20, "093", "c@gmail", 1200000, 200000, 5000000);
        employee[3] = new EmployeeFullTime(4, "d", 21, "094", "d@gmail", 1300000, 200000, 5000000);
        employee[4] = new EmployeeFullTime(5, "e", 22, "095", "e@gmail", 1400000, 200000, 5000000);
        employee[5] = new EmployeePartTime(6, "f", 23, "096", "f@gmail", 20);
        employee[6] = new EmployeePartTime(7, "g", 24, "097", "g@gmail", 19);
        employee[7] = new EmployeePartTime(8, "h", 25, "098", "h@gmail", 18);
        employee[8] = new EmployeePartTime(9, "i", 26, "099", "i@gmail", 17);
        employee[9] = new EmployeePartTime(10, "k", 27, "000", "k@gmail", 16);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Tính lương trung bình nhân viên công ty");
        System.out.println("2. Tính lương trung bình nhân viên fulltime ");
        System.out.println("3. Tính lương trung bình nhân viên parttime ");
        System.out.println("4. Tính tổng lương phải trả cho nhân viên parttime");
        System.out.println("5. Đếm số người có mức lương cao hơn mức lương trung bình toàn công ty");
        System.out.println("6. Đếm số nhân viên partime có tên được nhập vào từ bàn phím");
        System.out.println("0. Exit");
        System.out.println("The number you want to choice :");
        int choice = scanner.nextInt();


        switch (choice) {
            case 0:
                System.exit(0);
            case 1:
                double average = getAverage(employee);
                System.out.println("Lương trung bình nhân viên công ty là :" + average);
                break;
            case 2:
                double avgFullTime = getAverageFullTime(employee);
                System.out.println("Lương trung bình nhân viên fulltime là : " + avgFullTime);
                break;
            case 3:
                double avgPartTime = getAveragePartTime(employee);
                System.out.println("Lương trung bình nhân viên parttime là : " + avgPartTime);
                break;
            case 4:
                double total = getTotalPartTime(employee);
                System.out.println("Tổng lương phải trả cho nhân viên parttime là : " + total);
                break;
            case 5:
                int count1 = getCountEmployee(employee);
                System.out.println("Số người có mức lương cao hơn mức lương trung bình toàn công ty là :" + count1);
                break;
            case 6:
                System.out.println("Tên nhân viên parttime la :");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.nextLine();
                int countName = getCount(employee, name);
                System.out.println("Số nhân viên partime có tên được nhập vào từ bàn phím là : " + countName);
                break;
        }
    }

    private static double getAverage(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            total += employees.getSalary();
            count++;
        }
        return total / count;
    }

    private static double getAverageFullTime(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            if (employees instanceof EmployeeFullTime)
                total += employees.getSalary();
            count++;
        }
        return total / count;
    }

    private static double getAveragePartTime(Employee[] employee) {
        double total = 0;
        int count = 0;
        for (Employee employees : employee) {
            if (employees instanceof EmployeePartTime) {
                total += employees.getSalary();
                count++;
            }
        }
        return total / count;
    }

    private static double getTotalPartTime(Employee[] employee) {
        double total = 0;
        for (Employee employees : employee) {
            if (employees instanceof EmployeePartTime) {
                total += employees.getSalary();
            }
        }
        return total;
    }


    private static int getCountEmployee(Employee[] employee) {
        int count = 0;
        for (Employee employees : employee) {
            if (employees.getSalary() > getAverage(employee))
                count++;
        }
        return count;
    }

    private static int getCount(Employee[] employee, String name) {
        int count = 0;
        for (Employee employees : employee) {
            if (employees instanceof EmployeePartTime && employees.getName().equals(name))
                count++;
        }
        return count;
    }


}
