package Revision;

import java.util.ArrayList;
import java.util.List;

public class Customer {
     private String name;
     private String Dob;
     private List<Account> accounts=new ArrayList<Account>();;

     public Customer(String name, String dob) {
          this.name = name;
          Dob = dob;
     }

     public void addAccounts(Account acc) {
          accounts.add(acc);
     }

     public List<Account> getAccounts() {
          return accounts;
     }

     @Override
     public String toString() {
          return
                  "name= " + name  +
                  " Dob= " + Dob ;
     }
}
