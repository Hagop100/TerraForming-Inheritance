package TerraForm;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        String planetName;
        int planetSize;
        double percentage = 100;
        double arrDis[] = new double[4]; //distributions
        //int disW, disA, disM, disP; these 4 will be places into the array above
        String arrNames[] = {"Water", "Animal", "Mineral", "Plant"};
        int i = 0; //iterator in while loop
        boolean repeat = true; // outer while loop trigger


        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Welcome to the Terraforming program!");
        System.out.println("Enter the name of your new planet: ");
        planetName = scanner.nextLine();
        System.out.println("What size planet do you want? ");
        System.out.println("1) Small");
        System.out.println("2) Medium");
        System.out.println("3) Large");
        System.out.println("4) X-Large");
        planetSize = scanner.nextInt();
        while (repeat) {
            System.out.println("How do you want to distribute the categories? ");
            while (percentage >= 0 && i < 4) {
                System.out.println("Percentage remaining: " + percentage);
                System.out.println(arrNames[i] + " distribution: ");
                arrDis[i] = scanner.nextInt();
                if (arrDis[i] > percentage || arrDis[i] < 0) {
                    System.out.println("Invalid percentage input, try again!");
                }
                else {
                percentage = percentage - arrDis[i];
                i++;
                }
            }
            System.out.println("You chose the following: ");
            System.out.println("Planet Size: " + planetSize);
            System.out.println("TerraObject Distribution: ");
            for (int j = 0; j < 4; j++) {
                System.out.println(arrNames[j] + ": " + arrDis[j] + "%");
            }
            System.out.println("Do you want to continue? (y/n)");
            String choice = scanner2.nextLine();
            if (choice.equals("y")) {
                repeat = false;
            }
            percentage = 100;
            i = 0;
        }

        // Terra Objects Created Now
        TerraObjectFactory terra = new TerraObjectFactory(planetSize, arrDis[0], arrDis[1], arrDis[2], arrDis[3]);
        terra.terraCreator();
        terra.setTerraArray();

        int option = 0;
        while (option != 5) {
            System.out.println("TERRAFORMING MENU");
            System.out.println("Planet Name: " + planetName + " TerraObjects: " + terra.getTotalObjects() + " Impact Score: " + terra.getImpactScore());
            System.out.println("1) List all Water Objects");
            System.out.println("2) List all Animal Objects");
            System.out.println("3) List all Mineral Objects");
            System.out.println("4) List all Plant Objects");
            System.out.println("5) Exit");
            option = scanner.nextInt();
            if (option == 1) {
                terra.displayWaterObjects();
            }
            else if (option == 2) {
                terra.displayAnimalObjects();
            }
            else if (option == 3) {
                terra.displayMineralObjects();;
            }
            else if (option == 4) {
                terra.displayPlantObjects();
            }
        }
        scanner.close();
        scanner2.close();


            
    }
}
