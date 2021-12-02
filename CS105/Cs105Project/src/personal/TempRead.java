package personal;

import java.util.Scanner;

public class TempRead {

	public static void main(String[] args) {
		int temp;
		String label;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("please enter the temp value:");
		temp=keyboard.nextInt();
		System.out.println(label=(temp==1? temp+" degree":temp+" degrees"));

	}

}
