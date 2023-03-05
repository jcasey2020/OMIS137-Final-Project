public class Bee extends Insect {
    private String plantType;
    private Move moveType = Move.Fly;

    public Bee(String species, String color, boolean canFly, String plantType, Move moveType) {
        super(species, color, canFly);
        this.plantType = plantType;
        this.moveType = moveType;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType() {
        this.plantType = plantType;
    }

    public void pollinateFlower() {
        System.out.println("The bee is pollinating a " + plantType + " flower.");
        // Pollination code goes here
    }
}
