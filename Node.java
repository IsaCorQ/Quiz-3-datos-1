public class Node {
    public Integer data;
    public Node next;
    public Node previous;

    public Node(Integer data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next=next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
