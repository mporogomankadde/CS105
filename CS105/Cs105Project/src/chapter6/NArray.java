package chapter6;

import java.util.Scanner;

public class NArray {

	public static void main(String[] args) {
		int n;
		int min;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please any postive enteger");
		n=keyboard.nextInt();
		int[] Array= new int[n];
		System.out.println("please enter "+n+" enteger");
		for(int i=0;i<Array.length;i++) {
			
			Array[i]=keyboard.nextInt();
		}
		min=Array[0];
		for(int i=0;i<Array.length;i++) {
			 
			if(Array[i]<min)
				min=Array[i];
		}
			System.out.println("the min value is "+ min);
	}
}
