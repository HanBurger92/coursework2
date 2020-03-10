import Entity.Alice;
import Entity.Bob;
import Entity.Output;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class MainApplication {

    public static void main(String args[]) throws IOException {
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

        // Decrypt the cipherText
        BigInteger encodedPlainText = encodedCipherText.modPow(bob.getPrivateKey(), bob.getModulus());
        String plainText = StringUtils.decode(encodedPlainText);

        // write to Json file
        Output output = new Output("170281490", "Bao  Han", alice, bob, plainText, cipherText);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter filepath = new FileWriter("C:\\Users\\Bao Han\\OneDrive\\桌面\\CO3326\\BaoHan_170281490_CO3326cw2.json");
        System.out.println(gson.toJson(output));
        gson.toJson(output, filepath);
        filepath.flush();
        filepath.close();

    }
}
