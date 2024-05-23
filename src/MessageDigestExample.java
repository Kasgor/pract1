import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MessageDigestExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "Random123123312313";

        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        byte[] md5Hash = md5Digest.digest(input.getBytes());
        System.out.println("MD5 Hash: " + Arrays.toString(md5Hash));

        MessageDigest sha1Digest = MessageDigest.getInstance("SHA-1");
        byte[] sha1Hash = sha1Digest.digest(input.getBytes());
        System.out.println("SHA-1 Hash: " + Arrays.toString(sha1Hash));

        MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");
        byte[] sha256Hash = sha256Digest.digest(input.getBytes());
        System.out.println("SHA-256 Hash: " + Arrays.toString(sha256Hash));
    }
}