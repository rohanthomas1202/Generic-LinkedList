/*********************************************************************
 ** Name    - Rohan Sam Thomas                                      **
 ** UTDID   - RST170000                                             **
 ** Class   - CS 3345 - Data Structures and Algorithmic Analysis    **
 ** Date    - 2/28/2020                                             **
 ** JDK     - 11                                                    **
 ** IDE     - IntelliJ Idea                                         **
 *********************************************************************/

// product class keeps the information about individual product id's, names and suppliers
public class Product implements IDedObject {


    private int productID;
    private String productName;
    private String supplierName;


    // constructor for Product
    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }


    // overriding function getID() from interface IDed Object
    // function returns the ID of the current product
    @Override
    public int getID() {
        return productID;
    }


    // overriding the function printID() from interface IDedObject
    // function prints out details about the product
    @Override
    public void printID() {
        System.out.println("------------------------------------");
        System.out.println("Product ID   \t: " + productID);
        System.out.println("Product Name \t: " + productName);
        System.out.println("Supplier name\t: " + supplierName);
    }


    ///////////////////////// Getters and Setters /////////////////////////

    public int getProductID() {
        return productID;
    }


    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    ///////////////////////// Getters and Setters /////////////////////////

}
