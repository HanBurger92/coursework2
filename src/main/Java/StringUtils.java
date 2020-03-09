import java.math.BigInteger;

public class StringUtils {

    public static BigInteger encode(String text){
        return new BigInteger(text, Character.MAX_RADIX);
    }

    public static String decode(final BigInteger number){
        return number.toString(Character.MAX_RADIX);
    }

    // Pollards Rho Algorithm
    public static BigInteger findDivisors(BigInteger modulus){
        BigInteger x = new BigInteger("2");
        BigInteger y = new BigInteger("2");
        BigInteger d = new BigInteger("1"); // d = factor
        BigInteger one = new BigInteger("1");

        while(d.equals(one)){
            x = g(x, modulus);
            y = g(g(y,modulus), modulus);
            d = gcd((x.subtract(y)), modulus);
        }
        if (d.equals(modulus)) {
            System.out.println("Cannot calculate GCD for this element");
            return d;
        } else {
            System.out.println("One of the divisors of given number is "+ d);
            return d;
        }
    }

    public static BigInteger g(BigInteger x, BigInteger modulus){
        return ((x.multiply(x)).subtract(new BigInteger("1"))).mod(modulus);
    }

    public static BigInteger gcd(BigInteger x, BigInteger y){
        BigInteger gcd = new BigInteger("0");
        BigInteger i = new BigInteger("1");
        BigInteger increment = new BigInteger("1");
        BigInteger zero = new BigInteger("0");

        while(i.compareTo(x) ==-1 || i.compareTo(x) ==0   ||   i.compareTo(y) ==-1 || i.compareTo(y) ==0){
            if (x.mod(i).equals(zero) && y.mod(i).equals(zero)) gcd = i;
            i = i.add(increment);
        }
        return gcd;
    }
    // end of Pollards Rho Algorithm
}
