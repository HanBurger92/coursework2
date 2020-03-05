import java.math.BigInteger;

public class StringUtils {

    public static BigInteger encode(String text){
        return new BigInteger(text, Character.MAX_RADIX);
    }

    public static String decode(final BigInteger number){
        return number.toString(Character.MAX_RADIX);
    }

    public static BigInteger findDivisors(int modulus){
        int
    }
}
