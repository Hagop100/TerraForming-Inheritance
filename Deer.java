package TerraForm;

import java.util.Random;

public class Deer extends AnimalObject {
    
    private String deer = "Deer";
    private Random rand = new Random();
    private int impact = rand.nextInt(-10 + 30) - 30;

    public Deer() {
        super();
        setName(deer);
        setImpactScore(impact);
    }
}
