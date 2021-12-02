package personal;

import java.util.Scanner;

public class ChangerMaker {

	public static void main(String[] args) {
		int dollar,quarters,nickles,dime,pennies,orignalAmount,amount,halfDollar;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("please enter the amount you want to change");
		orignalAmount=keyboard.nextInt();
		dollar=orignalAmount/100;
		amount=orignalAmount%100;
		halfDollar=amount/50;
		amount=orignalAmount%50;
		quarters=amount/25;
		amount=amount%25;
	    dime=amount/10;
		amount=amount%10;
		nickles=amount/5;
		amount=amount%5;
		pennies=amount/1;
		System.out.println("you entered "+orignalAmount+ "amount and you the cange as");
		System.out.println(dollar+" dollars "+halfDollar+" halfdollars "+quarters+" quarters "+
				dime+" dime "+nickles+" nickles "+pennies+" pennies ");
		

	}

}
