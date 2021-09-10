public class Queue {
    public static void main (String[] args){
        DoubleLinkedList List=new DoubleLinkedList();
        List.insertFirst(5);
        List.enqueue(8);
        List.enqueue(3);
        List.enqueue(12);
        List.enqueue(0);
        List.enqueue(89);
        List.enqueue(77);
        List.dequeue();
        List.dequeue();
        List.dequeue();
        List.printNodes();
    }//Como se da un dequeue 3 veces esto hace que los primeros 3 elementos de la lista se desencolen y no aparezcan entonces la lsita final debe de ser 12,0,89,77
}
