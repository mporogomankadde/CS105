package chapter2;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
 int length, breadth;
 System.out.println("put in length");
 length=keyboard.nextInt();
 System.out.println("put in breadth");
 breadth=keyboard.nextInt();
 int area, perimeter;
 area=length*breadth;
 perimeter=2+(length+breadth);
 System.out.println("Area is =" + area);
 System.out.println( "the perimeter is ="+ perimeter);
	}

}
