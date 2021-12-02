package TestPerson;

import java.util.*;

public class Fortune {
    public static void main(String[] args) {
        forturne();
    }

    public static void forturne(){
        Scanner sc=new Scanner(System.in);

        String[] fot={"Happiness is programming","Satisfaction follows hard work","Patience is virtue",
                "You will get 4.0 GPA this semester","you are love","you will be rich","you are blessed",
        "you are smart","you will drive tesla","you will go moon"};
        ArrayList<String> al=new ArrayList<String>(List.of(fot));

        System.out.println("Do you to know your fortune?");
        System.out.println("Enter Y or N");
        String ans=sc.nextLine().toLowerCase();

        while (ans.equals("y")){
            Random rand=new Random();
            int choice= rand.nextInt(al.size());
            System.out.println(al.get(choice));

            System.out.println("Do you to know your fortune?");
            System.out.println("Enter Y or N");
             ans=sc.nextLine().toLowerCase();

            }
    }
}
