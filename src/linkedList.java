public class linkedList {
    private Node head;

    public void practice(Node node) {
        this.head = head;
        head = null;
    }

    public int size() {
        int size = 1;
        if (head == null) return 0;
        Node tmp = head;
        while (tmp.next != null) {
            size++;
            tmp = tmp.next;
        }
        return size;
    }

    public void add(String str) {
        Node node = new Node();
        node.value = str;
        if (head != null) {
            node.next = head;
        }
        head = node;

    }

    public String get(int item) {
        Node tmp = head;
        if (item > size() - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }//1 08
        while (item > 0) {
            tmp = tmp.next;
            item--;
        }
        return tmp.value;
    }

    public void remove() {
        if (head != null) head = head.next;
    }

    @Override
    public String toString() {
        Node current = head;
        String str = "[ ";
        while (current != null) {
            str = str + current.value + " ";
            current = current.next;
        }
        str = str + "]";
        return str;
    }

    public linkedList reference() {
        linkedList reference = new linkedList();
        Node current = head;
        while (current != null) {
            reference.add(current.value);
            current = current.next;
        }
        return reference;

    }



    class Node {
        public String value;
        public Node next;
    }
}
