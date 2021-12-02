package chapter6;

//import java.util.Arrays;
import java.util.Scanner;

public class CountFamiles {

	public static void main(String[] args) {
		int k;
		double percent=0.0;
		 int count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the number of families");
        k=input.nextInt();
        double[] income=new double[k];
        
        System.out.println("please enter "+k+" family incomes");
        for(int i=0;i<income.length;i++) {
        	income[i]=input.nextDouble();	 
        }
       
        double maxInc=income[0];
       
        for(int i=0;i<income.length;i++) {
        	if(income[i]>maxInc)
        		maxInc=income[i];	
        }
        System.out.println();
        System.out.println("The incomes below the 10% are");
        percent=(0.1*maxInc);  
       for(int a=0;a<income.length;a++) {
    	   if(income[a]<percent) {
    		   count++;
    		   System.out.println(income[a]);    
    	   }
       }
       System.out.println("The total famalies below 10% are "+ count);
	}
}
