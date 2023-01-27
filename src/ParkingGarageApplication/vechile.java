package ParkingGarageApplication;

public class vechile {

	private String modelname;
	private String modelyear;
	private double width;
	private double depth;
	public static int id = 0;

	public vechile() {
		modelname = "BMW";
		modelyear = "2020";
		width = 15;
		depth = 15;
		id++;
	}

	public vechile(String modelname, String modelyear, double width, double depth) {
		this.modelname = modelname;
		this.modelyear = modelyear;
		this.width = width;
		this.depth = depth;
		id++;
	}

	public void setmodelname(String mn) {
		modelname = mn;
	}

	public void setmodelyear(String my) {
		modelyear = my;
	}

	public void setwidth(double w) {
		width = w;
	}

	public void setdepth(double d) {
		this.depth = d;
	}

	public String getmodelname() {
		return modelname;
	}

	public String getmodelyear() {
		return modelyear;
	}

	public double getwidth() {
		return width;
	}

	public double getdepth() {
		return depth;
	}
}