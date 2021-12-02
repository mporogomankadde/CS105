package TestPerson;
import java.time.LocalDate;
import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {

        calc();
    }
public static void calc(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year of birth");
    int ybirth=sc.nextInt();
    System.out.println("Enter the month of birth");
    int mbirth=sc.nextInt();

    LocalDate date= LocalDate.now();

    int month=date.getMonthValue();
    int year= date.getYear();

   // String newDate=date.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy"));
   double age = year-ybirth+((double)(month-mbirth)/12);
   age=Math.round((age)*10.0)/10.0;
    System.out.println("Your are "+age+" years");
}
}
