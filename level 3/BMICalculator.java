import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        
        String[][] results = calculateBMIResults(data);
        displayResults(results);
    }
    
    public static String[][] calculateBMIResults(double[][] data) {
        String[][] results = new String[data.length][4];
        
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100;
            double bmi = data[i][0] / (heightM * heightM);
            String status = getBMIStatus(bmi);
            
            results[i][0] = String.valueOf(data[i][1]);
            results[i][1] = String.valueOf(data[i][0]);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        
        return results;
    }
    
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
    
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Results:");
        System.out.println("Height\tWeight\tBMI\tStatus");
        System.out.println("-----------------------------");
        for (String[] row : results) {
            System.out.println(row[0] + "cm\t" + row[1] + "kg\t" + row[2] + "\t" + row[3]);
        }
    }
}