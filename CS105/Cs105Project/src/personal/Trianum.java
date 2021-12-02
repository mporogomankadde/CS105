package personal;

import java.util.Scanner;

public class Trianum {

	public static void main(String[] args) {
	int n;
	Scanner keyboard= new Scanner(System.in);
	System.out.println("please enter any integer");
	 n=keyboard.nextInt();
	 for(int i=1;i<=n;i++) { 
		 
		 for(int j=1;j<=i;j++) 
		 System.out.print(j);
		 System.out.println();
	 }
for(int i=n-1;i>=1;i--) {
		 
		 for(int j=1;j<=i;j++) 
		 System.out.print(j);
		 System.out.println();
	}
	}
}
