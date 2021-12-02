package chapter3;

import java.util.Scanner;

public class YesResponse {

	public static void main(String[] args) {
		String response;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the word either yes or no ");
		response=input.nextLine();
		if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"))
			System.out.println(true);
		else
			System.out.println(false);
			
		

	}

}
