package Lab8;


public  class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding products to inventory
        manager.addProduct(new Product(1, "Product A", 10.99, 50));
        manager.addProduct(new Product(2, "Product B", 15.49, 30));

        // Displaying inventory
        manager.displayInventory();

        // Updating quantity of a product
        manager.updateQuantity(1, 60);

        // Removing a product
        manager.removeProduct(2);

        // Searching for a product by ID
        manager.searchProductById(1);

        // Calculating total value of inventory
        System.out.println("Total inventory value: $" + manager.calculateTotalValue());
    }
}


