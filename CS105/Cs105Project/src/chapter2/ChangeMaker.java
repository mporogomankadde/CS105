package chapter2;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
int orignalAmount,oneDollars,halfDollars,quarters,dimes,nickels,pennies;
Scanner keyboard= new Scanner(System.in);
System.out.println("Enter a whole number>0");
orignalAmount=keyboard.nextInt();
oneDollars=orignalAmount/100;
halfDollars=(orignalAmount%100)/50;
quarters= ((orignalAmount%100)%50)/25;
dimes=(((orignalAmount%100)%50)%25)/10;
nickels=((((orignalAmount%100)%50)%25)%10)/5;
pennies=(((((orignalAmount%100)%50)%25)%10)%5)/1;
System.out.println("The change is "+oneDollars +"oneDollars, "+halfDollars+"halfDollars, "+quarters+ "quarters, "+dimes+ "dimes, " +nickels+ "nickels, "+pennies+ "pennis.");

	}

}
