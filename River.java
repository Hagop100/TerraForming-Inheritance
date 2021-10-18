package TerraForm;

import java.util.Random;
public class River extends WaterObject {

    private String river = "River";
    private Random rand = new Random();
    private int impact = 20 + rand.nextInt(40);

    public River() {
        super();
        setName(river);
        setImpactScore(impact);
    }
}