public class LinkedList {

    private Node head;
    private int size;

    private static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Removes the first matched object and
     * returns the position of the removed object
     * from the LinkedList.
     *
     * @param obj represents the object the user wants to remove
     * @return position of the removed object, or -1 if not found
     */
    public int remove(Object obj) {
        if (head == null) return -1;

        Node current = head;
        Node previous = null;
        int position = 0;

        while (current != null) {
            if ((current.data == null && obj == null) || (current.data != null && current.data.equals(obj))) {
                if (previous == null) {
                    // Removing the head
                    head = current.next;
                } else {
                    // Bypass the current node
                    previous.next = current.next;
                }
                size--;
                return position;
            }
            previous = current;
            current = current.next;
            position++;
        }

        return -1; // Object not found
    }

    /**
     * Removes the object given its position and
     * returns the removed object (not Node) from the LinkedList.
     *
     * @param position represents the position of the object to be removed
     * @return the item that was removed, or null if position is invalid
     */
    public Object remove(int position) {
        if (position < 0 || position >= size) return null;

        Node current = head;
        Node previous = null;
        Object removedData;

        if (position == 0) {
            // Removing the head
            removedData = head.data;
            head = head.next;
        } else {
            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.next;
            }
            // Remove the node
            removedData = current.data;
            previous.next = current.next;
        }

        size--;
        return removedData;
    }

    /**
     * Adds the object given its position in the LinkedList.
     *
     * @param obj      represents the object to be added
     * @param position represents the position of the object to be added in the LinkedList
     */
    public void add(Object obj, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        Node newNode = new Node(obj);

        if (position == 0) {
            // Insert at the head
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            // Insert in the middle or end
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    // Additional utility methods for testing (e.g., size, toString)
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
