package TerraForm;

import java.util.Random;

public class Bee extends AnimalObject {
    
    private String bee = "Bee";
    private Random rand = new Random();
    private int impact = 20 + rand.nextInt(80);

    public Bee() {
        super();
        setName(bee);
        setImpactScore(impact);
    }

    
}
