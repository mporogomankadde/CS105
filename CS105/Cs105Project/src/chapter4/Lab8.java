package chapter4;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		String word;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please enter words ending with done");
		word=keyboard.nextLine();
		while(!word.equalsIgnoreCase("done"))
		{
		if(word.charAt(0)==(word.charAt((word.length()-1))))
		
		System.out.println("The word "+ word+ " has the first and the last char the same");
		word=keyboard.nextLine();

		}
	}

}
