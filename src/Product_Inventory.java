
// Linked List to hold all the products
public class Product_Inventory<AnyType extends Product> {
    // reference to head node
    private Node head;
    // keeping track of total number of nodes
    private int count;

    // Product_Inventory constructor which generates an empty list
    Product_Inventory() {
        // creates a new empty list, so link head node to the first element
        // new node with no data
        head = new Node(null);
        count = 0;
    }


    // empties the linked list
    void makeEmpty() {
        // head points to null and hence the entire linked list is deleted by java's garbage collector
        head = null;
    }


    //Return the product when the user enters a ID, if list is null or product not found, will return null
    Node findID(int ID) {
        Node curr_node = head;


        // loop through the entire linked list until we find the correct ID,
        // if not found, we return null
        while (curr_node != null) {
            if (curr_node.getPayload().getID() == ID) {
                return (curr_node);
            }
            if (curr_node.getNext() != null) {
                curr_node = curr_node.getNext();
            } else {
                curr_node = null;
            }

        }
        // if we reach here, the product doesn't exist
        // or the head pointed to null(empty linked list)
        // and hence we return null
        return curr_node;

    }

    // insert at front of list or return false if that ID already exists
    boolean insertAtFront(AnyType x) {
        boolean not_found = false;

        if (findID(x.getID()) == null) {
            Node temp = head;
            Node add = new Node(x);
            head.setNext(add);
            add.setNext(temp.getNext());
            not_found = true;
        }


        return not_found;
    }

    /*

boolean insertAtFront(AnyType x);
AnyType deleteFromFront();	 // delete and return the record at the front of  the list or return       null if the list is empty
AnyType delete(int ID); 	// find and delete the record with the given ID or returns null if it isn’t found
void printAllRecords(); 	// print all elements in the order they appear in the linked list. if list is empty print appropriate message.
     */

}
