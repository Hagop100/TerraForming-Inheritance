package TerraForm;

import java.util.Random;

public class Ocean extends WaterObject {
    
    private String ocean = "Ocean";
    private Random rand = new Random();
    private int impact = 70 + rand.nextInt(30);

    public Ocean() {
        super();
        setName(ocean);
        setImpactScore(impact);
    }
}
