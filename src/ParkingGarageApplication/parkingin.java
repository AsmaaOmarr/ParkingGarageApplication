package ParkingGarageApplication;

import java.util.Scanner;
import java.util.*;

public class parkingin {

    Scanner input = new Scanner(System.in);
    Garage garage;
    Driver driver;
    public static int hour1;
    public static int min1;
    public static int sec1;
    static int numOfSlot;
    FirstfitConfiguration fcon;
    BestfitConfiguration bcon;

    parkingin() {
        fcon = new FirstfitConfiguration();
        bcon = new BestfitConfiguration();
    }

    public boolean parkin(Garage garage, Driver driver, int connum) {
        boolean confirm = false;
        // first fit Configuration
        if (connum == 1) {
            numOfSlot = fcon.firstfit(garage, driver);
            System.out.println("Confirm park-in ?");
            System.out.print("Enter 1 to confirm : ");
            int num = input.nextInt();
            if (num == 1) {
                garage.arrSlots.get(numOfSlot).setStatus(false);
                Calendar parkinTime = Calendar.getInstance();
                parkinTime.get(Calendar.HOUR_OF_DAY);
                System.out.print("\nDate of parking in: ");
                System.out.println(parkinTime.get(Calendar.DAY_OF_MONTH) + "/" + parkinTime
                        .get(Calendar.MONTH) + "/" + parkinTime.get(Calendar.YEAR));
                System.out.print("Start Time of parking in: ");
                hour1 = parkinTime.get(Calendar.HOUR);
                min1 = parkinTime.get(Calendar.MINUTE);
                sec1 = parkinTime.get(Calendar.SECOND);
                System.out.println(hour1 + ":" + min1 + ":" + sec1);
                confirm = true;
            }
        }
        // Best fit configuration
        else if (connum == 2) {
            numOfSlot = bcon.bestfit(garage, driver);
            System.out.println("Best fit Slot");
            System.out.print("Slot width : " + garage.arrSlots.get(numOfSlot).getwidth());
            System.out.print(" || Slot depth : " + garage.arrSlots.get(numOfSlot).getdepth());
            System.out.println(" || Slot id : " + garage.arrSlots.get(numOfSlot).getid());
            System.out.println("Confirm park-in ?");
            System.out.print("Enter 1 to confirm : ");
            int num = input.nextInt();
            if (num == 1) {
                garage.arrSlots.get(numOfSlot).setStatus(false);
                Calendar parkinTime = Calendar.getInstance();
                parkinTime.get(Calendar.HOUR_OF_DAY);
                System.out.print("\nDate of parking in: ");
                System.out.println(parkinTime.get(Calendar.DAY_OF_MONTH) + "/" + parkinTime.get(Calendar.MONTH)
                        + "/" + parkinTime.get(Calendar.YEAR));
                System.out.print("Start Time of parking in: ");
                hour1 = parkinTime.get(Calendar.HOUR);
                min1 = parkinTime.get(Calendar.MINUTE);
                sec1 = parkinTime.get(Calendar.SECOND);
                System.out.println(hour1 + ":" + min1 + ":" + sec1);
                confirm = true;
            }
        }
        return confirm;
    }

}
