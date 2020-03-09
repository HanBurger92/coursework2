package Entity;

import java.math.BigInteger;

public class Alice {

    private String name;
    private BigInteger publicKey;
    private BigInteger privateKey;
    private BigInteger modulus;
    private BigInteger p;
    private BigInteger q;
    private BigInteger r;

    public Alice() {
        this.name = "Alice";
        this.publicKey = new BigInteger("23942147910524820274037347579");
        this.modulus = new BigInteger("70866393920932815076821817727");
    }

    public Alice(BigInteger privateKey, BigInteger p, BigInteger q, BigInteger r) {
        this.name = "Alice";
        this.publicKey = new BigInteger("23942147910524820274037347579");
        this.modulus = new BigInteger("70866393920932815076821817727");
        this.privateKey = privateKey;
        this.p = p;
        this.q = q;
        this.r = r;
    }

    public Alice(String name, BigInteger publicKey, BigInteger privateKey, BigInteger modulus, BigInteger p, BigInteger q, BigInteger r) {
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
