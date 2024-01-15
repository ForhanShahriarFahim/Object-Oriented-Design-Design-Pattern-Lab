class WarehouseProxy implements Warehouse {
    private RealWarehouse realWarehouse;

    @Override
    public void shipProduct(String product, int quantity) {
        if (realWarehouse == null) {
            this.realWarehouse = new RealWarehouse();
        }
        realWarehouse.shipProduct(product, quantity);
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (realWarehouse == null) {
            this.realWarehouse = new RealWarehouse();
        }
        realWarehouse.addProduct(product, quantity);
    }
}