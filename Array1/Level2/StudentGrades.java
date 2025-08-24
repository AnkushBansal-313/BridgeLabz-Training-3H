
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];      // physics, chemistry, maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + " marks: ");
                int m = sc.nextInt();

                if (m < 0) {
                    System.out.println("Marks cannot be negative. Enter again!");
                    j--; // repeat input for this subject
                    continue;
                }

                marks[i][j] = m;
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}

