package thembelani.java.tutorials;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void printCustomers() {
        Iterator<Customer> iterator2 = this.customers.iterator();
        int indx = 1;
        while (iterator2.hasNext()) {
            System.out.println(indx + ". Name: " + iterator2.next().getName().toUpperCase());
        }
    }

    public void printStatement(String name) {

        System.out.println("-".repeat(10) + "Statement Of Transactions" + "-".repeat(10));
        System.out.println("Customer Name: " + name.toUpperCase());

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                for (Double amount : customer.transactions) {
                    System.out.println("Amount: " + amount);
                }
            }
        }

        System.out.println("-".repeat(50) + "End" + "-".repeat(50));
    }

    public boolean addTransaction(String name, double amount) {
        Customer tempCustomer = findCustomer(name);

        if (tempCustomer == null) {
            return false;
        }

        return tempCustomer.addTransaction(amount);

    }

    public boolean addCustomer(Customer customer) {

        if (findCustomer(customer.getName()) == null) {
            return this.customers.add(customer);
        }
        return false;
    }

    public boolean addCustomer(String name) {

        if (findCustomer(name) == null) {
            return this.customers.add(new Customer(name));

        }
        return false;
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

        System.out.printf("Customer (%s) was not found %n",name);
        return null;
    }
}
