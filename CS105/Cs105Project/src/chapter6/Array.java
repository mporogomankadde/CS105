package chapter6;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] r=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value");

		System.out.println();
		for(int i=0;i<r.length;i++) {
			int num=input.nextInt();
			r[i]=num;
			
		}
		
		for(int j=0;j<r.length;j++)
		System.out.print(r[j]);

	}

}
