package ParkingGarageApplication;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to Garage parking application");
		Slot slot = new Slot();
		Garage garage = new Garage(slot);
		registermenu();
		System.out.print("Enter your choice : ");
		int num = input.nextInt();
		GarageOwner garageowner = new GarageOwner(garage);
		int connum = 1;
		while (num < 4) {
			if (num == 1) {
				if (garageowner.verfiyaccount()) {
					GarageOwnerMenu();
					System.out.print("Enter your choice : ");
					int num2 = input.nextInt();
					while (num2 < 6) {
						if (num2 == 1) {
							slot.AddSlots(garage);
							GarageOwnerMenu();
							System.out.print("Enter your choice : ");
							num2 = input.nextInt();
						}
						if (num2 == 2) {
							boolean display = slot.DisplayAvaliableSlots(garage);
							if (display == false) {
								System.out.println("there is No slots Added..Add slots first");
							}
							GarageOwnerMenu();
							System.out.print("Enter your choice : ");
							num2 = input.nextInt();
						}
						if (num2 == 3) {
							Configuration configuration = new Configuration();
							connum = configuration.ChooseConfigration();
							GarageOwnerMenu();
							System.out.print("Enter your choice : ");
							num2 = input.nextInt();
						}
						if (num2 == 4) {
							Totalincome total = Totalincome.Getinstance();
							total.CalTotalincome();
							GarageOwnerMenu();
							System.out.print("Enter your choice : ");
							num2 = input.nextInt();
						}
						if (num2 == 5) {
							registermenu();
							System.out.print("Enter your choice : ");
							num = input.nextInt();
							break;
						}
					}
				} else {
					System.out.println("InCorrect Account..");
				}
			} else if (num == 2) {
				Driver driver = new Driver(garage);
				if (driver.verfiyregisterion()) {
					driverMenu();
					System.out.print("Enter your choice : ");
					int num3 = input.nextInt();
					while (num3 < 4) {
						if (num3 == 1) {
							parkingin parki = new parkingin();
							if (parki.parkin(garage, driver, connum)) {
								System.out.println("\nParked-in successfully..");
								System.out.println("-----------------------------------------------");
								driverMenu();
								System.out.print("Enter your choice : ");
								num3 = input.nextInt();

							} else {
								System.out.println("there is no available slot right now ");
								driverMenu();
								System.out.print("Enter your choice : ");
								num3 = input.nextInt();
							}
						} else if (num3 == 2) {
							parkingout parko = new parkingout();
							parko.parkout(driver, garage);
							driverMenu();
							System.out.print("Enter your choice : ");
							num3 = input.nextInt();

						} else if (num3 == 3) {
							registermenu();
							System.out.print("Enter your choice : ");
							num = input.nextInt();
							break;
						}
					}
				}
			}

			else if (num == 3) {
				System.out.println("thank you for visiting our application");
				System.exit(0);
			}
		}
	}

	// functions
	public static void registermenu() {
		System.out.println("1- Register as an Garage Owner");
		System.out.println("2- Register as a Vechile Owner");
		System.out.println("3- Exit");
	}

	// ---------------------------------------------------------
	public static void GarageOwnerMenu() {
		System.out.println("_______Garage Owner Menu______");
		System.out.println("1- Add new slots");
		System.out.println("2- Display all parking slots");
		System.out.println("3- Choose configration");
		System.out.println("4- Calculate total income");
		System.out.println("5- Return back");
	}

	// ---------------------------------------------------------------
	public static void driverMenu() {
		System.out.println("_______Vechile Owner Menu______");
		System.out.println("1- Park-in");
		System.out.println("2- Park-out");
		System.out.println("3- Return back");
	}
}
