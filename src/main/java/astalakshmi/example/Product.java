package astalakshmi.example;

public class Product {
    private int ProductID;
    private String ProductName;
    private double ProductPrice;
    public Product (int productID, String productName, double productPrice) {
        this.ProductID = productID;
        this.ProductName = productName;
        this.ProductPrice = productPrice;
    }
    public int getProductID() {
        return ProductID;
    }
    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

}
