
public class RemoveFromList {

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.append(new Node("5"));
        ls.append(new Node("10"));
        ls.append(new Node("8"));

        ls.removeElement(2);
        System.out.println(ls.toString());
        System.out.println(ls.listSize());
    }
}

class LinkedList {

    Node firstNode;
    Node current;

    public void append(Node newNode) {
        if (isEmpty()) {
            this.firstNode = newNode;
            this.current = this.firstNode;
        } else {
            this.current.setNext(newNode);
            newNode.setPrev(this.current);
            this.current = this.current.next;
        }
    }

    public String toString() {
        String text = "Linked List: ";
        Node current = this.firstNode;
        while (current != null) {
            text += "  <--> "+current.value;
            current = current.next;
        }
        return text;
    }

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public int listSize() {
        Node current = this.firstNode;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }
    public void removeElement(int index) {
        Node current = this.firstNode;
        int counter = 0;
        while (current != null) {
            counter++;
            if (counter == index) {
                if (current.prev!=null) {
                    current.prev.setNext(current.next);
                }
                if (current.next != null) {
                    current.next.setPrev(current.prev);
                }
                return;
            }
            current = current.next;
        }
    }
}

class Node {
    Object value;
    Node next;
    Node prev;

    public Node(Object value) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public void setNext(Node e) {
        this.next = e;
    }

    public void setPrev(Node e) {
        this.prev = e;
    }
}
