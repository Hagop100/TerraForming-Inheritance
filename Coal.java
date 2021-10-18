package TerraForm;

import java.util.Random;

public class Coal extends MineralObject {
    
    private String coal = "Coal";
    private Random rand = new Random();
    private int impact = rand.nextInt(-40 + 70) - 70;

    public Coal() {
        super();
        setName(coal);
        setImpactScore(impact);
    }
}
