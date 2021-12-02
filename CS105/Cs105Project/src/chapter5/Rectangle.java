package chapter5;

public class Rectangle {
	private double length;
	private double breadth;
	public double area;
	public double perimeter;
	public double £=2.31;
	public Rectangle() {  // using the constructor
	
		length =5.00;
		breadth= 2.00;
	}
	
	public double area()
	{
		area= £*length*breadth;
		return area;
		
	}
	public double perimeter ()
	{
		perimeter= length+breadth;
		return perimeter;
	
	}
	/*@Override
	public String toString() {
	return "the area of rectangle is "+  area +" and perimeter is "+ perimeter;
		
	}*/
	}

