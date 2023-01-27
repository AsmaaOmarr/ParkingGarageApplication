package ParkingGarageApplication;
import java.util.Scanner;

public class Driver {

	Scanner input = new Scanner(System.in);
	public vechile vec;
	Garage garage;
	public int hour2;
	public int min2;
	public int sec2;
	public int totalhour;
	public int totalmin;
	public int totalsec;
	public int totalfees;
	int numOfSlot;

	public Driver(Garage garage) {
		vec = new vechile();
		this.garage = garage;
	}

	public boolean verfiyregisterion() {
		System.out.println("Welcome..\nEnter your vehicle details");
		System.out.print("Enter model name : ");
		String mn = input.nextLine();
		vec.setmodelname(mn);
		System.out.print("Enter model year : ");
		String my = input.nextLine();
		vec.setmodelyear(my);
		System.out.print("Enter width : ");
		double w = input.nextDouble();
		vec.setwidth(w);
		System.out.print("Enter depth : ");
		double d = input.nextDouble();
		vec.setdepth(d);
		System.out.println("you registered successfully\n");
		return true;
	}

	

}