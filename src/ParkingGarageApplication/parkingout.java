package ParkingGarageApplication;

import java.util.Scanner;
import java.util.*;

public class parkingout extends parkingin {

    Scanner input = new Scanner(System.in);
    public Driver driver;
    public Garage garage;
    public int hour2;
    public int min2;
    public int sec2;
    public int totalhour;
    public int totalmin;
    public int totalsec;
    public static int totalfees;

    public void parkout(Driver driver, Garage garage) {

        Calendar parkoutTime = Calendar.getInstance();
        parkoutTime.get(Calendar.HOUR_OF_DAY);
        System.out.print("Date of parking out: ");
        System.out.println(parkoutTime.get(Calendar.DAY_OF_MONTH) + "/" + parkoutTime
                .get(Calendar.MONTH) + "/" + parkoutTime.get(Calendar.YEAR));
        System.out.print("Start Time of parking in: ");
        System.out.println(hour1 + ":" + min1 + ":" + sec1);

        System.out.print("Departure Time: ");
        hour2 = parkoutTime.get(Calendar.HOUR);
        min2 = parkoutTime.get(Calendar.MINUTE);
        sec2 = parkoutTime.get(Calendar.SECOND);
        System.out.println(hour2 + ":" + min2 + ":" + sec2);

        System.out.print("Total spent Time: ");
        totalhour = Math.abs(hour2 - hour1);
        totalmin = Math.abs(min2 - min1);
        totalsec = Math.abs(sec2 - sec1);
        System.out.println(totalhour + ":" + totalmin + ":" + totalsec);

        if (totalsec > 0 && totalmin == 0 && totalhour == 0) {
            totalfees = 5;
        } else if (totalmin > 0) {
            if (totalhour == 0) {
                totalfees = 5;
            } else {
                totalfees = 5 + (totalhour * 5);
            }
        } else if (totalhour > 0 && totalmin == 0) {
            totalfees = 5 * totalhour;
        }
        System.out.println("Total parking fees :" + totalfees + " EGP");
        System.out.println("----------------------------------------------------");

        garage.arrSlots.get(numOfSlot).setStatus(true);

    }

}
