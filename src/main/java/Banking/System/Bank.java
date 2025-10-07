package Banking.System;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>(100);

    }

    public boolean addBranch(String name) {

        Branch newBranch = findBranch(name);
        if (newBranch != null) {
            System.out.printf("A branch named %s already exists", name);
            System.out.println();
            return false;
        }

        newBranch = new Branch(name);
        return this.branches.add(newBranch);

    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }

        System.out.printf("No branch found with the name %s", branchName);
        System.out.println();

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {

        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;

    }

    public boolean listCustomers(String name, boolean printTransactions) {

        Branch branch = findBranch(name);

        if (branch == null) {
            return false;
        } else {

            System.out.printf("Customer details for branch %s", name);
            System.out.println();
            int custIndx = 1;

            for (Customer tempCustomer : branch.getCustomers()) {
                System.out.printf("Customer:%s[%d]", tempCustomer.getName(), custIndx);
                System.out.println();

                if (printTransactions && tempCustomer.getTransactions() != null) {
                    int transIndx = 1;
                    System.out.println("Transactions");

                    for (Double transaction : tempCustomer.getTransactions()) {
                        System.out.printf("[%d] Amount %.2f%n", transIndx, transaction);
                        transIndx++;
                    }
                }
                custIndx++;
            }

        }

        return true;
    }

    private Branch findBranch(String name) {

        if (name.isEmpty()) {
            return null;
        }

        for (Branch branch : this.branches) {

            if (branch.getName().equalsIgnoreCase(name)) {
                return branch;
            }
        }

        return null;
    }


}
