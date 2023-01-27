package ParkingGarageApplication;

import java.util.Scanner;

public class Configuration {

    Scanner input = new Scanner(System.in);
    Garage garage;
    Driver driver;

    Configuration()
    {

    }
    public int ChooseConfigration() {
        System.out.println("Choose configration");
        System.out.println("1- First fit algorithm \n2- Best fit algorithm");
        System.out.print("Enter Your choice : ");
        int choice = input.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Choice is not available Enter Your choice : ");
            choice = input.nextInt();
        }
        if (choice == 1) {
            System.out.println("\nApply First Fit Configuration ");
        } else if (choice == 2) {
            System.out.println("\nApply Best Fit Configuration ");
        }
        System.out.println("------------------------------------------------------");
        return choice;
    }
}
