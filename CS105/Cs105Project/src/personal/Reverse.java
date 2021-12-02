package personal;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		String num="";
		Scanner keyboard= new Scanner(System.in);
		System.out.println("please enter any figure");
        num=keyboard.nextLine();
       for(int i=num.length()-1;i>=0;i--)
    	   System.out.print(num.charAt(i));
       
        
	}
	 

}
