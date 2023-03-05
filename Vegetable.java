public class Vegetable extends Plant{
    private String type;
    //eg. species would be "Potato", type would be "Yukon"

    private boolean edible, inGround;
    //eg. are the veggies edible yet? yes or no
    //eg. are the veggies grown in soil or no

    public Vegetable(String name, String species, int size, String color, int growthRate, String type, boolean edible, boolean inGround){
        super.setName(name);
        super.setSpecies(species);
        super.setSize(size);
        super.setColor(color);
        super.setGrowthRate(growthRate);
        this.type = type;
        this.edible = edible;
        this.inGround = inGround;
    }

    public String getType(){
        return this.type;
    }

    public boolean isEdible() {
        return edible;
    }

    public boolean isInGround() {
        return inGround;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public void setInGround(boolean inGround){
        this.inGround = inGround;
    }
}
