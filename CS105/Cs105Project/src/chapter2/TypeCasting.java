package chapter2;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		double x;
		x=keyboard.nextDouble();
		int y =(int)x;
		System.out.println("x is" + x +"and y is " + y);
		byte z =(byte)x;
		System.out.println("x is" + x +"and z is " +z);

	}

}
