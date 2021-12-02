package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class FlowerCount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		int qty;
		double totalCost=0.0;
		String [] flowers= {"petunia", "pansy", "rose", "violet","carnation"};
		double[] cost= { 0.50,0.75, 1.50, 0.50, 0.80};
		 
        System.out.println("Enter the flower name");
        name=input.next();
        System.out.println("Enter the quantity");
        qty=input.nextInt();
        for(int i=0;i<flowers.length;i++) {
        	 for(int j=0;j<cost.length;j++) {
        		  
        		 if(name.equalsIgnoreCase(flowers[i]))
        		   totalCost=cost[i]*qty;
        	 }
        }
        System.out.println("the total cost is "+totalCost);
       
	}

}
