package chapter2;

public class Question3 {

	public static void main(String[] args) {
		int u=2,v=3,w=5,x=7,y=11;
		int res1=u+(v*w)+x;
		int res2=u+(y%v)*w+x;
		int res3=(u++/v)+(u++*w);
		System.out.println("Result1 is "+ res1);
		System.out.println("Result1 is "+ res2);
		System.out.println("Result1 is "+ res3);
		
		
	}

}
