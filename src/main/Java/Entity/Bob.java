package Entity;

import java.math.BigInteger;

public class Bob {

    private String name;
    private BigInteger publicKey;
    private BigInteger privateKey;
    private BigInteger modulus;
    private BigInteger p;
    private BigInteger q;
    private BigInteger r;

    public Bob() {
        this.name = "Bob";
        this.publicKey = new BigInteger("32289489153281417294049366139");
        this.modulus = new BigInteger("50074083286257101883487656271");
    }

    public Bob(BigInteger privateKey, BigInteger p, BigInteger q, BigInteger r) {
        this.name = "Bob";
        this.publicKey = new BigInteger("32289489153281417294049366139");
        this.modulus = new BigInteger("50074083286257101883487656271");
        this.privateKey = privateKey;
        this.p = p;
        this.q = q;
        this.r = r;
    }

    public Bob(String name, BigInteger publicKey, BigInteger privateKey, BigInteger modulus, BigInteger p, BigInteger q, BigInteger r) {
        this.name = name;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.modulus = modulus;
        this.p = p;
        this.q = q;
        this.r = r;
    }

    public BigInteger getP() {
        return p;
    }

    public void setP(BigInteger p) {
        this.p = p;
    }

    public BigInteger getQ() {
        return q;
    }

    public void setQ(BigInteger q) {
        this.q = q;
    }

    public BigInteger getR() {
        return r;
    }

    public void setR(BigInteger r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(BigInteger publicKey) {
        this.publicKey = publicKey;
    }

    public BigInteger getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(BigInteger privateKey) {
        this.privateKey = privateKey;
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public void setModulus(BigInteger modulus) {
        this.modulus = modulus;
    }
}
