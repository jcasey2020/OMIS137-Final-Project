import java.util.concurrent.Flow;

public class Flower extends Plant {
    public Flower(){
        super();
        this.predator=new SpiderMite("spidermite","black",true, "Flower", Insect.Move.Fly);//or whatever we want flower predators to be
    }
    public Insect getPredators(){
        return this.predator;
    }
}
    /*
    private int numPetals;

    public Flower(){}

    public Flower(String name, String species, int size, String color, int growthRate, int numPetals){
        super.setName(name);
        super.setSpecies(species);
        super.setSize(size);
        super.setColor(color);
        super.setGrowthRate(growthRate);
        this.numPetals = numPetals;
    }

    public int getNumPetals(){
        return numPetals;
    }

    public void setNumPetals(int numPetals){
        this.numPetals = numPetals;
    }
    }


     */




