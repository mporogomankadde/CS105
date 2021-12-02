package personal;

import java.util.Scanner;

public class NuSix {

	public static void main(String[] args) {
		String nextword,firstHalf,secondWord;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word");
		nextword=input.nextLine();
		firstHalf=nextword.substring(0,(nextword.length()/2));
		secondWord=nextword.substring(nextword.length()/2);
		if(secondWord.charAt(0)!='n')
			System.out.println(secondWord);
		else
			System.out.println(firstHalf);
		

	}

}
