import java.util.HashMap;
import java.util.Map;

public class RealRetailStore implements OnlineRetailStore {
    private Map<String, Integer> warehouse;

    public RealRetailStore() {
        warehouse = new HashMap<>();
        warehouse.put("ProductA", 100);
        warehouse.put("ProductB", 50);
    }

    @Override
    public void purchaseProduct(String product, int quantity) {
        if (warehouse.containsKey(product) && warehouse.get(product) >= quantity) {
            System.out.println(quantity + " units of " + product + " purchased.");
            warehouse.put(product, warehouse.get(product) - quantity);
        } else {
            System.out.println("Sorry, " + product + " is out of stock.");
        }
    }
}
