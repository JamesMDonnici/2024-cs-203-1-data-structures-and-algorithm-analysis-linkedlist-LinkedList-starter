
class Node {
    Object obj;
    Node next;

    public Node() {
        obj = null;
    }

    public Node(Object obj) {
        this.obj = obj;
    }

    public String toString() {
        return obj.toString();
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = tail = null;
    }

    /**
     * This method returns the print representation of the list.
     * 
     * @return the print representation of the list.
     */
    public String toString() {
        String out = "";
        for (Node n = head; n != null; n = n.next)
            out += n.obj + " ";

        return out;
    }

    /**
     * This method returns the number of elements in this list.
     * 
     * @return the number of elements in this list.
     */
    public int size() {
        return size;
    }

    /**
     * This method adds an Object to the end of the LinkedList.
     * 
     * @param obj it can be of any type - super cool stuff.
     */
    public void add(Object obj) {
        Node node = new Node(obj);
        
        if (head == null && tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    /**
     * The method returns the found object based on the passed index.
     * It throws an Exception saying that you messed up, and you gotta fix it.
     * Starts at 0 but supports negatives and wraps the index around within
     * the limits of the list.
     * 
     * @param index the index of the object to be returned.
     * @return the object at the index.
     */
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.obj;
    }
    
    public static void main(String[] args) {
        LinkedList vitaly = new LinkedList();
        vitaly.add(13);
        vitaly.add(73);
        vitaly.add(95);
        vitaly.add(2);
        System.out.println(vitaly.get(4));

        System.out.println(vitaly);

     }
}
