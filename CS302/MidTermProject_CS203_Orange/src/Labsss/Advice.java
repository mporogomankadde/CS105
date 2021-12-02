package Labsss;

import java.io.*;
import java.util.Scanner;

public class Advice {
    public static void main(String[] args)  {


        try {
            File ff= new File("C:\\Users\\Ronnie..T\\Desktop\\advice\\advice.txt");

            FileReader fr= new FileReader(ff);
            BufferedReader br= new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the your advice");
        out(sc.nextLine());


    }
    public static void out(String s){
        try {
            FileWriter fw= new FileWriter("C:\\Users\\Ronnie..T\\Desktop\\advice.txt");
            BufferedWriter br= new BufferedWriter(fw);
            PrintWriter p= new PrintWriter(br);
            p.println(s);

            br.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

