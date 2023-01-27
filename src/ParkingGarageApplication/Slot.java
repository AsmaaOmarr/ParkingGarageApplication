package ParkingGarageApplication;

import java.util.Scanner;

public class Slot {
	Garage garage;
	static Scanner input = new Scanner(System.in);
	private double width;
	private double depth;
	boolean status;
	private int id;
	public static int count = 1;
	boolean added = false;

	public Slot() {
	}

	public Slot(double width, double depth, boolean stat) {
		this.width = width;
		this.depth = depth;
		this.status = stat;
		this.id = count;
		count++;
	}

	public void setwidth(double w) {
		width = w;
	}

	public void setdepth(double d) {
		depth = d;
	}

	public void setStatus(boolean s) {
		status = s;
	}

	public double getwidth() {
		return width;
	}

	public double getdepth() {
		return depth;
	}

	public boolean getStatus() {
		return status;
	}

	public int getid() {
		return id;
	}

	public void AddSlots(Garage garage) {
		System.out.println("How many Slots do you want to add");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			int k = i + 1;
			System.out.println("Slot " + k);
			System.out.print("Enter Slot width : ");
			double w = input.nextDouble();
			System.out.print("Enter Slot depth : ");
			double d = input.nextDouble();
			Slot slot = new Slot(w, d, true);
			garage.arrSlots.add(slot);
		}
		added = true;
		System.out.println("Added done successfully..");
	}

	public boolean DisplayAvaliableSlots(Garage garage) {
		if (added) {
			for (int i = 0; i < garage.arrSlots.size(); i++) {
				int k = i + 1;
				System.out.println("Slot" + k);
				System.out.print("Slot width : " + garage.arrSlots.get(i).getwidth());
				System.out.print(" || Slot depth : " + garage.arrSlots.get(i).getdepth());
				System.out.print(" || Slot id : " + garage.arrSlots.get(i).getid());
				System.out.println(" || Slot Status : " + garage.arrSlots.get(i).getStatus());
			}
			return true;
		} else {
			return false;
		}
	}
}
