package TerraForm;

import java.util.Random;

public class TopSoil extends MineralObject {
    
    private String soil = "Top Soil";
    private Random rand = new Random();
    private int impact = 30 + rand.nextInt(50);

    public TopSoil() {
        super();
        setName(soil);
        setImpactScore(impact);
    }
}
