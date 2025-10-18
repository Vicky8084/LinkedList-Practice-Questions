package BasicCreation;

import java.util.Scanner;

class Node3{
    int data;
    Node3 next;
    public Node3(int data){
        this.data=data;
        this.next=null;
    }
}
public class AddNodeAtLastPosition {

    //takin input from the User
    public static int takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Data :- ");
        int data=sc.nextInt();
        return data;
    }

    //Creating List
    public static Node3 createLinkedList(Node3 head,int data){
        Node3 nn=new Node3(data);
        if(head==null){
            return nn;
        }
        Node3 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;
    }

    //Adding Element at Last Position
    public static Node3 addNodeAtLastPosition(Node3 head){
        int data=takeInput();
        Node3 nn=new Node3(data);
        if(head==null){
            return nn;
        }
        Node3 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;
    }

    //printing the List
    public static void printLinkedList(Node3 head){
        Node3 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of LinkedList :- ");
        int n=sc.nextInt();
        Node3 head=null;
        for(int i=1;i<=n;i++){
            int data=takeInput();
            head=createLinkedList(head,data);
        }
        System.out.print("Before Adding Element at Last Node :- ");
        printLinkedList(head);
        System.out.print("\nAfter Adding Element at Last Node \n");
        head=addNodeAtLastPosition(head);
        printLinkedList(head);
    }
}
