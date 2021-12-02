package chapter3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int Score;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("please enter your score");
		Score=keyboard.nextInt();
		if(Score>=0 && Score<=100)
		System.out.println("the score is valid");
		else
			System.out.println("the score is invalid");

	}

}
