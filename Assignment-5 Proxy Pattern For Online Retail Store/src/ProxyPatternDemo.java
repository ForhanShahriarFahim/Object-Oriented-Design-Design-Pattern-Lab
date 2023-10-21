public class ProxyPatternDemo {
    public static void main(String[] args) {
        OnlineRetailStore retailStore = new RetailStoreProxy();

        retailStore.purchaseProduct("ProductA", 5); // Proxy forwards the request to the real store
        retailStore.purchaseProduct("ProductB", 10);
        retailStore.purchaseProduct("ProductC", 2); // ProductC doesn't exist in the warehouse
    }
}
