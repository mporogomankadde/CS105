package Revision;

public class Bank {
    public static void main(String[] args) {

        Customer c1= new Customer("Ronnie","03/91");
        Customer c2= new Customer("Feven","03/95");

        Saving s1= new Saving("savings","04/18",450,0.2);
        Saving s2= new Saving("savings","04/20",600,0.1);

        Checking ch1= new Checking("checking","02/21",300,0.12);
        Checking ch2= new Checking("checking","08/19",200,0.1);

        c1.addAccounts(s1);
        c1.addAccounts(ch1);
        c2.addAccounts(s2);
        c2.addAccounts(ch2);
     // Account acc= new Account();
        CustomerDataBase cdb= new CustomerDataBase();

        cdb.addCustomers(c1);
        cdb.addCustomers(c2);



        System.out.println(cdb.customers);
        ch1.withDrawal(250.0);
         ch1.deposit(500);

        System.out.println(s1.calculateInterest(5));
        System.out.println(ch1.calculateInterest(4));
        System.out.println(ch2.calculateInterest(5));
    }

}
