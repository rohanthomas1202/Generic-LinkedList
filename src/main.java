import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        int product_ID;
        String product_name;
        String product_supplier;

        System.out.println("Enter product_ID");
        product_ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product_name");
        product_name = sc.nextLine();
        System.out.println("Enter product_supplier");
        product_supplier = sc.nextLine();



        boolean x;


        Product p = new Product(product_ID,product_name,product_supplier);

        Product_Inventory<Product> inventory = new Product_Inventory<>();
        x = inventory.insertAtFront(p);
        p.printID();


        System.out.println(x);

    }
}
