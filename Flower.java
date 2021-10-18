package TerraForm;

import java.util.Random;

public class Flower extends PlantObject{
    
    private String flower = "Flower";
    private Random rand = new Random();
    private int impact = 20 + rand.nextInt(30);

    public Flower() {
        super();
        setName(flower);
        setImpactScore(impact);
    }
}
