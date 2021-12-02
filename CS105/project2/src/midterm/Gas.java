package midterm;

public class Gas extends CarC {
	private int tanksize;
	private String fueltype;
	public Gas(String make, String model, int year, int weight, String color, int batterysize,String batterytype) {
		super(make, model, year, weight, color);
		
		this.tanksize = tanksize;
		this.fueltype = fueltype;
	}
	@Override
	public String toString() {
	
		return super.toString()+"tanksize"+tanksize+"fueltype"+fueltype;
	}
	

}
