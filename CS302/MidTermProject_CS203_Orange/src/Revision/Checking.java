package Revision;

public class Checking extends Account{
    @Override
    public void withDrawal(double amount) {
        if(balance>amount && (balance-amount<100)){
            System.out.println("you can only withDrawal"+( balance-100));

        }else {
            System.out.println("you dont have enough funds");

        }
    }

    private final double  MIN_BAL=100;

    public Checking(String ac_name, String openDate, double balance, double interest_rate) {
        super(ac_name, openDate, balance, interest_rate);
    }


    @Override
    public void deposit(double amount) {
        balance+=(amount+(amount*0.01));
        System.out.println("deposite is made");
    }
}
