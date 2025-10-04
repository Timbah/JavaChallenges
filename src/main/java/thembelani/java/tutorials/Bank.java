package thembelani.java.tutorials;

import java.util.ArrayList;

//The bank should add a new customer, if they're not yet already in the list
//The bank class should allow customers to add a transaction, to an existing Customer.
//This class should also print a statement, that includes the customer name, and the transaction amounts. This method should use unboxing

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer tempCustomer = findCustomer(name);

        if (tempCustomer == null) {
            return false;
        }

        return tempCustomer.addTransaction(amount);

    }

    public Customer findCustomer(String name) {

        if (name.isEmpty()) {
            return null;
        }

        for (Customer customer : this.customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }

        return null;
    }
}
