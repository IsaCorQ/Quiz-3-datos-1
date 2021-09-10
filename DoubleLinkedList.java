public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head= new Node(null,null,null);
        tail=new Node(null,null,null);
        head.setNext(tail);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public void insertFirst(int data) {
        insertMiddle(data,head,head.getNext());
    }

    private void insertMiddle(int data,Node before,Node follow){
      Node newNode= new Node(data,before,follow);
      before.setNext(newNode);
      follow.setPrevious(newNode);
      size++;
    }

    public void enqueue(int data){
        insertMiddle(data,tail.getPrevious(),tail);
    }

    public Integer dequeue(){
        if (isEmpty()){
            return null;
        }
        return erase(head.getNext());
    }

    public Integer eraseLast(){
        if (isEmpty()){
            return null;
        }
        return erase(tail.getPrevious());
    }

    private int erase(Node node){
        Node before=node.getPrevious();
        Node follow=node.getNext();
        before.setNext(follow);
        follow.setPrevious(before);
        size--;
        return  node.getData();
    }

    public void printNodes(){
        if (isEmpty()){
            System.out.println("");
        }
        else{
            Node beggining=head.getNext();
            while (beggining!=tail){
                System.out.print(beggining.getData()+"\n");
                beggining=beggining.getNext();
            }
        }
    }
}
