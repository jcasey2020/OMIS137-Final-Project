import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Garden {
    public int rows = 20;
    public int cols = 20;
    public String emptyImage = " ";
    public String[][] garden;
    public static ArrayList<Flower> flowers = new ArrayList<Flower>();

    public Garden() {
        garden = new String[rows][cols];
    }
    public void populateGarden() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                garden[row][col] = emptyImage; // set all cells to " " initially
            }
        }
    }

    public void AddFlowers() {
        System.out.print("Enter the number of flowers you would like to plant: ");
        Scanner flowerScanner = new Scanner(System.in);
        int flowerCount = flowerScanner.nextInt();
        System.out.print("Enter the row in which you would like to plant the flowers: ");
        int flowerRow = flowerScanner.nextInt();
        for (int i = 0; i < flowerCount; i++) {
            if(garden[flowerRow][i] == emptyImage) {
                garden[flowerRow][i] = "F";
            }
        }
    }


    public void printGarden() {
        System.out.println("Here is your garden!");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(garden[row][col] + " ");
            }
            System.out.println();
        }
    }


}
