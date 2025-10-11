package thembelani.java.tutorials.store.app;

public class Bread extends ProductForSale {
    public enum BreadTypes {
        BROWN, WHITE
    }

    private String breadType;

    public Bread(String breadType) {
        super("Bread", BreadTypes.BROWN.toString().equals(breadType.toUpperCase()) ? 12.50 : 14.00, breadType.toUpperCase());
        this.breadType = breadType.toUpperCase();
    }

    @Override
    public void showDetails() {

        System.out.println(this.breadType);
    }


}
