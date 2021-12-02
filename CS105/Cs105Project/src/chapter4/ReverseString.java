package chapter4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	String phrase;
	Scanner keyboard=new Scanner(System.in);
	System.out.println("enter any word");
	phrase=keyboard.nextLine();
	System.out.println("the reversed string is");
	int j=phrase.length()-1;
	for(int i = j;i>=0;i--)
		System.out.print(phrase.charAt(i));
	System.exit(0);

	}
	
}
