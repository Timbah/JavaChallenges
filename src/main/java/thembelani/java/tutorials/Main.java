package thembelani.java.tutorials;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank bank1 = new Bank("FNB");

        bank1.addCustomer("Thembelani");
        bank1.addCustomer("Sinethemba");
        bank1.printCustomers();

        bank1.addTransaction("thembelani", 10000);
        bank1.addTransaction("Thembelani", -400);
        bank1.addTransaction("Thembelani", -100);

        bank1.addTransaction("Sinethemba", 50000);
        bank1.addTransaction("sinethEmba", -4000);
        bank1.addTransaction("sinethEmba", 1000);

        bank1.printStatement("THEMBELANI");
        bank1.printStatement("sinethemba");

        bank1.addTransaction("Joehn", 1000);

    }
}