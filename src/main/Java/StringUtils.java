import java.math.BigInteger;

public class StringUtils {

    public static BigInteger encode(final String text){
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
            d = (x.subtract(y)).gcd(modulus);
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
    // end of Pollards Rho Algorithm

    public static BigInteger findInverse(BigInteger a, BigInteger b){
        BigInteger store = a;
        BigInteger temp;
        BigInteger q;
        BigInteger sign = new BigInteger("1");
        BigInteger r = new BigInteger("1");
        BigInteger s = new BigInteger("0");
        while(!b.equals(new BigInteger("0"))){
            q = a.divide(b);
            temp = r;
            r = temp.multiply(q).add(r);
            s = temp;
            temp = b;
            b = a.subtract(q.multiply(temp));
            a = temp;
            sign = sign.negate();
        }
        BigInteger answer = (r.subtract(sign.multiply(s)).mod(store)); // answer = (r-(sign*s))%store
        return answer;
    }
}
