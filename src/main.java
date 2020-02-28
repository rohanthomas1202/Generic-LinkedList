import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int product_ID = 0;
        String product_name = "roku";
        String product_supplier = "Amz";
/*
        System.out.println("Enter product_ID");
        product_ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product_name");
        product_name = sc.nextLine();
        System.out.println("Enter product_supplier");
        product_supplier = sc.nextLine();
*/

/* TEST*/
        boolean a;
        boolean s;
        boolean d;
        boolean f;
        boolean g;
        boolean h;


        Product q = new Product(product_ID + 1, product_name, product_supplier);
        Product w = new Product(product_ID + 2, product_name, product_supplier);
        Product e = new Product(product_ID + 3, product_name, product_supplier);
        Product r = new Product(product_ID + 4, product_name, product_supplier);
        Product t = new Product(product_ID + 5, product_name, product_supplier);
        Product y = new Product(product_ID + 6, product_name, product_supplier);

        Product_Inventory<Product> inventory = new Product_Inventory<>();
        a = inventory.insertAtFront(q);
        s = inventory.insertAtFront(w);
        d = inventory.insertAtFront(e);
        f = inventory.insertAtFront(r);
        g = inventory.insertAtFront(t);
        h = inventory.insertAtFront(y);

        System.out.println("can add " + q.getID() + " ? : " + a);
        System.out.println("can add " + w.getID() + " ? : " + s);
        System.out.println("can add " + e.getID() + " ? : " + d);
        System.out.println("can add " + r.getID() + " ? : " + f);
        System.out.println("can add " + t.getID() + " ? : " + g);
        System.out.println("can add " + y.getID() + " ? : " + h);

        inventory.delete(5);
        inventory.deleteFromFront();

        inventory.printAllRecords();

        inventory.makeEmpty();



    }
}
