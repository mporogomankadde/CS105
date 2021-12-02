package chapter2;

import java.util.Scanner;

public class BmrCal {

	public static void main(String[] args) {
		int BMR_Female,weight,height,age,BMR_Male,Female,Male;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("please enter your weight in pounds");
		weight=keyboard.nextInt();
		System.out.println("please enter your height in inches");
		height=keyboard.nextInt();
		System.out.println("please enter your age in years");
		age=keyboard.nextInt();
		
		BMR_Male= (int)(655+((6.3 * weight) + (12.9 * height) - (6.8 *age)));
		Male=BMR_Male/230;
	
		BMR_Female= (int)(655+((4.3 * weight) + (4.7 * height) - (4.7 *age)));
		Female=BMR_Female/230;
		System.out.println("You should consume "+Male+"bars of chocolate to mantain your weight if you are a man or "+ Female +" bars of chocolate if yo u are a female");
		

	}

}
