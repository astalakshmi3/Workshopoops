

# ONLINE SHOP - WORKSHOP

### This project is a simple online shop simulation created to practice Object-Oriented Programming (OOP) concepts in Java.

### The system models:

- Customers who place orders

- Orders that contain products

- Products with individual prices

### The main goal of the system is to calculate the total price of an order by summing the prices of all products in that order.

## UML Class Diagram (Conceptual)
## classDiagram

```mermaid
classDiagram
class Customer {
-id:int
-name:String
-email:String
}

    class Product {
        -id:int
        -name:String
        -price:double
    }

    class Order {
        -id:int
        -totalPrice:double
    }

    Order "0..*" --> "1" Customer : belongsTo
    Order "1" --> "1..*" Product : contains
 ```
### Classes and Attributes:
- **Customer**: Represents a customer with attributes like id, name, and email.
- **Product**: Represents a product with attributes like id, name, and price.
    - **Order**: Represents an order with attributes like id and totalPrice.
    - **Relationships**:
    - An Order is associated with one Customer.
    - An Order can contain multiple Products.
    - **Methods**:
    - In the Order class, implement a method to calculate the total price of the order by summing the prices of all products in that order.


## Created new branch for online shop workshop

### Branch name "address" created and pushed to remote repository.
### Created new branch for online shop workshop.

