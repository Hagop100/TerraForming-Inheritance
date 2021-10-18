package TerraForm;

import java.util.Random;

public class Lake extends WaterObject {
    
    private String lake = "Lake";
    private Random rand = new Random();
    private int impact = 30 + rand.nextInt(30);

    public Lake() {
        super();
        setName(lake);
        setImpactScore(impact);
    }
}
