package chapter3;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		double check,charge;
		System.out.println("please enter the amount of the check");
		Scanner keyboard=new Scanner(System.in);
		check=keyboard.nextDouble();
		System.out.println(check<0? "wrong value":"");
		if(check>=1000.00)
			charge=40+(0.01*check); 
			else
				if(check>=100.00)
					charge=5+(0.05*check);
					else
						if(check>=10.00)
							charge=(0.1*check);
							else
								charge=1.00;
		System.out.println("The charge is "+ charge);
				
	}

}
