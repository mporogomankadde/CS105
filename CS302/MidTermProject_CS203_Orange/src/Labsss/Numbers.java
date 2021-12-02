package Labsss;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileReader;

public class Numbers {
    public static void main(String[] args) {

        File ff= new File("C:\\Users\\Ronnie..T\\Desktop\\advice\\numbers.txt");
        try {

            if(ff.exists() && ff.canRead()) {
                FileReader fr = new FileReader(ff);
                BufferedReader br = new BufferedReader(fr);
                String s = br.readLine();
                System.out.println(s);
                String[] arr = (s.split(" "));
                int c = 0;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals("10"))
                        c++;
                }
                System.out.println("the number 10 exist " + c + " times");
                br.close();
                fr.close();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    }


