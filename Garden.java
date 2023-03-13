public class Garden {
    public int rows = 20;
    public int cols = 20;
    public String emptyImage = "E";
    public String[][] garden;

    public Garden() {
        garden = new String[rows][cols];
    }
    public void populateGarden() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                garden[row][col] = emptyImage; // set all cells to ' ' initially
            }
        }
    }

    public void printGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(garden[row][col] + " ");
            }
            System.out.println();
        }
    }


}
