package personal;

import java.util.Scanner;

public class BassBall {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please enter the number of innnings");
		int n=keyboard.nextInt();
		int sc1=0;
		int sc2=0;
	
		for(int i=1; i<= n;i++) {
			System.out.println("the number  time score"+ n);
			sc1+=keyboard.nextInt();
			sc2+=keyboard.nextInt();
		}
		System.out.println("team1 has "+sc1+"\nteam2 has "+sc2);
	
		
		/* Scanner reader = new Scanner(System.in);
	       
		  System.out.println("Enter the number of innings : " );
		              int innings  = reader.nextInt();        
		              int team1Total=0;
		              int team2Total=0;
		              for( int inning=1; inning <= innings; inning++){
		                  System.out.println("How many runs were scored in inning " 
		                          + inning + " by each team?");
		                  team1Total = team1Total + reader.nextInt();
		                team2Total = team2Total + reader.nextInt();
		              }
		              System.out.println("The first team scored: " + team1Total 
		                      + " and the second team scored: " + team2Total); */
	}
}
