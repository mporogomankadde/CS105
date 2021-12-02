package chapter3;

import java.util.Scanner;

public class EvenX {

	public static void main(String[] args) {
		int x;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please enter any interger ");	
		x= keyboard.nextInt();
		if(x %2==0) {
			x=x/2;
			System.out.println("The new x is "+ x);	
		}
		else {
			x=3*x-1;
			System.out.println("The new x is "+ x);
		}
		System.out.println("End of code");	
	}

}
