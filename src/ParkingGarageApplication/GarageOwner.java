package ParkingGarageApplication;

import java.util.Scanner;

public class GarageOwner {

	Scanner input = new Scanner(System.in);
	String admin_account;
	String password;
	public Garage garage;
	boolean added = false;

	public GarageOwner(Garage garage) {
		this.garage = garage;
	}

	public void setmodelname(String admin_account) {
		this.admin_account = admin_account;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getadminaccount() {
		return admin_account;
	}

	public String getpassword() {
		return password;
	}

	public boolean verfiyaccount() {
		System.out.print("Enter account : ");
		String account = input.nextLine();
		System.out.print("Enter password : ");
		String pass = input.nextLine();
		this.admin_account = account;
		this.password = pass;
		if (password.length() < 4) {
			return false;
		}
		return true;
	}

	// public void AddSlots() {
	// 	System.out.println("How many Slots do you want to add");
	// 	int n = input.nextInt();
	// 	for (int i = 0; i < n; i++) {
	// 		int k = i + 1;
	// 		System.out.println("Slot " + k);
	// 		System.out.print("Enter Slot width : ");
	// 		double w = input.nextDouble();
	// 		System.out.print("Enter Slot depth : ");
	// 		double d = input.nextDouble();
	// 		Slot slot = new Slot(w, d, true);
	// 		garage.arrSlots.add(slot);
	// 	}
	// 	added = true;
	// 	System.out.println("Added done successfully..");
	// }
	// -------------------------------------------------
	// public boolean DisplayAvaliableSlots() {
	// 	if (added) {
	// 		for (int i = 0; i < garage.arrSlots.size(); i++) {
	// 			int k = i + 1;
	// 			System.out.println("Slot" + k);
	// 			System.out.print("Slot width : " + garage.arrSlots.get(i).getwidth());
	// 			System.out.print(" || Slot depth : " + garage.arrSlots.get(i).getdepth());
	// 			System.out.print(" || Slot id : " + garage.arrSlots.get(i).getid());
	// 			System.out.println(" || Slot Status : " + garage.arrSlots.get(i).getStatus());
	// 		}
	// 		return true;
	// 	} else {
	// 		return false;
	// 	}
	// }

	// ----------------------------------------------------
	// public int ChooseConfigration() {
	// 	System.out.println("Choose configration");
	// 	System.out.println("1- First fit algorithm \n2- Best fit algorithm");
	// 	System.out.print("Enter Your choice : ");
	// 	int choice = input.nextInt();
	// 	while (choice != 1 && choice != 2) {
	// 		System.out.println("Choice is not available Enter Your choice : ");
	// 		choice = input.nextInt();
	// 	}
	// 	if (choice == 1) {
	// 		System.out.println("\nApply First Fit Configuration ");
	// 	} else if (choice == 2) {
	// 		System.out.println("\nApply Best Fit Configuration ");
	// 	}
	// 	System.out.println("------------------------------------------------------");
	// 	return choice;
	// }
}