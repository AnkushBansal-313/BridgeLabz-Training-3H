package JavaConstructer.Level1;

class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + getSalary() + ", Team Size: " + teamSize);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee("EMP101", "IT", 5000);
        e1.displayEmployeeDetails();
        e1.setSalary(5500);
        System.out.println("Updated Salary: $" + e1.getSalary());

        Manager m1 = new Manager("EMP202", "HR", 7000, 10);
        m1.displayManagerDetails();
    }
}
