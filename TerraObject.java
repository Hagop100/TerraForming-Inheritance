package TerraForm;

public abstract class TerraObject {
    
    private String type;
    private String name;
    private int impactScore;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setImpactScore(int impactScore) {
        this.impactScore = impactScore;
    }

    public int getImpactScore() {
        return impactScore;
    }

    public String toString() {
        return getName() + ": " + getImpactScore();
    }
}
