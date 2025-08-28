import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] basicSalary = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter basic salary of " + names[i] + ": ");
            basicSalary[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double hra = 0.20 * basicSalary[i];
            double da = 0.10 * basicSalary[i];
            double netSalary = basicSalary[i] + hra + da;

            if (netSalary > 50000) {
                double tax = 0.10 * netSalary;
                netSalary -= tax;
            }

            System.out.println("----- Salary Slip -----");
            System.out.println("Employee Name: " + names[i]);
            System.out.println("Basic Salary: " + basicSalary[i]);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Net Salary: " + netSalary);
            System.out.println("-----------------------\n");
        }
    }
}
