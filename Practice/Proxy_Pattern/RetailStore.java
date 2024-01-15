public class RetailStore {
    public static void main(String[] args) {
        Warehouse warehouse = new WarehouseProxy();

        warehouse.addProduct("Laptop", 50);
        warehouse.addProduct("Phone", 100);
        warehouse.addProduct("Tablet", 30);

        warehouse.shipProduct("Laptop", 2);
        warehouse.shipProduct("Phone", 5);
        warehouse.shipProduct("Tablet", 10);
        warehouse.shipProduct("Smartwatch", 3);
        warehouse.shipProduct("Tablet", 25);
        warehouse.shipProduct("PC", 25);
    }
}