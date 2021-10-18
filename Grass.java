package TerraForm;

import java.util.Random;

public class Grass extends PlantObject {
    
    private String grass = "Grass";
    private Random rand = new Random();
    private int impact = 50 + rand.nextInt(50);

    public Grass() {
        super();
        setName(grass);
        setImpactScore(impact);
    }
}
