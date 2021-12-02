package chapter3;

import java.util.Scanner;

public class Grdae {

	public static void main(String[] args) {
		String grade;
		char point;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your score grade letter ");
		grade=input.nextLine().toUpperCase();
		point=grade.charAt(0);
		switch(point)
		{
		case'A':
			System.out.println("The grade value is "+4);
			break;
		case'B':
			System.out.println("The grade value is "+3);
			break;
		case'C':
			System.out.println("The grade value is "+2);
			break;
		case'D':
			System.out.println("The grade value is "+1);
			break;
		case'F':
			System.out.println("The grade value is "+0.0);
			break;
			default:
				System.out.println("The grade value is "+0.0+ "Error!!");
		}
	}

}
