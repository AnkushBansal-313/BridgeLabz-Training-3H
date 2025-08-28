import java.util.Random;
import java.util.Scanner;

public class StudentMarks {
    static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + r.nextInt(61);
            scores[i][1] = 40 + r.nextInt(61);
            scores[i][2] = 40 + r.nextInt(61);
        }
        return scores;
    }

    static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = Math.round((avg));
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = perc;
        }
        return stats;
    }

    static void display(int[][] scores, double[][] stats) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t% \tGrade");
        for (int i = 0; i < scores.length; i++) {
            String grade = "R";
            double p = stats[i][2];
            if (p >= 80) grade = "A";
            else if (p >= 70) grade = "B";
            else if (p >= 60) grade = "C";
            else if (p >= 50) grade = "D";
            else if (p >= 40) grade = "E";
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.0f\t%s\n", i + 1, scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        display(scores, stats);
    }
}
