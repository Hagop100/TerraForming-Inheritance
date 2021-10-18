package TerraForm;

import java.util.Random;

public class Iron extends MineralObject {
    
    private String iron = "Iron";
    private Random rand = new Random();
    private int impact = 70 + rand.nextInt(30);

    public Iron() {
        super();
        setName(iron);
        setImpactScore(impact);
    }
}
