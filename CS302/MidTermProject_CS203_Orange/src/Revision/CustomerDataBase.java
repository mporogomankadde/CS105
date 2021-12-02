package Revision;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataBase {
    List<Customer> customers;

    public CustomerDataBase() {
        customers = new ArrayList<Customer>();
    }

    public void addCustomers(Customer customer) {
        customers.add(customer) ;
    }


    @Override
    public String toString() {
        return
                "\ncustomers=" + customers ;
    }
}
