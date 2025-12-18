package astalakshmi.example;

import java.util.ArrayList;

public class Order {
    private final int OrderID;
    private final Customer customer;
    private final ArrayList<Product> products;

    public Order(int orderID, Customer customer) {
        this.OrderID = orderID;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderID() {
        return OrderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProduct() {
        return products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public String calculateTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getProductPrice();
        }
        return "The Total Amount :" + total;
    }
    public void getOrderDetails() {

        System.out.println("Order ID: " + OrderID);
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Email: " + customer.getCustomerEmail());
        System.out.println("Total Products:" + products.size());
        System.out.println("Products in the Order:");
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + ": " + product.getProductPrice());
        }
        System.out.println( calculateTotalPrice());
    }
}
