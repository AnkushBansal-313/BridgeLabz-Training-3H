import java.util.Arrays;

public class FactorsProgram {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int v : arr) p *= v;
        return p;
    }

    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        return max;
    }

    public static double productOfCubes(int[] arr) {
        double p = 1;
        for (int v : arr) p *= Math.pow(v, 3);
        return p;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Greatest: " + greatestFactor(factors));
        System.out.println("Product of cubes: " + productOfCubes(factors));
    }
}
