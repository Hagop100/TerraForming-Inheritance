package TerraForm;

import java.util.Random;
public class Pond extends WaterObject {
    
    private String pond = "Pond";
    private Random rand = new Random();
    private int impact = 0 + rand.nextInt(20);

    public Pond() {
        super();
        setName(pond);
        setImpactScore(impact);
    }
}
