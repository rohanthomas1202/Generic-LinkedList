/*********************************************************************
 ** Name    - Rohan Sam Thomas                                      **
 ** UTDID   - RST170000                                             **
 ** Class   - CS 3345 - Data Structures and Algorithmic Analysis    **
 ** Date    - 2/28/2020                                             **
 ** JDK     - 11                                                    **
 ** IDE     - IntelliJ Idea                                         **
 *********************************************************************/

import java.lang.management.PlatformLoggingMXBean;
import java.text.ParseException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product_Inventory<Product> inventory = new Product_Inventory<>();


        int user_val = -1;
        do {


            print_menu();

            // validating our string to make sure we receive an integer
            boolean pass = false;
            while(!pass){
                pass = true;
                System.out.print("Your choice: ");
                String input = sc.nextLine();
                try{
                    user_val = Integer.parseInt(input);

                }catch(NumberFormatException e){
                    System.out.println("ERROR!!! Input needs to be an integer !!!ERROR");
                    System.out.println("Enter an Integer");
                    pass = false;
                }
            }







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

                    int find = -100;

                    // validating our string to make sure we receive an integer
                    pass = false;
                    while(!pass){
                        pass = true;
                        System.out.print("Your choice: ");
                        String input = sc.nextLine();
                        try{
                            find = Integer.parseInt(input);

                        }catch(NumberFormatException e){
                            System.out.println("ERROR!!! Input needs to be an integer !!!ERROR");
                            System.out.println("Enter an Integer");
                            pass = false;
                        }
                    }


                    // if the id is not in the inventory or the inventory is empty, print the following
                    if (inventory.findID(find) == null) {
                        System.out.println("Given ID not in the inventory/ inventory empty");
                    } else {
                        System.out.println("Found the ID you entered");
                        System.out.println("Details:");
                        inventory.findID(find).printID();
                        //System.out.println("------------------------------------");
                        System.out.println("####################################");
                    }
                    break;
                case 3:
                    // case 3 inserts a product to the front of the inventory
                    int ins_ID = -100;
                    String ins_Pname;
                    String ins_Sname;






                    // validating our string to make sure we receive an integer
                    pass = false;
                    while(!pass){
                        pass = true;
                        System.out.print("Enter Product ID   \t: ");
                        String input = sc.nextLine();
                        try{
                            ins_ID = Integer.parseInt(input);

                        }catch(NumberFormatException e){
                            System.out.println("ERROR!!! Input needs to be an integer !!!ERROR");
                            System.out.println("Enter an Integer");
                            pass = false;
                        }
                    }

                    System.out.print("Enter Product Name \t: ");
                    ins_Pname = sc.nextLine();
                    System.out.print("Enter Supplier Name\t: ");
                    ins_Sname = sc.nextLine();

                    Product ins_product = new Product(ins_ID, ins_Pname, ins_Sname);
                    System.out.println("\nAdding Product...");
                    inventory.insertAtFront(ins_product);
                    System.out.println("Product Added to the front of Inventory");

                    break;
                case 4:
                    // case 4 removes the first product in the inventory
                    System.out.println("Removing the first item in the inventory...");
                    System.out.println("Deleting the following:");
                    Product del = inventory.deleteFromFront();
                    if (del != null){
                        del.printID();
                        //System.out.println("------------------------------------");
                        System.out.println("####################################");

                        System.out.println("First product in inventory cleared");
                    }else{
                        System.out.println("Cannot remove, Inventory is empty");
                    }



                    break;
                case 5:
                    // case 5 deletes a product given its ID



                    int rem_ID = -100;

                    // validating our string to make sure we receive an integer
                    pass = false;
                    while(!pass){
                        pass = true;
                        System.out.print("Enter Product ID to delete: ");
                        String input = sc.nextLine();
                        try{
                            rem_ID = Integer.parseInt(input);

                        }catch(NumberFormatException e){
                            System.out.println("ERROR!!! Input needs to be an integer !!!ERROR");
                            System.out.println("Enter an Integer");
                            pass = false;
                        }
                    }


                    Product del_ID = inventory.delete(rem_ID);

                    if (del_ID != null){
                        System.out.println("deleting details:");
                        del_ID.printID();
                        //System.out.println("------------------------------------");
                        System.out.println("####################################");

                        System.out.println("Deleted");
                    }else{
                        System.out.println("Cannot Delete " + rem_ID);
                    }



                    break;
                case 6:
                    // case 6 prints all the products in the current inventory
                    System.out.println("Printing Everything in inventory");
                    inventory.printAllRecords();

                    break;
                case 7:
                    // Case 7 exists out from the inventory once we finish updating it
                    // quits when user_val is checked in while loop
                    break;
                default:

                    System.out.println("Enter a valid number");
                    System.out.println("Accepted Range is 1 to 7");

                    break;
            }
            System.out.println("----------------------------------------------------------------------------");

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
