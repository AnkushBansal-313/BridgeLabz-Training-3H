package Item;
public class Item {
    int itemCode;
    String itemName;
    double price;
    Item(int itemCode,String itemName,double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    void displayItemDetails(){
        System.out.println("Item Code: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Item Price: "+price);
    }
    double totalPrice(int quantity){
        return price*quantity;
    }
    
}