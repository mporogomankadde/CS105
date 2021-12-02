package Labsss;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StrNums {
    public static void main(String[] args) {

        try {
            FileWriter fw= new FileWriter("C:\\Users\\Ronnie..T\\Desktop\\advice\\numbers2.txt");
            BufferedWriter bw= new BufferedWriter(fw);

            bw.write("\n20.2 \n20.4 \n20.6 \n20.8");
            bw.close();
            fw.close();
            System.out.println("numbers added");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileReader fr= new FileReader("C:\\Users\\Ronnie..T\\Desktop\\advice\\numbers2.txt");
            BufferedReader br= new BufferedReader(fr);
            System.out.println();

            String [] arr= br.lines().collect(Collectors.joining()).split(" ");
            double[] arr1 = Arrays.stream(arr).mapToDouble(Double::parseDouble).toArray();

           System.out.println(Arrays.toString(arr1));
        double sum=0;
            for (int i = 0; i < arr1.length; i++) {
                  sum+=arr1[i];
            }
            double av= sum/ arr1.length;
            System.out.println(av);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
