package TerraForm;

import java.util.Random;

public class Algae extends PlantObject {
    
    private String algae = "Algae";
    private Random rand = new Random();
    private int impact = 20 + rand.nextInt(50);

    public Algae() {
        super();
        setName(algae);
        setImpactScore(impact);
    }
}
