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
