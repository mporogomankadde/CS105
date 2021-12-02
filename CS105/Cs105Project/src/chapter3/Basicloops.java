package chapter3;

import java.util.Scanner;

public class Basicloops {

	public static void main(String[] args) {
	        // While loop
	        // Requirement is to print the n numbers
	            Scanner input = new Scanner(System.in);
	            System.out.println("Enter int n value : ");
	            int n = input.nextInt();
	            // n = 5; print 1, 2, 3, 4, 5
	            int i = n; // Loop control variable
	        //    System.out.println();
	            while(i>=1) { // Inside the braces is called body of the loop
	            /* This loop execute repeatly until while condition becomes false.*/    
	                System.out.print(i + " ");
	                i--; // i+=1; i++;
	                
	            }
	            System.out.println("\nStop While 1");
	            int j=5;
	            while(j>=1) // No block
	                    System.out.print(j-- + " ");
	                    
	            System.out.println("\nStop While - 2");
	            
	            // 2. do while
	            // Print the Even numbers 
	            int count =10;
	            do {
	                if(count<=10) 
	                System.out.println(count + " ");
	                count = count - 2;
	                
	                }while(count>0);
	            System.out.println("End while");
	            // For loop - three parts, initialization, condition, increment/decrement
	            // I want to print n numbers
	            
	            int number = 10;
	            for(int c=10;c>=1;c--) {
	                System.out.print(c + " ");
	            }
	            System.out.println("\nEnd for");
	            
	        

	}

}
