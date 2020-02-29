/*********************************************************************
 ** Name    - Rohan Sam Thomas                                      **
 ** UTDID   - RST170000                                             **
 ** Class   - CS 3345 - Data Structures and Algorithmic Analysis    **
 ** Date    - 2/28/2020                                             **
 ** JDK     - 11                                                    **
 ** IDE     - IntelliJ Idea                                         **
 *********************************************************************/
// Linked List to hold all the products
public class Product_Inventory<AnyType extends Product> {

    // reference to head node
    // head's payload will always point to null
    // just using head to point to the linked list
    private Node head;


    // Product_Inventory constructor which generates an empty list
    public Product_Inventory() {
        // creates a new empty list, so link head node to the first element
        // new node with no data
        head = new Node(null);

    }

    // overloaded constructor
    public Product_Inventory(Node head) {
        this.head = head;
    }


    // empties the linked list
    void makeEmpty() {
        // head points to null and hence the entire linked list is deleted by java's garbage collector
        head.setNext(null);
    }


    //Return the product when the user enters a ID, if list is null or product not found, will return null
    AnyType findID(int ID) {
        if (head == null){
            return null;
        }
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

        // if the element is not int the linked list, add it
        if (findID(x.getID()) == null) {
            if (head.getNext() == null){

                Node add = new Node(x);
                head.setNext(add);
                not_found = true;

            }else {
                Node temp = head.getNext();
                Node add = new Node(x);
                head.setNext(add);
                add.setNext(temp);
                not_found = true;
            }
        }


        // return if the element was added(true) or not(false)
        return not_found;
    }


    // delete and return the record at the front of  the list or return null if the list is empty
    AnyType deleteFromFront() {

        // node to be deleted will be the one after head and head will be pre_node for this function
        Node pre_node = head;
        Node curr_node = head.getNext();
        if (curr_node == null){
            return null;
        }else {
            // calling delete function to delete the first node
            delete_node(pre_node, curr_node);

            // returning the value in deleted node
            return (AnyType) curr_node.getPayload();
        }
    }


    // find and delete the record with the given ID or returns null if it isn’t found
    AnyType delete(int ID) {
        // if ID is present, then findID will return the payload, else will return null
        if (findID(ID) != null) {
            Node pre_node = head;
            Node curr_node = head.getNext();
            if (curr_node == null){
                return null;
            }
            if (curr_node.getNext() == null){
                return null;
            }
            while (true) {
                if (curr_node.getPayload().getID() == ID) {
                    delete_node(pre_node, curr_node);
                    return (AnyType) (curr_node.getPayload());
                }
                pre_node = curr_node;
                curr_node = curr_node.getNext();

            }
        }
        return null;
    }


    // print all elements in the order they appear in the linked list. if list is empty print appropriate message.
    void printAllRecords() {
        // node to print
        Node curr_node = head.getNext();
        // if linked list is empty, do not enter loop
        if (curr_node == null) {
            System.out.println("Inventory Empty!!! Restock !!!");
        }
        // loop until we reach end of the linked list
        while (curr_node != null) {
            // printing values of the linked list
            curr_node.getPayload().printID();
            // current node points to the next node
            curr_node = curr_node.getNext();
        }
        //System.out.println("------------------------------------");
        System.out.println("####################################");

    }


    // delete a node given current and previous nodes
    private void delete_node(Node pre, Node curr) {
        // set the previous node to point to the node after current
        pre.setNext(curr.getNext());
        // set current's next node to be null, to delete node
        curr.setNext(null);

    }

    ///////////////////////// Getters and Setters /////////////////////////
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    ///////////////////////// Getters and Setters /////////////////////////

}
