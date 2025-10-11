package thembelani.java.tutorials.store.app;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return this.price * quantity;
    }

    public void printPricedItem(int quantity) {

        if (quantity < 1) {
            System.out.println("N/A");

        } else {
            System.out.printf("%2d x %s @ R%8.2f each = R%.2fn", quantity,
                    this.description.toUpperCase(),
                    this.price * quantity, this.price);
        }
    }

    public abstract void showDetails();
}
