package TestPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Condon {
    public static void main(String[] args) {

        dna();
    }
    public static void dna(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the DNA");
        String  str= sc.nextLine();
        while(str!=""){
            String[] str1=str.split(" ");
            int n=str.length()/3;
            ArrayList<String> al= new ArrayList<String>();
            if(str.length()<3)
                return;
            else{
                for (int i=0,j = 3; i <3*n && j<=3*n; i+=3,j=i+3) {
                    al.add(str.substring(i,j));
                }
                for (String s:al) {
                    System.out.println(s);
                }
            }
            System.out.println("enter the DNA");
            str= sc.nextLine();
        }
    }

}
