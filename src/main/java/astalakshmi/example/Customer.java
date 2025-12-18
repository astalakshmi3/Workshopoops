
package astalakshmi.example;

public class Customer {
    private int CustomerID;
    private String CustomerName;
    private String CustomerEmail;
    private String Address;

    public Customer(int customerID, String customerName, String customerEmail, String customerAddress) {
        this.CustomerID = customerID;
        this.CustomerName = customerName;
        this.CustomerEmail = customerEmail;
      //  this.Address = customerAddress;
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
    public void setCustomerAddress (String address) {
        Address = address;
    }
    public String getCustomerAddress() {
        return Address;
    }

}
