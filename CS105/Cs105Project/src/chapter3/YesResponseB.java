package chapter3;

import java.util.Scanner;

public class YesResponseB {


			public static void main(String[] args) {
				String response1, response2;
				Scanner input=new Scanner(System.in);
				System.out.println("please enter the word either yes or no ");
				response1=input.nextLine();
				System.out.println("please enter the word either y or no ");
				response2=input.nextLine();
				
				if(response1.equalsIgnoreCase("yes")&&response2.equalsIgnoreCase("y"))
					System.out.println(true);
				else
					System.out.println(false);
					

			}

	}

