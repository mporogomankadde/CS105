package Revision;

public class Saving extends Account {
    private int w_times = 0;


    public Saving(String ac_name, String openDate, double balance, double interest_rate) {
        super(ac_name, openDate, balance, interest_rate);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withDrawal(double amount) {
        if (w_times > 6) {
            System.out.println("You have reached the max withdraw times");

        } else {
            balance -= amount;
            w_times++;
            System.out.println("your new balance is balance"+balance);

        }
    }
}

