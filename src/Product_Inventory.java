
// Linked List to hold all the products
public class Product_Inventory<AnyType extends Product> {

    // reference to head node
    // head's payload will always point to null
    // just using head to point to the linked list
    private Node head;


    // Product_Inventory constructor which generates an empty list
    Product_Inventory() {
        // creates a new empty list, so link head node to the first element
        // new node with no data
        head = new Node(null);

    }


    // empties the linked list
    void makeEmpty() {
        // head points to null and hence the entire linked list is deleted by java's garbage collector
        head = null;
    }


    //Return the product when the user enters a ID, if list is null or product not found, will return null
    AnyType findID(int ID) {
        Node curr_node = head.getNext();

        // loop through the entire linked list until we find the correct ID,
        // if not found, we return null
        while (curr_node != null && curr_node.getPayload() != null) {
            if (curr_node.getPayload().getID() == ID) {
                return ((AnyType) curr_node.getPayload());
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
        return null;

    }

    // insert at front of list or return false if that ID already exists
    boolean insertAtFront(AnyType x) {
        boolean not_found = false;

        if (findID(x.getID()) == null) {
            Node temp = head.getNext();
            Node add = new Node(x);
            head.setNext(add);
            add.setNext(temp);
            not_found = true;
        }


        return not_found;
    }

    /*

AnyType deleteFromFront();	 // delete and return the record at the front of  the list or return       null if the list is empty
AnyType delete(int ID); 	// find and delete the record with the given ID or returns null if it isn’t found
void printAllRecords(); 	// print all elements in the order they appear in the linked list. if list is empty print appropriate message.
     */


    void delete_node(Node pre, Node curr){
        // delete a node given current and previous nodes

        // set the previous node to point to the node after current
        pre.setNext(curr.getNext());
        // set current's next node to be null, to delete node
        curr.setNext(null);

    }
}
