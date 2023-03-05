public class Plant {
    private String name, species, color;
    private int size, growthRate;

    public Plant(){}

    public Plant(String name, String species, String color, int size, int growthRate){
        this.name = name;
        this.species = species;
        this.color = color;
        this.size = size;
        this.growthRate = growthRate;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public String getColor() {
        return color;
    }

    public int getSize(){
        return this.size;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    public void setName(String name){
       this.name = name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }
}
