/*********************************************************************
 ** Name    - Rohan Sam Thomas                                      **
 ** UTDID   - RST170000                                             **
 ** Class   - CS 3345 - Data Structures and Algorithmic Analysis    **
 ** Date    - 2/28/2020                                             **
 ** JDK     - 11                                                    **
 ** IDE     - IntelliJ Idea                                         **
 *********************************************************************/

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product_Inventory<Product> inventory = new Product_Inventory<>();


        int user_val = -1;
        do {


            print_menu();
            System.out.print("Your choice: ");
            user_val = Integer.parseInt(sc.nextLine());


            switch (user_val) {
                case 1:
                    // case 1 will clear the linked list
                    System.out.println("Clearing Inventory...");
                    inventory.makeEmpty();
                    System.out.println("Inventory Cleared");
                    break;
                case 2:
                    //case 2 finds a product given its ID
                    System.out.print("Enter the id you want to find in your inventory:");
                    int find = Integer.parseInt(sc.nextLine());
                    if (inventory.findID(find) == null) {
                        System.out.println("Given ID not in the inventory/ inventory empty");
                    } else {
                        System.out.println("Found the ID you entered");
                        System.out.println("Details:");
                        inventory.findID(find).printID();
                        System.out.println("------------------------------------");
                    }
                    break;
                case 3:
                    // case 3 inserts a product to the front of the inventory
                    int ins_ID;
                    String ins_Pname;
                    String ins_Sname;
                    System.out.print("Enter Product ID   \t: ");
                    ins_ID = Integer.parseInt(sc.nextLine());
                    System.out.print("\nEnter Product Name \t: ");
                    ins_Pname = sc.nextLine();
                    System.out.print("\nEnter Supplier Name\t: ");
                    ins_Sname = sc.nextLine();

                    Product ins_product = new Product(ins_ID, ins_Pname, ins_Sname);
                    System.out.println("\nAdding Product...");
                    inventory.insertAtFront(ins_product);
                    System.out.println("Product Added to the front of Inventory");

                    break;
                case 4:
                    // case 4 removes the first product in the inventory


                    break;
                case 5:
                    // case 5 deletes a product given its ID


                    break;
                case 6:
                    // case 6 prints all the products in the current inventory


                    break;
                case 7:
                    // Case 7 exists out from the inventory once we finish updating it


                    break;
                default:

                    System.out.println("Enter a valid number");
                    System.out.println("Accepted Range is 1 to 7");

                    break;
            }


        } while (user_val != 7);
    }

    public static void print_menu() {
        System.out.println("Operations on List");
        System.out.println("\t1. Make Empty");
        System.out.println("\t2. Find ID");
        System.out.println("\t3. Insert At Front");
        System.out.println("\t4. Delete From Front");
        System.out.println("\t5. Delete ID");
        System.out.println("\t6. Print all Records");
        System.out.println("\t7. Done");
    }

}
