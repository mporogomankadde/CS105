package chapter2;

import java.util.Scanner;

public class Expected {

	public static void main(String[] args) {
		System.out.println("Birthday Greetings.");
		System.out.println("What year were you born in?");
		Scanner keyboard = new Scanner(System.in);
		int year,age;
		year= keyboard.nextInt();
		age=2021-year;
		System.out.println("I can't believe you are "+ age +" years old");
		

	}

}
