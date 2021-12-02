package personal;

import java.util.Scanner;

public class Pers2 {

	public static void main(String[] args) {
		String grade;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=input.nextLine();
		grade=grade.toUpperCase();
		switch(grade) {
		case "A":
			System.out.println("your grade score is "+ 4);
			break;
		case "B":
			System.out.println("your grade score is "+ 3);
			break;
		case "C":
			System.out.println("your grade score is "+ 2);
			break;
		case "D":
			System.out.println("your grade score is "+ 1);
			break;
		case "F":
			System.out.println("your grade score is "+ 0.0);
			break;
			default:
				System.out.println("your grade score is "+ 0.0+" Error!!");
		}
		
	}

}
