import java.util.Random;

public class FootballTeamHeights {
    public static int[] generateHeights(int n) {
        Random rand = new Random();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) heights[i] = rand.nextInt(101) + 150;
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int val : arr) s += val;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + mean(heights));
    }
}
