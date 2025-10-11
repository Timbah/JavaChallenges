package thembelani.java.tutorials.store.app;

public class Bread extends ProductForSale {

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("This " + super.type + " is a fresh loaf of bread");
        System.out.printf("The price of one bread is %8.2f %n", super.price);
        System.out.println(super.description);
    }


}
