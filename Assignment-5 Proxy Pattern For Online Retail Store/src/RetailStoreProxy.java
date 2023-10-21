public class RetailStoreProxy implements OnlineRetailStore {
    private RealRetailStore realRetailStore;

    public RetailStoreProxy() {
        realRetailStore = new RealRetailStore();
    }

    @Override
    public void purchaseProduct(String product, int quantity) {
        // You can add additional logic here, such as checking user authentication, location, etc.
        realRetailStore.purchaseProduct(product, quantity);
    }
}
