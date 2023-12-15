package Lab8;


import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
private List<Product> inventory;

public InventoryManager() {
        this.inventory = new ArrayList<>();
        }

public void addProduct(Product product) {
        inventory.add(product);
        }

public void displayInventory() {
        for (Product product : inventory) {
        System.out.println("Product ID: " + product.getProductId() +
        ", Name: " + product.getProductName() +
        ", Price: $" + product.getPrice() +
        ", Quantity: " + product.getQuantity());
        }
        }

public void updateQuantity(int productId, int newQuantity) {
        for (Product product : inventory) {
        if (product.getProductId() == productId) {
        product.setQuantity(newQuantity);
        return;
        }
        }
        System.out.println("Product with ID " + productId + " not found.");
        }

public void removeProduct(int productId) {
        for (Product product : inventory) {
        if (product.getProductId() == productId) {
        inventory.remove(product);
        System.out.println("Product with ID " + productId + " removed.");
        return;
        }
        }
        System.out.println("Product with ID " + productId + " not found.");
        }

public void searchProductById(int productId) {
        for (Product product : inventory) {
        if (product.getProductId() == productId) {
        System.out.println("Product ID: " + product.getProductId() +
        ", Name: " + product.getProductName() +
        ", Price: $" + product.getPrice() +
        ", Quantity: " + product.getQuantity());
        return;
        }
        }
        System.out.println("Product with ID " + productId + " not found.");
        }

public double calculateTotalValue() {
        double totalValue = 0;
        for (Product product : inventory) {
        totalValue += (product.getPrice() * product.getQuantity());
        }
        return totalValue;
        }
        }

