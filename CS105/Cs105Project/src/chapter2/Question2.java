package chapter2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		String favColour,favFood,favAnimal,friendsName;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter you favourite colour");
		favColour=input.nextLine();
		System.out.println("please enter you favourite animal");
		favAnimal=input.nextLine();
		System.out.println("please enter you favourite food");
		favFood=input.nextLine();
		System.out.println("please enter your frirnds or realative first name");
		friendsName=input.nextLine();
		System.out.println(" i had a dream that " + friendsName+" ate a "+ favColour + " "+favAnimal+" and said it tasted like "+favFood+"!" );
		
	}

}
