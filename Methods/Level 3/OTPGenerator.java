import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        for (int otp : otps) System.out.println(otp);
        System.out.println("Unique: " + areUnique(otps));
    }
}
