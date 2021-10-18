package TerraForm;

import java.util.Random;

public class Oxygen extends MineralObject {
    
    private String o2 = "Oxygen";
    private Random rand = new Random();
    private int impact = 90 + rand.nextInt(10);

    public Oxygen() {
        super();
        setName(o2);
        setImpactScore(impact);
    }
}
