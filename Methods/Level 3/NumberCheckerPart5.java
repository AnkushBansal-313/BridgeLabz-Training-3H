public class NumberCheckerPart5 {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int n = num, sum = 0;
        while (n > 0) {
            int d = n % 10, fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            n /= 10;
        }
        return sum == num;
    }
}
