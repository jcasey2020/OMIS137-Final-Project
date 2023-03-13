import java.util.ArrayList;

public class Cactus extends Plant{
    private int numArms;
    public static ArrayList<Cactus> cacti = new ArrayList<>();

    public Cactus(String name, String species, int size, String color, int growthRate, int numArms){
        super.setName(name);
        super.setSpecies(species);
        super.setPlantSize(size);
        super.setColor(color);
        super.setGrowthRate(growthRate);
        this.numArms = numArms;
    }

    public int getNumArms() {
        return numArms;
    }

    public void setNumArms(int numArms) {
        this.numArms = numArms;
    }
}
