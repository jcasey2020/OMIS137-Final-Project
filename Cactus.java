public class Cactus extends Plant{
    private int numArms;

    public Cactus(String name, String species, int size, String color, int growthRate, int numArms){
        super.setName(name);
        super.setSpecies(species);
        super.setSize(size);
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
