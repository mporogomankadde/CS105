package TestPerson;

public class WordCount {
    String sentence;
    int counter;

    public WordCount(String sentenc) {this.sentence =sentenc;}
    public int getCounter() {return counter;}

    public void setCounter(int counter) {this.counter = counter;}
    public  void wordcount(){
        int counter=0;
        String [] arr=sentence.split(" ");
        counter=arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0)=='A' ||arr[i].charAt(0)=='a')
            counter--;
        }
        System.out.println(counter);
    }
}
