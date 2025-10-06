package thembelani.java.tutorials;

import java.util.ArrayList;

public class Customer {

    private String name;
    protected ArrayList<Double> transactions;

    //A customer's transaction can be a credit, which mean a positive amount, or it can be a debit, a negative amount.

    public Customer(String name) {
        this.name = name.toUpperCase();
        this.transactions = new ArrayList<>();
    }

    public boolean addTransaction(double amount) {
        if (amount == 0) {
            return false;
        }
        this.transactions.add(amount);
        return true;
    }

    public String getName() {
        return name;
    }
}
