public class Product implements IDedObject{



    private int productID;
    private String productName;
    private String supplierName;


    @Override
    public int getID() {
        return productID;
    }

    @Override
    public void printID() {

    }
}
