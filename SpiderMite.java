public class SpiderMite extends Insect {
    private String plantFood;
    private Move moveType = Move.Crawl;

    public SpiderMite(String species, String color, boolean canFly, String plantType, Move moveType) {
        super(species, color, canFly);
        this.plantFood = plantType;
        this.moveType = moveType;
    }

    public String getPlantType() {
        return plantFood;
    }

    public void setPlantType() {
        this.plantFood = plantFood;
    }

    public void EatPlant() {
        System.out.println("The spider mite is eating a " + plantFood + " plant.");
        // Eating code goes here
    }
}
