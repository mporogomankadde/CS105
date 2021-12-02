package chapter3;

import java.util.Scanner;

public class Luggage {

	public static void main(String[] args) {
		int weight;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please enter the weight value in pounds");
		weight=keyboard.nextInt();
		if(weight>=50)
			System.out.println("The fee is $ 5");
		else
		System.out.println("There is no fee");
	
	}

}
