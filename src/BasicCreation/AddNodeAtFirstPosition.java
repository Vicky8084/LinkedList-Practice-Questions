package BasicCreation;

import java.util.Scanner;

class  Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class AddNodeAtFirstPosition {

    //Reading Data to create a node by User
    public static int takeData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data :- ");
        int data=sc.nextInt();
        return data;
    }

    //Creating List
    public static Node2 createList(Node2 head, int data){
        Node2 nn=new Node2(data);
        if(head==null){
            return nn;
        }
        Node2 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;
    }

    //Adding Node at First Position
    public static Node2 addNodeAtFirstPosition(Node2 head){
        int data= takeData();
        Node2 nn=new Node2(data);
        if(head==null){
            return nn;
        }
        nn.next=head;
        head=nn;
        return head;
    }

    //printing LinkedList

    public static void printList(Node2 head){
        Node2 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit :- ");
        int n=sc.nextInt();
        Node2 head=null;
        for(int i=1;i<=n;i++){
            int data=takeData();
            head=createList(head,data);
        }
        System.out.println("Before Add Element at First Position ");
        printList(head);
        System.out.println("After Add Element at First Position ");
        head=addNodeAtFirstPosition(head);
        printList(head);
    }
}
