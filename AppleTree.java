package TerraForm;

import java.util.Random;

public class AppleTree extends PlantObject {
    
    private String apple = "Apple Tree";
    private Random rand = new Random();
    private int impact = 30 + rand.nextInt(50);

    public AppleTree() {
        super();
        setName(apple);
        setImpactScore(impact);
    }
}
