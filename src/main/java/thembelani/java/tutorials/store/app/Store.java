package thembelani.java.tutorials.store.app;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {

}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new Bread("Brown", 12.50, "Albany"));
        storeProducts.add(new Bread("White", 14.50, "Sasko"));

        listProducts();

        ArrayList<OrderItem> order = new ArrayList<>();
        addItemToOrder(order,0,1);
        addItemToOrder(order,1,5);

        printOrder(order);
    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {

        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }

        System.out.printf("Sales Total = R%6.2f %n",salesTotal);
    }
}
