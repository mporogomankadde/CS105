package Labsss;

import java.io.*;
import java.util.Arrays;

public class Palind {
    public static void main(String[] args) {
        File ff= new File("C:\\Users\\Ronnie..T\\Desktop\\advice\\WordBuff.txt");
        if(ff.exists() && ff.canRead()){
            try {
                FileReader fr= new FileReader(ff);
                BufferedReader br= new BufferedReader(fr);
               String [] arr= br.readLine().split(" ");
                System.out.println(Arrays.toString(arr));
                int c=0;
                for (int i = 0; i < arr.length; i++) {
                    StringBuffer s= new StringBuffer(arr[i]);
                    if(arr[i].equalsIgnoreCase(s.reverse().toString())){
                        c++;
                        System.out.print(arr[i]+" ");
                    }
                }

                System.out.println("\nthere are "+c+" palindromes");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
