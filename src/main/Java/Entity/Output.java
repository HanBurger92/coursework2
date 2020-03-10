package Entity;

public class Output {

    private String srn;
    private String name;
    private Alice alice;
    private Bob bob;

    public Output(String srn, String name, Alice alice, Bob bob) {
        this.srn = srn;
        this.name = name;
        this.alice = alice;
        this.bob = bob;
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

