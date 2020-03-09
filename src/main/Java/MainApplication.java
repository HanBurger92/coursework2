import Entity.Alice;
import Entity.Bob;

import java.math.BigInteger;

public class MainApplication {

    private Bob bob;
    private Alice alice;

    public static void main(String argsp[]){
        //String cipherText = "calculator";
        String cipherText = "3ir5xmqyv2025qlbai2";
        BigInteger encodedText = StringUtils.encode(cipherText);
        System.out.println(encodedText);
        System.out.println(StringUtils.decode(encodedText));

        Bob bob = new Bob();
        BigInteger bobP = bob.getPrivateKey();

        //BigInteger p = StringUtils.findDivisors(new BigInteger("70866393920932815076821817727"));
        //BigInteger q = new BigInteger("70866393920932815076821817727");

        // 66056083785421544972111685239
        BigInteger p = (new BigInteger("1276567567"));
        BigInteger q = new BigInteger("0");
        q = q.add(p);
        p = StringUtils.findDivisors(p);
        q = q.divide(p);
        System.out.println("another divisior is: " + q);



    }
}
