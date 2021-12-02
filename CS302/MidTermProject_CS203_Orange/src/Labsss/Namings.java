package Labsss;

import java.io.*;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.stream.Collectors;

public class Namings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");


        try {
            String name= sc.nextLine();
            File f= new File("C:\\Users\\Ronnie..T\\Desktop\\advice\\boynames.txt");
            if(f.exists() && f.canRead()){

                FileReader fr= new FileReader(f);
                BufferedReader br= new BufferedReader(fr);
                String  [] barr= (br.lines().collect(Collectors.joining(" "))).split(" ");


                int temp=0;
                int i;

                for ( i = 0; i <barr.length; i+=2) {
                    if(barr[i].equalsIgnoreCase(name)) {
                        temp++;
                        System.out.println(name+" is ranked "+ (i+1) + " in popularity among boys with "+barr[i+1]);

                    }
                }
                if(temp==0)
                    System.out.println(name + " is not ranked in the among the most popular boys names");

                fr.close();
                br.close();
            }

               System.out.println("****************");

            File f1= new File("C:\\Users\\Ronnie..T\\Desktop\\advice\\girlnames.txt");
           if(f1.exists() && f1.canRead()){

                FileReader fr= new FileReader(f1);
                BufferedReader br= new BufferedReader(fr);
                String [] garr= (br.lines().collect(Collectors.joining(" "))).split(" ");

               int temp=0;
               int i;

               for ( i = 0; i <garr.length; i+=2) {
                   if(garr[i].equalsIgnoreCase(name)) {
                       temp++;
                       System.out.println(name+" is ranked "+ (i+1) + " in popularity among gals with "+garr[i+1]);

                   }
               }
               if(temp==0)
                   System.out.println(name + " is not ranked in the among the most popular gals names");

               fr.close();
                br.close();
            }

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        System.exit(0);
    }

}
