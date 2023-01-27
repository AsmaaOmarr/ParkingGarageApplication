package ParkingGarageApplication;

public class FirstfitConfiguration extends Configuration {

    FirstfitConfiguration() {
    }

    public int firstfit(Garage garage, Driver driver) {
        int i = 0;
        int numOfSlot = 0;
        while (i < garage.arrSlots.size()) {
            if (garage.arrSlots.get(i).getStatus() == true
                    && garage.arrSlots.get(i).getwidth() > driver.vec.getwidth()
                    && garage.arrSlots.get(i).getdepth() > driver.vec.getdepth()) {
                System.out.println("First fit Slot");
                System.out.print("Slot width : " + garage.arrSlots.get(i).getwidth());
                System.out.print(" || Slot depth : " + garage.arrSlots.get(i).getdepth());
                System.out.println(" || Slot id : " + garage.arrSlots.get(i).getid());
                numOfSlot = i;
                break;
            }
            i++;
        }
        return numOfSlot;
    }

}
