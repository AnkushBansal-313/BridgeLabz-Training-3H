package Basic-opps.Level 2.ShoppingCart;

public class ShoppingCart {
    
    String itemName;
    double price;
    int quantity;
    ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added to the cart.");
    }
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in cart!");
        }
    }
    double totalCost() {
        return price * quantity;
    }
    void displayDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }
}