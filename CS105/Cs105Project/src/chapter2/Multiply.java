package chapter2;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		System.out.println("Enter two numbers to Multiply.");
		Scanner keyboard = new Scanner(System.in);
		int n1,n2;
		n1= keyboard.nextInt();
		n2= keyboard.nextInt();
		
		int product=n1*n2;
		System.out.println("The product is "+ product);
		

	}

}
