package chapter4;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		/*int n;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter any postive interger");
		n=keyboard.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);	
			}
			System.out.println();	
		}*/
		 for(int i=1;i<=5;i++) { // Outer loop - Execute 5 times
	    	  for(int j=1;j<=i;j++) { // Inner loop // Excute 5 * 5 = 25 times
	    		  System.out.print('*');
	    	  }
	    	  System.out.println();
	      }
	}
}
