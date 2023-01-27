package ParkingGarageApplication;

public class Totalincome {
    parkingout parko;
    public int totalincome;

    private static Totalincome instance = new Totalincome();

    private Totalincome() {
    }
    
    public static Totalincome Getinstance() {
        return instance;
    }

    public void CalTotalincome() {
        totalincome += parkingout.totalfees;
        System.out.println("Total income = " + totalincome + " EGP");
        System.out.println("-----------------------------------------------------------");

    }
}
