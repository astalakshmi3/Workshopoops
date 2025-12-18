
package astalakshmi.example;

public class Customer {
    private int CustomerID;
    private String CustomerName;
    private String CustomerEmail;


    public Customer(int customerID, String customerName, String customerEmail) {
        this.CustomerID = customerID;
        this.CustomerName = customerName;
        this.CustomerEmail = customerEmail;
    }
    public int getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }
}
