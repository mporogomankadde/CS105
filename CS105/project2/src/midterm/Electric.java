package midterm;

public class Electric extends CarC{

	private int batterysize;
	private String batterytype;
	
	public Electric(String make, String model, int year, int weight, String color, int batterysize,String batterytype) {
		super(make, model, year, weight, color);
		this.batterysize = batterysize;
		this.batterytype = batterytype;
	}

	@Override
	public String toString() {
		
		return super.toString()+" batterysize"+ batterysize+"batterytype"+batterytype;
	}
}
	