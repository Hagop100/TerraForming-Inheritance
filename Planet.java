package TerraForm;

import java.util.*;

public class Planet {
    
    private ArrayList<TerraObject> arr = new ArrayList<TerraObject>();
    private int size; //1: small, 2: medium, 3: large, 4: x-large

    public Planet(int size) {
        this.size = size;
    }

    public void append(TerraObject t) {
        this.arr.add(t);
    }

    public ArrayList<TerraObject> getArray() {
        return this.arr;
    }

    public int getSize() {
        return this.size;
    }
}
