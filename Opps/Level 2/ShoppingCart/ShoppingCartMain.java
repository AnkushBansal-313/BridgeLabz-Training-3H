package Basic-opps.Level 2.ShoppingCart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart item1 = new ShoppingCart("Shoes", 1500, 2);
        item1.displayDetails();
        item1.addItem(1);
        item1.removeItem(1);
        item1.displayDetails();
        
    }
}