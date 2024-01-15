import java.util.HashMap;

class RealWarehouse implements Warehouse {
    private HashMap<String, Integer> stock;

    public RealWarehouse() {
        stock = new HashMap<>();
    }

    @Override
    public void shipProduct(String product, int quantity) {
        if (stock.containsKey(product)) {
            if (stock.containsKey(product) && stock.get(product) >= quantity) {
                stock.put(product, stock.get(product) - quantity);
                System.out.println("Shipped " + quantity + " " + product + "(s)");
            } else {
                System.out.println("Sorry, " + product + " is out of stock.");
            }
        } else {
            System.out.println("Sorry, " + product + " is not available.");
        }
    }

    @Override
    public void addProduct(String product, int quantity) {
        stock.put(product, quantity);
    }
}