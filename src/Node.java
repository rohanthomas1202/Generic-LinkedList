/*********************************************************************
 ** Name    - Rohan Sam Thomas                                      **
 ** UTDID   - RST170000                                             **
 ** Class   - CS 3345 - Data Structures and Algorithmic Analysis    **
 ** Date    - 2/28/2020                                             **
 ** JDK     - 11                                                    **
 ** IDE     - IntelliJ Idea                                         **
 *********************************************************************/
// class which holds the Product information and also the address to the next node
public class Node {

    // payload holds the Product class
    private Product payload;
    // singly linked list, so one pointer to go forward
    private Node next;


    // constructors accessors and mutators
    public Node() {
        payload = null;
        next = null;

    }

    public Node(Product payload) {
        this.payload = payload;
    }

    ///////////////////////// Getters and Setters for  variables /////////////////////////

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Product getPayload() {
        return payload;
    }

    public void setPayload(Product payload) {
        this.payload = payload;
    }

    ///////////////////////// Getters and Setters for  variables /////////////////////////


}
