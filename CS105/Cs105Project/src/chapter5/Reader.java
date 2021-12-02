package chapter5;

import java.util.Scanner;

public class Reader {

	public static void main(String[] args) {
		int num,product=1;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("enter any value");
		num=keyboard.nextInt();
		while(num!=0) {
			product=product*num;
			num=keyboard.nextInt();
		}
		System.out.println("The product is "+product);

	}

}
