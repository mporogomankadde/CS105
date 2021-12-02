package TestPerson;

public class Revision {

    public static void main(String[] args) {

        String s="bbbbbbbbc";
        lengthOfLongestSubstring(s);


    }
    public static void lengthOfLongestSubstring(String s) {
        int c=0;
        for(int i=0;i< s.length()-1;i++){
            for (int j= i+1; j < s.length(); j++) {

            if(s.charAt(i)!=s.charAt(j)){
                c++;
                System.out.print(s.charAt(i));
            }
            }

        }

        System.out.println(c);
    }
}
