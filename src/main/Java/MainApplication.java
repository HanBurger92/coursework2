import Entity.Alice;
import Entity.Bob;

import java.math.BigInteger;

public class MainApplication {

    public static void main(String args[]){
        // initialisation
        String cipherText = "3ir5xmqyv2025qlbai2";
        BigInteger encodedCipherText = StringUtils.encode(cipherText);
        Alice alice = new Alice();
        Bob bob = new Bob();
        BigInteger one = new BigInteger("1");

        // Factorisation - bob
        BigInteger modulus = bob.getModulus();
        BigInteger p = StringUtils.findDivisors(modulus);
        BigInteger q = modulus.divide(p);
        System.out.println("another divisior is: " + q);

        // PrivateKey computation - bob
        bob.setP(p);
        bob.setQ(q);
        bob.setR(p.subtract(one).multiply
                (q.subtract(one))); // r = (p-1)*(q-1)
        bob.setPrivateKey(StringUtils.findInverse(bob.getPublicKey(),bob.getR())); // e(publicKey) * d(privateKey) = 1 mod r

        System.out.println(bob.toString()); //todo: delete after test is done

        // Factorisation - Alice
        BigInteger modulusAlice = alice.getModulus();
        BigInteger pAlice = StringUtils.findDivisors(modulusAlice);
        BigInteger qAlice = modulus.divide(pAlice);
        System.out.println("another divisior is: " + qAlice);

        // PrivateKey computation - Alice
        alice.setP(pAlice);
        alice.setQ(qAlice);
        alice.setR(pAlice.subtract(one).multiply
                (qAlice.subtract(one))); // r = (p-1)*(q-1)
        alice.setPrivateKey(StringUtils.findInverse(alice.getPublicKey(),alice.getR())); // e(publicKey) * d(privateKey) = 1 mod r

        System.out.println(alice.toString()); //todo: delete after test is done

        BigInteger encodedPlainText = encodedCipherText.modPow(bob.getPrivateKey(), bob.getModulus());
        String plainText = StringUtils.decode(encodedPlainText);
        System.out.println(bob.getP().multiply(bob.getQ()));
        System.out.println("Decrption is done, word is: " + plainText);
    }
}
