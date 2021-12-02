package chapter2;

import java.util.Scanner;

public class Mystrings {

	public static void main(String[] args) {
		String fistname, lastname;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your first name followed by the second  name, delimeter");
		fistname= input.nextLine();
		lastname= input.nextLine();
		System.out.println( fistname +lastname );
	}

}
