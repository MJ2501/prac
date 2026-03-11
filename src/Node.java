public class Node {
    // Properties 
    Node next;
    int data;

    // Methods

    // Constructors
    public Node(int newData){
        data = newData;
        next = null;
    }
    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }

    // Getters and Setters
}
