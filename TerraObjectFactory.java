package TerraForm;

import java.util.*;

public class TerraObjectFactory {

    private Planet planet;
    private int size;
    private Random rand;
    private double disW; // distribution of Water objects (percentage)
    private double disA; // distribution of Animal objects
    private double disM; // distribution of Mineral objects
    private double disP; // distribution of Plant objects
    private int amountWater, amountAnimal, amountMineral, amountPlant;
    private ArrayList<TerraObject> terraArray;


    public TerraObjectFactory(int size, double w, double a, double m, double p) {
        this.size = size;
        this.planet = new Planet(this.size);
        this.rand = new Random();
        this.disW = w/100; // decimal conversion
        this.disA = a/100;
        this.disM = m/100;
        this.disP = p/100;
    }
    
    public void terraCreator() {
        if (this.size == 1) {
            this.size = 200 + rand.nextInt(300);
            amountWater = (int)Math.floor(disW * this.size);
            amountAnimal = (int)Math.floor(disA * this.size);
            amountMineral = (int)Math.floor(disM * this.size);
            amountPlant = (int)Math.floor(disP * this.size);
            for (int i = 0; i < amountWater/4; i++) {
                this.planet.append(new Ocean());
                this.planet.append(new River());
                this.planet.append(new Lake());
                this.planet.append(new Pond());
            }
            for (int i = 0; i < amountAnimal/4; i++) {
                this.planet.append(new Tiger());
                this.planet.append(new Bee());
                this.planet.append(new Deer());
                this.planet.append(new Pigeon());
            }
            for (int i = 0; i < amountMineral/4; i++) {
                this.planet.append(new Oxygen());
                this.planet.append(new Coal());
                this.planet.append(new TopSoil());
                this.planet.append(new Iron());
            }
            for (int i = 0; i < amountPlant/4; i++) {
                this.planet.append(new AppleTree());
                this.planet.append(new Flower());
                this.planet.append(new Grass());
                this.planet.append(new Algae());
            }

        }
        else if (this.size == 2) {
            this.size = 501 + rand.nextInt(499);
            amountWater = (int)Math.floor(disW * this.size);
            amountAnimal = (int)Math.floor(disA * this.size);
            amountMineral = (int)Math.floor(disM * this.size);
            amountPlant = (int)Math.floor(disP * this.size);
            for (int i = 0; i < amountWater/4; i++) {
                planet.append(new Ocean());
                planet.append(new River());
                planet.append(new Lake());
                planet.append(new Pond());
            }
            for (int i = 0; i < amountAnimal/4; i++) {
                planet.append(new Tiger());
                planet.append(new Bee());
                planet.append(new Deer());
                planet.append(new Pigeon());
            }
            for (int i = 0; i < amountMineral/4; i++) {
                planet.append(new Oxygen());
                planet.append(new Coal());
                planet.append(new TopSoil());
                planet.append(new Iron());
            }
            for (int i = 0; i < amountPlant/4; i++) {
                planet.append(new AppleTree());
                planet.append(new Flower());
                planet.append(new Grass());
                planet.append(new Algae());
            }
        }
        else if (this.size == 3) {
            this.size = 1001 + rand.nextInt(499);
            amountWater = (int)Math.floor(disW * this.size);
            amountAnimal = (int)Math.floor(disA * this.size);
            amountMineral = (int)Math.floor(disM * this.size);
            amountPlant = (int)Math.floor(disP * this.size);
            for (int i = 0; i < amountWater/4; i++) {
                planet.append(new Ocean());
                planet.append(new River());
                planet.append(new Lake());
                planet.append(new Pond());
            }
            for (int i = 0; i < amountAnimal/4; i++) {
                planet.append(new Tiger());
                planet.append(new Bee());
                planet.append(new Deer());
                planet.append(new Pigeon());
            }
            for (int i = 0; i < amountMineral/4; i++) {
                planet.append(new Oxygen());
                planet.append(new Coal());
                planet.append(new TopSoil());
                planet.append(new Iron());
            }
            for (int i = 0; i < amountPlant/4; i++) {
                planet.append(new AppleTree());
                planet.append(new Flower());
                planet.append(new Grass());
                planet.append(new Algae());
            }
        }
        else if (this.size == 4) {
            this.size = 1501 + rand.nextInt(499);
            amountWater = (int)Math.floor(disW * this.size);
            amountAnimal = (int)Math.floor(disA * this.size);
            amountMineral = (int)Math.floor(disM * this.size);
            amountPlant = (int)Math.floor(disP * this.size);
            for (int i = 0; i < amountWater/4; i++) {
                planet.append(new Ocean());
                planet.append(new River());
                planet.append(new Lake());
                planet.append(new Pond());
            }
            for (int i = 0; i < amountAnimal/4; i++) {
                planet.append(new Tiger());
                planet.append(new Bee());
                planet.append(new Deer());
                planet.append(new Pigeon());
            }
            for (int i = 0; i < amountMineral/4; i++) {
                planet.append(new Oxygen());
                planet.append(new Coal());
                planet.append(new TopSoil());
                planet.append(new Iron());
            }
            for (int i = 0; i < amountPlant/4; i++) {
                planet.append(new AppleTree());
                planet.append(new Flower());
                planet.append(new Grass());
                planet.append(new Algae());
            }
        }
    }

    public ArrayList<TerraObject> getPlanetArrayList() {
        return planet.getArray();
    }

    public void setTerraArray() {
        this.terraArray = planet.getArray();
    }

    public int getTotalObjects() {
        return planet.getArray().size();
    }

    public int getImpactScore() {
        int total = 0;
        for (int i = 0; i < planet.getArray().size(); i++) {
            total = total + planet.getArray().get(i).getImpactScore();
        }
        return total;
    }

    
    public void displayWaterObjects() {
        if (amountWater != 0) {
            for (int i = 0; i < (amountWater/4)*4; i++) {
                System.out.println(this.terraArray.get(i));
            }
        }
        else {
            System.out.println("There are no Water Objects.");
        }
    }
    public void displayAnimalObjects() {
        if (amountAnimal != 0) {
            for (int i = (amountWater/4)*4; i < (amountAnimal/4)*4 + (amountWater/4)*4; i++) {
                System.out.println(this.terraArray.get(i));
            }
        }
        else {
            System.out.println("There are no Animal Objects.");
        }
    }
    public void displayMineralObjects() {
        if (amountMineral != 0) {
            for (int i = (amountAnimal/4)*4 + (amountWater/4)*4; i < (amountMineral/4)*4 + (amountAnimal/4)*4 + (amountWater/4)*4; i++) {
                System.out.println(this.terraArray.get(i));
            }
        }
        else {
            System.out.println("There are no Mineral Objects.");
        }
    }
    public void displayPlantObjects() {
        if (amountPlant != 0) {
            for (int i = (amountMineral/4)*4 + (amountAnimal/4)*4 + (amountWater/4)*4; i < planet.getArray().size(); i++) {
                System.out.println(this.terraArray.get(i));
            }
        }
        else {
            System.out.println("There are no Plant Objects.");
        }
    }
}
