package personal;

import java.util.Scanner;

public class Reversed {

	public static void main(String[] args) {
		int num;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please enter the number");
		num=keyboard.nextInt();
		for(int i=num;i>0;i--) {
			System.out.print(i+" ");
		}
			

	}

}
