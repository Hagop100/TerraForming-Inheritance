package TerraForm;

import java.util.Random;

public class Tiger extends AnimalObject {
    
    private String tiger = "Tiger";
    private Random rand = new Random();
    private int impact = rand.nextInt(-30 + 90) - 90;

    public Tiger() {
        super();
        setName(tiger);
        setImpactScore(impact);
    }
}
