package chapter4;

import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		int n,sum=0,i,x;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter any integer");
		n=keyboard.nextInt();
		x=1;
		i=1;
		while(i<=n)
		{
			System.out.print("+"+x);
			sum+=x;
			x+=2;
		i++;
		
		}
			System.out.println();		
		System.out.println("The sum of the first "+ n+ " postive odd numbers is "+ sum);

		}
}
