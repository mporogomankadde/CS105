package chapter2;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int temp;
		System.out.println("Enter the temperature in  Fahrenheit");
		temp= keyboard.nextInt();
		int Cels;
	
		Cels =(temp-32)*5/9;
         System.out.println("The temperature in Celsius is =" + Cels);
	}

}
