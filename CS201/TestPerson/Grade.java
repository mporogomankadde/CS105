package TestPerson;

public class Grade {
    private int q1;
    private int q2;
    private int q3;
    private int mid;
    private int fin;

    public Grade(int q1, int q2, int q3, int mid, int fin) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.mid = mid;
        this.fin = fin;
    }
    public void  perc(){

         double quiz= (((double)(q1+q2+q3)/30)*100)*0.25;

         double midS=mid*0.35;
        double finS=fin*0.4;
         double finMark=quiz+midS+finS;
        System.out.println("quiz score is "+quiz+ " midScore is "+midS+"Final score is "+finS);
        System.out.println();
        System.out.println("the final mark is "+finMark);

         char grading =(finMark>=90)? 'A':(finMark>=80)? 'B':(finMark>=70)? 'C':(finMark>=60)? 'D':'F';
        System.out.println("the grade score "+ grading);

    }

    public static void main(String[] args) {
        Grade g1=new Grade(9,8,7,80,90);
        g1.perc();

    }

}
