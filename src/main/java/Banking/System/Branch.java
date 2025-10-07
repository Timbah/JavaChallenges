package Banking.System;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>(5000);
    }

    public boolean newCustomer(String name, double initialTransaction) {

        if (findCustomer(name) != null) {
            System.out.printf("A customer named %s already exists. Please use add transaction method", name);
            System.out.println();
            return false;
        }

        Customer newCustomer = new Customer(name, initialTransaction);
        this.customers.add(newCustomer);

        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {

        Customer customer = findCustomer(name);

        if (customer == null) {
            System.out.printf("Transaction could Not be added. No customer with the name %s exists", name);
            System.out.println();
            return false;
        }

        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name) {

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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
}
