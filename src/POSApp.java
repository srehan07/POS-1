import java.util.HashMap;
import java.util.Iterator;
import model.Item;
import controller.ItemManager;
import controller.ShoppingCart;

public class POSApp {

 public static void main(String[] args) {
  ItemManager itemManager = new ItemManager();
  HashMap<String, Item> itemMap = itemManager.getAllItems();

  Iterator<String> iterator = itemMap.keySet().iterator();

  System.out.println("-----List of Available Items------[Item#, Description, Price, Currency]\n");

  while (iterator.hasNext()) {
   Item item = itemMap.get(iterator.next()); 
   System.out.println(item.printStatus());
  }

  System.out.println("\n\n - - - - - - - - - - - - - - -");

  ShoppingCart cart = new ShoppingCart();
  cart.start();
  cart.checkOut();

  System.out.println("Thank you for Shoping ");
 }
}