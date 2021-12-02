package chapter2;

import java.util.Scanner;

public class DemoDisplay {

	public static void main(String[] args) {
		double x,y, diff;
		Scanner keyboard = new Scanner (System.in);
		x= keyboard.nextDouble();
		 y =1.0/x;
		double product=x*y;
		diff= product-1;
		System.out.println("x= " +x + " y= " + y + "the product is " + product );
		System.out.println("the difference is "+ diff);
	

	}

}
