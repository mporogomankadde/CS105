package Revision;

public class Account {
    private String ac_name;
    private String openDate;
    double balance;
     double interest_rate;

    public Account(String ac_name, String openDate, double balance, double interest_rate) {
        this.ac_name = ac_name;
        this.openDate = openDate;
        this.balance = balance;
        this.interest_rate = interest_rate;
    }
//    public Account() {
//        ac_name = "ac_name1";
//        openDate = "openDate1";
//        balance = 0.0;
//        interest_rate = 0.0;
//    }

    public String getAc_name() {
        return ac_name;
    }

    public String getOpenDate() {
        return openDate;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void deposit(double amount){ }
    public void withDrawal(double amount){ }
    public double calculateInterest( int time){
        return (balance*time*interest_rate)/100;
    }

    @Override
    public String toString() {
        return "Account " +
                "\nac_name= " + ac_name  +
                "\nopenDate= " + openDate +
                "\nbalance= " + balance +
                "\n interest_rate=" + interest_rate ;
    }
}
