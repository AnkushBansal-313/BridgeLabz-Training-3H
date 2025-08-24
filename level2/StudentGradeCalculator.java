import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        int[][] scores = generateScores(numStudents);
        double[][] calculations = calculateResults(scores);
        String[][] grades = calculateGrades(calculations);
        
        displayScorecard(scores, calculations, grades);
    }
    
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60;
            scores[i][1] = random.nextInt(41) + 60;
            scores[i][2] = random.nextInt(41) + 60;
        }
        
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }
    
    public static String[][] calculateGrades(double[][] calculations) {
        String[][] grades = new String[calculations.length][2];
        
        for (int i = 0; i < calculations.length; i++) {
            double percentage = calculations[i][2];
            String grade;
            String remarks;
            
            if (percentage >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Level 1 -, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }
            
            grades[i][0] = grade;
            grades[i][1] = remarks;
        }
        
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] calculations, String[][] grades) {
        System.out.println("\nStudent Scorecard");
        System.out.println("==================================================================================================");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("==================================================================================================");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\t\t%s\t%s%n",
                i + 1,
                scores[i][0],
                scores[i][1],
                scores[i][2],
                (int)calculations[i][0],
                calculations[i][1],
                calculations[i][2],
                grades[i][0],
                grades[i][1]
            );
        }
        
        System.out.println("==================================================================================================");
    }
}