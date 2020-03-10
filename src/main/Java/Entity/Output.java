package Entity;

public class Output {

    private String srn;
    private String name;
    private Alice alice;
    private Bob bob;
    private String plainText;
    private String cipherText;

    public Output(String srn, String name, Alice alice, Bob bob, String plainText, String cipherText) {
        this.srn = srn;
        this.name = name;
        this.alice = alice;
        this.bob = bob;
        this.plainText = plainText;
        this.cipherText = cipherText;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public String getSrn() {
        return srn;
    }

    public void setSrn(String srn) {
        this.srn = srn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Alice getAlice() {
        return alice;
    }

    public void setAlice(Alice alice) {
        this.alice = alice;
    }

    public Bob getBob() {
        return bob;
    }

    public void setBob(Bob bob) {
        this.bob = bob;
    }

}

