package personal;

import java.util.Scanner;

public class Toss {

	public static void main(String[] args) {
		int heads=0,tails=0;
		double peh=0.0,pet=0.0;
		String status;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please for each toss enter the status");
		status=keyboard.nextLine();
		for(int i=1;i<=4;i++) {
			System.out.println("The "+i+"toss");
			if(status.equalsIgnoreCase("h"))
				heads++;
			else
				tails++;	
			status=keyboard.nextLine();
			 peh=(heads*100)/4;
			 pet=(tails*100)/4;
			 
		}
		System.out.println("Total heads are "+ heads);
		System.out.println("Total tails are "+ tails);
		System.out.println("Total heads % is "+ peh);
		System.out.println("Total tails % is "+ pet);
	}

}
