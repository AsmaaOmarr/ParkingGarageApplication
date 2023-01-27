package ParkingGarageApplication;

public class BestfitConfiguration extends Configuration {

    public int bestfit(Garage garage, Driver driver) {
        int numOfSlot = 0;
        double minwidth = 1000;
        double mindepth = 1000;
        for (int i = 0; i < garage.arrSlots.size(); i++) {
            if (garage.arrSlots.get(i).getStatus() == true
                    && garage.arrSlots.get(i).getwidth() >= driver.vec.getwidth()
                    && garage.arrSlots.get(i).getdepth() >= driver.vec.getdepth()) {
                if (minwidth > driver.vec.getwidth() && mindepth > driver.vec.getdepth()) {

                    minwidth = driver.vec.getwidth();
                    mindepth = driver.vec.getdepth();
                    numOfSlot = i;
                }
            }
        }
        return numOfSlot;

    }

}
