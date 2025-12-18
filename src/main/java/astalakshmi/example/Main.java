package astalakshmi.example;


public class Main {
    static void main() {
        Customer anna = new Customer(1, "Anna", "anna@gmail.com");
        Product pro1 = new Product(1, "Notebook", 150.0);
        Product pro2 = new Product(2, "Pen", 80.0);
        Product pro3 = new Product(3, "Backpack", 200.0);
        Product pro4 = new Product(4, "Water Bottle", 500.0);
        Product pro5 = new Product(5, "Calculator", 400.0);
        Product pro6 = new Product(6, "Headphones", 500.0);
        Product pro7 = new Product(7, "Charger", 300.0);
        Product pro8 = new Product(8, "Mouse", 150.0);
        Product pro9 = new Product(9, "Planner", 400.0);
        Product pro10 = new Product(10,  "USB Cable", 200.0);
        Order order1 = new Order(1, anna);
        order1.addProduct(pro1);
        order1.addProduct(pro2);
        order1.addProduct(pro3);
        order1.addProduct(pro4);
        order1.addProduct(pro5);
        order1.addProduct(pro6);
        order1.addProduct(pro7);
        order1.addProduct(pro8);
        order1.addProduct(pro9);
        order1.addProduct(pro10);
        order1.getOrderDetails();

    }
}

