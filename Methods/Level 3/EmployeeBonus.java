import java.util.Random;

public class EmployeeBonus {
    static int[][] generateData() {
        int[][] data = new int[10][2];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + r.nextInt(90000);
            data[i][1] = r.nextInt(11);
        }
        return data;
    }

    static double[][] calculateNewSalaries(int[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? 0.05 : 0.02;
            result[i][0] = data[i][0] + data[i][0] * bonus;
            result[i][1] = data[i][0] * bonus;
        }
        return result;
    }

    static void display(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, data[i][0], data[i][1], result[i][0], result[i][1]);
            totalOld += data[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];
        }
        System.out.printf("Total\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int[][] data = generateData();
        double[][] result = calculateNewSalaries(data);
        display(data, result);
    }
}
