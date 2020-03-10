package Entity;

import java.math.BigInteger;

public class Bob {

    private BigInteger p;
    private BigInteger q;
    private BigInteger r;
    private BigInteger publicKey;
    private BigInteger privateKey;
    private BigInteger modulus;


    public Bob() {
        this.publicKey = new BigInteger("32289489153281417294049366139");
        this.modulus = new BigInteger("50074083286257101883487656271");
    }

    public Bob(BigInteger privateKey, BigInteger p, BigInteger q, BigInteger r) {
        this.publicKey = new BigInteger("32289489153281417294049366139");
        this.modulus = new BigInteger("50074083286257101883487656271");
        this.privateKey = privateKey;
        this.p = p;
        this.q = q;
        this.r = r;
    }

    public Bob( BigInteger publicKey, BigInteger privateKey, BigInteger modulus, BigInteger p, BigInteger q, BigInteger r) {
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

    @Override
    public String toString() {
        return "Bob{" +
                ", publicKey=" + publicKey +
                ", privateKey=" + privateKey +
                ", modulus=" + modulus +
                ", p=" + p +
                ", q=" + q +
                ", r=" + r +
                '}';
    }
}
