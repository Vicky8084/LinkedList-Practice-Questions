package BasicCreation;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListCreation {

    //printing the LinkedList.......
    public static void printLinkedList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(3);
        head.next.next=new Node(7);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(4);
        printLinkedList(head);
    }
}
