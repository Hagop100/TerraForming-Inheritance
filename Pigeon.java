package TerraForm;

import java.util.Random;

public class Pigeon extends AnimalObject {

    private String pigeon = "Pigeon";
    private Random rand = new Random();
    private int impact = rand.nextInt(-30 + 100) - 100;

    public Pigeon() {
        super();
        setName(pigeon);
        setImpactScore(impact);
    }
}