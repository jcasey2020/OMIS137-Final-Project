public class Plant {
    //private String name, species, color;
    //private int size, growthRate;
    private int wateringFreq;
    private boolean alive;
    private int age;
    private int plantSize; //keeps track of how big plant is/number of grow cycles
    Insect predator;

    public Plant(){
            this.wateringFreq=2;
            this.alive=true;
            this.age=0;
            this.plantSize=0;
    }
    public int getWateringFreq(){
        return wateringFreq;
    }
    public void setWateringFreq(int wateringFreq){
        this.wateringFreq=wateringFreq;
    }
    public boolean isAlive(){
        return this.alive;
    }

    public int getAge(){
        return this.age;
    }

    public int getPlantSize(){
        return this.plantSize;
    }

    public void dayPassed(){
        age++;
    }

    public void passAway(){
        alive=false;
    }

    public void grow(){ //set to grow every three days
        if(getAge()%3==0 && isAlive()) {
            plantSize++;
        }
    }


   /* public Plant(String name, String species, String color, int size, int growthRate){
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

    */
}
