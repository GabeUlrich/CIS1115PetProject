package listpackage;

import java.util.Scanner;
import utilities.Prompt;

/**
 *
 * @author 55jphillip
 */
public class PetAppMenu {

    Scanner sc = new Scanner(System.in);
    PetList data = new PetList();

    public PetAppMenu() {
        menuLoop();
    }

    private void menuLoop() {
        int choice = 1;
        int id;
        String species;
        double price;

        while (choice != 0) {
            System.out.println("\nPet App");
            System.out.println("0 = Quit");
            System.out.println("1 = Retrieve All Records");
            System.out.println("2 = Create New Record");
            System.out.println("3 = Retrieve Single Record");
            System.out.println("4 = Update");
            System.out.println("5 = Delete");
            
            System.out.println("6 = Retrieve All: order by ID");
            System.out.println("7 = Retrieve All: order by species");
            System.out.println("8 = Retrieve All: order by price in descending order");
            System.out.println("9 = Retrieve All: order by species / price descending");
            System.out.println("10 = Retrieve All: order by species / price Descending versions");
            System.out.println("11 = Statistics");
            
            choice = Prompt.getInt("Number of choice: ", 0, 11);
//----------------------------------------------------------------------------
            if (choice == 1) {
                System.out.println(data.toString());
//----------------------------------------------------------------------------
            } else if (choice == 2) {
                id = Prompt.getInt("Enter pet id: ");
                species = Prompt.getLine("Enter species: ");
                price = Prompt.getDouble("Enter price: ");
                Pet pet = new Pet(id, species, price);
                data.create(pet);
//----------------------------------------------------------------------------
            } else if (choice == 3) {
                id = Prompt.getInt("Enter pet id: ");
                System.out.println(data.retrieve(id));
//----------------------------------------------------------------------------
            } else if (choice == 4) {
                ;
//----------------------------------------------------------------------------
            } else if (choice == 5) {
                id = Prompt.getInt("Enter pet id: ");
                data.delete(id);
//----------------------------------------------------------------------------
            } else if (choice == 6) {
                System.out.println(data.oderById());
            
            } else if (choice == 7) {
                System.out.println(data.oderBySpecies());
            
            } else if (choice == 8) {
                System.out.println(data.oderByPrice());
            
            } else if (choice == 9) {
                System.out.println(data.oderBySpeciesPrice());
            
            } else if (choice == 10) {
                ;
            
            } else if (choice == 11) {
                ;
//----------------------------------------------------------------------------
            } else if (choice == 0) {
                ;
            }
        }
    }

    public static void main(String[] args) {
        new PetAppMenu();
    }
}
