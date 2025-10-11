package thembelani.java.tutorials.store.app;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new Bread("Brown", 12.50, "Albany"));
        storeProducts.add(new Bread("White", 14.50, "Sasko"));

        listProducts();
    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }


}
