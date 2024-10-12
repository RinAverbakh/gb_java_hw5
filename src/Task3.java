import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();

        basket.addProduct("apple", 3);
        basket.addProduct("banana", 2);
        basket.addProduct("apple", 5);

        System.out.println("Basket after adding products:");
        basket.showBasket();

        basket.removeProduct("banana");
        System.out.println("Basket after removing 'banana':");
        basket.showBasket();
        
        basket.updateQuantity("apple", 10);
        System.out.println("Basket after updating quantity of 'apple':");
        basket.showBasket();

    }
}

class ShoppingBasket {
    private HashMap<String, Integer> basket = new HashMap<>();

    public void addProduct(String product, Integer quantity) {
        if (basket.containsKey(product)) basket.put(product, basket.get(product) + quantity);
        else basket.put(product, quantity);
    }

    public void removeProduct(String product) {
        basket.remove(product);
    }

    public void updateQuantity(String product, Integer quantity) {
        if (basket.containsKey(product)) basket.put(product, quantity);
        return;
    }

    public int checkProduct(String product) {
        return basket.getOrDefault(product, 0);
    }

    public void showBasket() {
        System.out.println(basket.entrySet());
    }
}
