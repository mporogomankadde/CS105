package chapter5;

import java.util.Scanner;

public class TimesString {

	public static void main(String[] args) {
		String str;
		int count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter any word");
		str=input.nextLine();
		str=str.toLowerCase();
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a') 
				count++;
		}
		System.out.println("a appers "+count+ " times");

	}

}
