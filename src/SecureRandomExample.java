import java.security.SecureRandom;
import java.util.Base64;

public class SecureRandomExample {
    public static void main(String[] args) {
        try {
            String input = "Random123123312313";

            SecureRandom secureRandom1 = SecureRandom.getInstance("SHA1PRNG");
            secureRandom1.nextBytes(input.getBytes());
            System.out.println( secureRandom1.nextLong());

            SecureRandom secureRandom2 = SecureRandom.getInstance("Windows-PRNG");
            secureRandom2.nextBytes(input.getBytes());
            System.out.println( secureRandom2.nextLong());

            SecureRandom secureRandom3 = SecureRandom.getInstanceStrong();
            secureRandom3.nextBytes(input.getBytes());
            System.out.println( secureRandom3.nextLong());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}