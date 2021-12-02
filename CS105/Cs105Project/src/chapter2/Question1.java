package chapter2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		String sentence,fin;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter these words \"i hate you\"");
		sentence=input.nextLine();
		 fin=sentence.replace("hate","love");
		 System.out.println("I have rephrased that line to read:");
		System.out.println(fin);
		
	}

}
