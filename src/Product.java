public class Product implements IDedObject {


    private int productID;
    private String productName;
    private String supplierName;


    // overriding function getID() from interface IDed Object
    // function returns the ID of the current product
    @Override
    public int getID() {
        return productID;
    }

    // constructor for Product
    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
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


    ///////////////////////// Getters and Setters for  variables /////////////////////////

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

    ///////////////////////// Getters and Setters for  variables /////////////////////////

}
