package midterm;

import java.io.Serializable;

public class CarC implements Serializable {
	private String make;
	private String model;
	private int year;
	private int weight;
	private String color;
	
	public CarC(String make, String model, int year, int weight, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", year=" + year + ", weight=" + weight + ", color=" + color;
	}

	
	
	
	
}
